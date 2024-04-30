var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":102389,"methods":[{"el":41,"sc":5,"sl":35},{"el":50,"sc":5,"sl":47},{"el":55,"sc":5,"sl":52}],"name":"BuilderEquivalentDataProperties","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1907":{"methods":[{"sl":47},{"sl":52}],"name":"shouldBuildEquivalentDataProperties","pass":true,"statements":[{"sl":49},{"sl":54}]},"test_2019":{"methods":[{"sl":47},{"sl":52}],"name":"shouldBuildEquivalentDataProperties","pass":true,"statements":[{"sl":49},{"sl":54}]},"test_2379":{"methods":[{"sl":35},{"sl":47},{"sl":52}],"name":"shouldBuildEquivalentDataProperties","pass":true,"statements":[{"sl":38},{"sl":39},{"sl":49},{"sl":54}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2379], [], [], [2379], [2379], [], [], [], [], [], [], [], [1907, 2379, 2019], [], [1907, 2379, 2019], [], [], [1907, 2379, 2019], [], [1907, 2379, 2019], [], []]
