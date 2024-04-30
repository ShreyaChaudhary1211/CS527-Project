var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":279,"methods":[{"el":34,"sc":5,"sl":31},{"el":48,"sc":5,"sl":44},{"el":53,"sc":5,"sl":50}],"name":"BuilderDataIntersectionOf","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_203":{"methods":[{"sl":31},{"sl":50}],"name":"shouldBuildDataIntersectionOf","pass":true,"statements":[{"sl":33},{"sl":52}]},"test_97":{"methods":[{"sl":31},{"sl":44},{"sl":50}],"name":"shouldBuildDataIntersectionOf","pass":true,"statements":[{"sl":33},{"sl":46},{"sl":47},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [203, 97], [], [203, 97], [], [], [], [], [], [], [], [], [], [], [97], [], [97], [97], [], [], [203, 97], [], [203, 97], [], []]
