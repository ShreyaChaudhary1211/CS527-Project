var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":53,"id":102267,"methods":[{"el":38,"sc":5,"sl":34},{"el":47,"sc":5,"sl":44},{"el":52,"sc":5,"sl":49}],"name":"BuilderDataUnionOf","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1645":{"methods":[{"sl":34},{"sl":44},{"sl":49}],"name":"shouldBuildDataUnionOf","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":46},{"sl":51}]},"test_1734":{"methods":[{"sl":44},{"sl":49}],"name":"shouldBuildDataUnionOf","pass":true,"statements":[{"sl":46},{"sl":51}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1645], [], [1645], [1645], [], [], [], [], [], [], [1645, 1734], [], [1645, 1734], [], [], [1645, 1734], [], [1645, 1734], [], []]
