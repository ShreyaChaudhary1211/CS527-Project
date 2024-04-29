var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":102964,"methods":[{"el":40,"sc":5,"sl":35},{"el":49,"sc":5,"sl":46},{"el":54,"sc":5,"sl":51}],"name":"BuilderSubDataProperty","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1892":{"methods":[{"sl":35},{"sl":46},{"sl":51}],"name":"shouldBuildSubDataProperty","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":48},{"sl":53}]},"test_2641":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSubDataProperty","pass":true,"statements":[{"sl":48},{"sl":53}]},"test_3247":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSubDataProperty","pass":true,"statements":[{"sl":48},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1892], [], [1892], [1892], [], [], [], [], [], [], [], [3247, 1892, 2641], [], [3247, 1892, 2641], [], [], [3247, 1892, 2641], [], [3247, 1892, 2641], [], []]
