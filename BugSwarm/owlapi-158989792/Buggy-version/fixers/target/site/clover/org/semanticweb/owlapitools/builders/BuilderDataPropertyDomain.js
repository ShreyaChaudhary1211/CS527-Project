var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":341,"methods":[{"el":34,"sc":5,"sl":31},{"el":49,"sc":5,"sl":44},{"el":55,"sc":5,"sl":51}],"name":"BuilderDataPropertyDomain","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_181":{"methods":[{"sl":31},{"sl":51}],"name":"shouldBuildDataPropertyDomain","pass":true,"statements":[{"sl":33},{"sl":53}]},"test_36":{"methods":[{"sl":31},{"sl":51}],"name":"shouldBuildDataPropertyDomain","pass":true,"statements":[{"sl":33},{"sl":53}]},"test_48":{"methods":[{"sl":31},{"sl":44},{"sl":51}],"name":"shouldBuildDataPropertyDomain","pass":true,"statements":[{"sl":33},{"sl":46},{"sl":47},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [181, 36, 48], [], [181, 36, 48], [], [], [], [], [], [], [], [], [], [], [48], [], [48], [48], [], [], [], [181, 36, 48], [], [181, 36, 48], [], [], []]
