var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":102577,"methods":[{"el":37,"sc":5,"sl":33},{"el":46,"sc":5,"sl":43},{"el":54,"sc":5,"sl":48}],"name":"BuilderNamedIndividual","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1548":{"methods":[{"sl":43},{"sl":48}],"name":"shouldBuildNamedIndividual","pass":true,"statements":[{"sl":45},{"sl":50},{"sl":53}]},"test_2340":{"methods":[{"sl":33},{"sl":43},{"sl":48}],"name":"shouldBuildNamedIndividual","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":45},{"sl":50},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2340], [], [2340], [2340], [], [], [], [], [], [], [1548, 2340], [], [1548, 2340], [], [], [1548, 2340], [], [1548, 2340], [], [], [1548, 2340], [], []]
