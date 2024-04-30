var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":585,"methods":[{"el":40,"sc":5,"sl":34},{"el":49,"sc":5,"sl":46},{"el":55,"sc":5,"sl":51}],"name":"BuilderIrreflexiveObjectProperty","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_111":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildIrreflexiveObjectProperty","pass":true,"statements":[{"sl":48},{"sl":53}]},"test_142":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildIrreflexiveObjectProperty","pass":true,"statements":[{"sl":48},{"sl":53}]},"test_33":{"methods":[{"sl":34},{"sl":46},{"sl":51}],"name":"shouldBuildIrreflexiveObjectProperty","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":48},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [33], [], [], [33], [33], [], [], [], [], [], [], [], [142, 111, 33], [], [142, 111, 33], [], [], [142, 111, 33], [], [142, 111, 33], [], [], []]
