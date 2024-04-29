var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":102211,"methods":[{"el":33,"sc":5,"sl":30},{"el":46,"sc":5,"sl":43},{"el":51,"sc":5,"sl":48}],"name":"BuilderDataOneOf","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1571":{"methods":[{"sl":30},{"sl":48}],"name":"shouldBuildDataOneOf","pass":true,"statements":[{"sl":32},{"sl":50}]},"test_1585":{"methods":[{"sl":30},{"sl":43},{"sl":48}],"name":"shouldBuildDataOneOf","pass":true,"statements":[{"sl":32},{"sl":44},{"sl":45},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1571, 1585], [], [1571, 1585], [], [], [], [], [], [], [], [], [], [], [1585], [1585], [1585], [], [], [1571, 1585], [], [1571, 1585], [], []]
