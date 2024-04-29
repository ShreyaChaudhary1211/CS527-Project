var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":524,"methods":[{"el":39,"sc":5,"sl":34},{"el":48,"sc":5,"sl":45},{"el":53,"sc":5,"sl":50}],"name":"BuilderFunctionalDataProperty","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_119":{"methods":[{"sl":34},{"sl":45},{"sl":50}],"name":"shouldBuildFunctionalDataProperty","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":47},{"sl":52}]},"test_31":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildFunctionalDataProperty","pass":true,"statements":[{"sl":47},{"sl":52}]},"test_67":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildFunctionalDataProperty","pass":true,"statements":[{"sl":47},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [119], [], [119], [119], [], [], [], [], [], [], [], [67, 31, 119], [], [67, 31, 119], [], [], [67, 31, 119], [], [67, 31, 119], [], []]
