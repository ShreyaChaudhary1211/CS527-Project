var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":102340,"methods":[{"el":40,"sc":5,"sl":35},{"el":49,"sc":5,"sl":46},{"el":54,"sc":5,"sl":51}],"name":"BuilderDisjointDataProperties","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1532":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildDisjointDataProperties","pass":true,"statements":[{"sl":48},{"sl":53}]},"test_2143":{"methods":[{"sl":35},{"sl":46},{"sl":51}],"name":"shouldBuildDisjointDataProperties","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":48},{"sl":53}]},"test_2722":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildDisjointDataProperties","pass":true,"statements":[{"sl":48},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2143], [], [2143], [2143], [], [], [], [], [], [], [], [1532, 2143, 2722], [], [1532, 2143, 2722], [], [], [1532, 2143, 2722], [], [1532, 2143, 2722], [], []]
