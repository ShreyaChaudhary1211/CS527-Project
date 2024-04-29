var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":102162,"methods":[{"el":34,"sc":5,"sl":31},{"el":49,"sc":5,"sl":44},{"el":60,"sc":5,"sl":56},{"el":66,"sc":5,"sl":62}],"name":"BuilderDataExactCardinality","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1816":{"methods":[{"sl":31},{"sl":44},{"sl":56},{"sl":62}],"name":"shouldBuildDataExactCardinality","pass":true,"statements":[{"sl":33},{"sl":46},{"sl":47},{"sl":58},{"sl":59},{"sl":64}]},"test_3738":{"methods":[{"sl":31},{"sl":56},{"sl":62}],"name":"shouldBuildDataExactCardinality","pass":true,"statements":[{"sl":33},{"sl":58},{"sl":59},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3738, 1816], [], [3738, 1816], [], [], [], [], [], [], [], [], [], [], [1816], [], [1816], [1816], [], [], [], [], [], [], [], [], [3738, 1816], [], [3738, 1816], [3738, 1816], [], [], [3738, 1816], [], [3738, 1816], [], [], []]
