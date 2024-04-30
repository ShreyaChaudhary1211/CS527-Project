var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":777,"methods":[{"el":40,"sc":5,"sl":35},{"el":49,"sc":5,"sl":46},{"el":60,"sc":5,"sl":56},{"el":66,"sc":5,"sl":62}],"name":"BuilderObjectMinCardinality","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_196":{"methods":[{"sl":35},{"sl":46},{"sl":56},{"sl":62}],"name":"shouldBuildObjectMinCardinality","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":48},{"sl":58},{"sl":59},{"sl":64}]},"test_76":{"methods":[{"sl":46},{"sl":56},{"sl":62}],"name":"shouldBuildObjectMinCardinality","pass":true,"statements":[{"sl":48},{"sl":58},{"sl":59},{"sl":64}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [196], [], [196], [196], [], [], [], [], [], [], [], [196, 76], [], [196, 76], [], [], [], [], [], [], [], [196, 76], [], [196, 76], [196, 76], [], [], [196, 76], [], [196, 76], [], [], []]
