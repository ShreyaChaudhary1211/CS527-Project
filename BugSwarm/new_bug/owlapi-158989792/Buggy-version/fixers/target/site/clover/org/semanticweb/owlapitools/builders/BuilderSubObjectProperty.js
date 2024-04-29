var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":1066,"methods":[{"el":40,"sc":5,"sl":35},{"el":49,"sc":5,"sl":46},{"el":55,"sc":5,"sl":51}],"name":"BuilderSubObjectProperty","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_155":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSubObjectProperty","pass":true,"statements":[{"sl":48},{"sl":53}]},"test_199":{"methods":[{"sl":35},{"sl":46},{"sl":51}],"name":"shouldBuildSubObjectProperty","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":48},{"sl":53}]},"test_77":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSubObjectProperty","pass":true,"statements":[{"sl":48},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [199], [], [199], [199], [], [], [], [], [], [], [], [155, 77, 199], [], [155, 77, 199], [], [], [155, 77, 199], [], [155, 77, 199], [], [], []]
