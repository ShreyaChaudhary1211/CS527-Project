var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":1080,"methods":[{"el":33,"sc":5,"sl":30},{"el":49,"sc":5,"sl":43},{"el":55,"sc":5,"sl":51}],"name":"BuilderTransitiveObjectProperty","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_183":{"methods":[{"sl":30},{"sl":51}],"name":"shouldBuildTransitiveObjectProperty","pass":true,"statements":[{"sl":32},{"sl":53}]},"test_192":{"methods":[{"sl":30},{"sl":51}],"name":"shouldBuildTransitiveObjectProperty","pass":true,"statements":[{"sl":32},{"sl":53}]},"test_84":{"methods":[{"sl":30},{"sl":43},{"sl":51}],"name":"shouldBuildTransitiveObjectProperty","pass":true,"statements":[{"sl":32},{"sl":46},{"sl":47},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [183, 192, 84], [], [183, 192, 84], [], [], [], [], [], [], [], [], [], [], [84], [], [], [84], [84], [], [], [], [183, 192, 84], [], [183, 192, 84], [], [], []]
