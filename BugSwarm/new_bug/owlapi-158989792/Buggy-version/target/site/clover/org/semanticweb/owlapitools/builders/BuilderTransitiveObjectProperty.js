var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":102985,"methods":[{"el":33,"sc":5,"sl":30},{"el":49,"sc":5,"sl":43},{"el":55,"sc":5,"sl":51}],"name":"BuilderTransitiveObjectProperty","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1671":{"methods":[{"sl":30},{"sl":51}],"name":"shouldBuildTransitiveObjectProperty","pass":true,"statements":[{"sl":32},{"sl":53}]},"test_2283":{"methods":[{"sl":30},{"sl":51}],"name":"shouldBuildTransitiveObjectProperty","pass":true,"statements":[{"sl":32},{"sl":53}]},"test_2444":{"methods":[{"sl":30},{"sl":43},{"sl":51}],"name":"shouldBuildTransitiveObjectProperty","pass":true,"statements":[{"sl":32},{"sl":46},{"sl":47},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1671, 2283, 2444], [], [1671, 2283, 2444], [], [], [], [], [], [], [], [], [], [], [2444], [], [], [2444], [2444], [], [], [], [1671, 2283, 2444], [], [1671, 2283, 2444], [], [], []]
