var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":54,"id":102274,"methods":[{"el":36,"sc":5,"sl":33},{"el":45,"sc":5,"sl":42},{"el":53,"sc":5,"sl":47}],"name":"BuilderDatatype","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2226":{"methods":[{"sl":42},{"sl":47}],"name":"shouldBuildDatatype","pass":true,"statements":[{"sl":44},{"sl":49},{"sl":52}]},"test_2410":{"methods":[{"sl":33},{"sl":42},{"sl":47}],"name":"shouldBuildDatatype","pass":true,"statements":[{"sl":34},{"sl":35},{"sl":44},{"sl":49},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2410], [2410], [2410], [], [], [], [], [], [], [2410, 2226], [], [2410, 2226], [], [], [2410, 2226], [], [2410, 2226], [], [], [2410, 2226], [], []]
