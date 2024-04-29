var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":348,"methods":[{"el":32,"sc":5,"sl":29},{"el":47,"sc":5,"sl":42},{"el":53,"sc":5,"sl":49}],"name":"BuilderDataPropertyRange","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_151":{"methods":[{"sl":29},{"sl":49}],"name":"shouldBuildDataPropertyRange","pass":true,"statements":[{"sl":31},{"sl":51}]},"test_154":{"methods":[{"sl":29},{"sl":42},{"sl":49}],"name":"shouldBuildDataPropertyRange","pass":true,"statements":[{"sl":31},{"sl":44},{"sl":45},{"sl":51}]},"test_164":{"methods":[{"sl":29},{"sl":49}],"name":"shouldBuildDataPropertyRange","pass":true,"statements":[{"sl":31},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [154, 151, 164], [], [154, 151, 164], [], [], [], [], [], [], [], [], [], [], [154], [], [154], [154], [], [], [], [154, 151, 164], [], [154, 151, 164], [], [], []]
