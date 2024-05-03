import argparse
import fnmatch
import json
import os
import re
from pathlib import Path
from enum import Enum

class Dataset(Enum):
    BUGSWARM = "BugSwarm"

BUGSWARM_SET = set()

def read_dataset_files():
    global BUGSWARM_SET
   
    if os.path.exists("Export.json"):
        print("Export.json found.")
        with open("Export.json") as file:
            BugSwarm_json = json.load(file)
            BUGSWARM_SET = {bugswarm_bug["image_tag"] for bugswarm_bug in BugSwarm_json}
        if not BUGSWARM_SET:
            print("BugSwarm set is empty.")
        else:
            print("BugSwarm set is full.")
    else:
        print("Export.json not found.")

def list_bug_candidates(dataset_path):
    return [folder for folder in dataset_path.iterdir() if folder.is_dir() and folder.name in BUGSWARM_SET]

def find_randoop_test_files(path):
    matches = []
    for root, dirs, files in os.walk(path):
        for filename in fnmatch.filter(files, 'Randoop*.java'):
            matches.append(os.path.join(root, filename))
    return matches

def find_evosuite_test_files(path):
    matches = []
    for root, dirs, files in os.walk(path):
        for filename in fnmatch.filter(files, 'Evosuite*.java'):
            matches.append(os.path.join(root, filename))
    return matches

def validate(repo_path: Path):
    read_dataset_files()

    validate_pass = True
    dataset_requirements = {
        Dataset.BUGSWARM: 20
    }

    dataset = Dataset.BUGSWARM
    dataset_path = repo_path / dataset.value

    if not dataset_path.exists():
        print(f"[FAIL] No {dataset.value} folder")
        return

    candidates = list_bug_candidates(dataset_path)
    min_bugs = dataset_requirements[dataset]

    if len(candidates) < min_bugs:
        print(f"[FAIL] Missing {min_bugs - len(candidates)} bugs in {dataset.value}")
        validate_pass = False

    for folder in candidates:
        if not all((folder / subfolder).exists() for subfolder in ["Buggy-Version", "Patched-Version"]):
            print(f"[FAIL] Incomplete versions in {dataset.value}-{folder.name}")
            validate_pass = False

        if not (folder / "test.txt").exists():
            print(f"[WARN] No failed test file in {dataset.value}-{folder.name}")
            continue  # Continue if no test file is found

        if len(find_randoop_test_files(folder / "Buggy-Version")) == 0:
            print(f"[FAIL] No Randoop test files in {dataset.value}-{folder.name}/Buggy-Version")
            validate_pass = False
        if len(find_randoop_test_files(folder / "Patched-Version")) == 0:
            print(f"[FAIL] No Randoop test files in {dataset.value}-{folder.name}/Patched-Version")
            validate_pass = False
        
        # Print warning message if no Evosuite test files are found, but continue
        if len(find_evosuite_test_files(folder / "Buggy-Version")) == 0:
            print(f"[WARN] No Evosuite test files in {dataset.value}-{folder.name}/Buggy-Version")
        if len(find_evosuite_test_files(folder / "Patched-Version")) == 0:
            print(f"[WARN] No Evosuite test files in {dataset.value}-{folder.name}/Patched-Version")

        # Check for coverage folder existence
        if not (folder / "Coverage").exists():
            print(f"[FAIL] No coverage folder in {dataset.value}-{folder.name}")
            validate_pass = False
        else:
            # Check for specific coverage folders
            if not (folder / "Coverage" / "Buggy-version-Randoop").exists():
                print(f"[FAIL] No coverage folder for  buggy-Randoop in {dataset.value}-{folder.name}")
                validate_pass = False
            if not (folder / "Coverage" / "Buggy-version-Evosuite").exists():
                print(f"[FAIL] No coverage folder for buggy-Evosuite in {dataset.value}-{folder.name}")
                validate_pass = False
            if not (folder / "Coverage" / "Patched-version-Randoop").exists():
                print(f"[FAIL] No coverage folder for patched-Randoop in {dataset.value}-{folder.name}")
                validate_pass = False
            if not (folder / "Coverage" / "Patched-version-Evosuite").exists():
                print(f"[FAIL] No coverage folder for patchedEvosuite in {dataset.value}-{folder.name}")
                validate_pass = False
            if not (folder / "Coverage" / "Buggy-version-All").exists():
                print(f"[FAIL] No coverage folder for buggy-All in {dataset.value}-{folder.name}")
                validate_pass = False
            if not (folder / "Coverage" / "Patched-version-All").exists():
                print(f"[FAIL] No coverage folder for patched-All in {dataset.value}-{folder.name}")
                validate_pass = False

    if validate_pass:
        print("[PASS] Validation pass")

def main():
    parser = argparse.ArgumentParser(description="Validate repository structure for bug datasets.")
    parser.add_argument("repo_path", type=str, help="Path to the repository")
    args = parser.parse_args()

    validate(Path(args.repo_path))

if __name__ == '__main__':
    main()
