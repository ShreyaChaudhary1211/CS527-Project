var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":1038,"methods":[{"el":40,"sc":5,"sl":35},{"el":49,"sc":5,"sl":46},{"el":54,"sc":5,"sl":51}],"name":"BuilderSameIndividual","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_174":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSameIndividual","pass":true,"statements":[{"sl":48},{"sl":53}]},"test_2":{"methods":[{"sl":35},{"sl":46},{"sl":51}],"name":"shouldBuildSameIndividual","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":48},{"sl":53}]},"test_79":{"methods":[{"sl":46},{"sl":51}],"name":"shouldBuildSameIndividual","pass":true,"statements":[{"sl":48},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2], [], [2], [2], [], [], [], [], [], [], [], [79, 174, 2], [], [79, 174, 2], [], [], [79, 174, 2], [], [79, 174, 2], [], []]
