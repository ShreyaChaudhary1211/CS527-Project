var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":102943,"methods":[{"el":40,"sc":5,"sl":35},{"el":49,"sc":5,"sl":46},{"el":54,"sc":5,"sl":51}],"name":"BuilderSameIndividual","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3116":{"methods":[{"sl":35},{"sl":46},{"sl":51}],"name":"shouldBuildSameIndividual","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":48},{"sl":53}]},"test_3676":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSameIndividual","pass":true,"statements":[{"sl":48},{"sl":53}]},"test_3749":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSameIndividual","pass":true,"statements":[{"sl":48},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3116], [], [3116], [3116], [], [], [], [], [], [], [], [3676, 3749, 3116], [], [3676, 3749, 3116], [], [], [3676, 3749, 3116], [], [3676, 3749, 3116], [], []]
