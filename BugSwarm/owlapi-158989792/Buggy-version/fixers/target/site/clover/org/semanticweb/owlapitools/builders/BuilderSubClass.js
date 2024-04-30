var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":1052,"methods":[{"el":39,"sc":5,"sl":34},{"el":48,"sc":5,"sl":45},{"el":53,"sc":5,"sl":50}],"name":"BuilderSubClass","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_153":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildSubClass","pass":true,"statements":[{"sl":47},{"sl":52}]},"test_184":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildSubClass","pass":true,"statements":[{"sl":47},{"sl":52}]},"test_54":{"methods":[{"sl":34},{"sl":45},{"sl":50}],"name":"shouldBuildSubClass","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":47},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [54], [], [54], [54], [], [], [], [], [], [], [], [54, 184, 153], [], [54, 184, 153], [], [], [54, 184, 153], [], [54, 184, 153], [], []]
