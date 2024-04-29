var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":102103,"methods":[{"el":31,"sc":5,"sl":28},{"el":44,"sc":5,"sl":41},{"el":52,"sc":5,"sl":46}],"name":"BuilderClass","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3385":{"methods":[{"sl":28},{"sl":41},{"sl":46}],"name":"shouldBuildClass","pass":true,"statements":[{"sl":30},{"sl":42},{"sl":43},{"sl":48},{"sl":51}]},"test_3868":{"methods":[{"sl":28},{"sl":46}],"name":"shouldBuildClass","pass":true,"statements":[{"sl":30},{"sl":48},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3385, 3868], [], [3385, 3868], [], [], [], [], [], [], [], [], [], [], [3385], [3385], [3385], [], [], [3385, 3868], [], [3385, 3868], [], [], [3385, 3868], [], []]
