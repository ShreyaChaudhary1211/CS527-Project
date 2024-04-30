var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":56,"id":191,"methods":[{"el":33,"sc":5,"sl":30},{"el":49,"sc":5,"sl":43},{"el":55,"sc":5,"sl":51}],"name":"BuilderAsymmetricObjectProperty","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_150":{"methods":[{"sl":30},{"sl":51}],"name":"shouldBuildAsymmetricObjectProperty","pass":true,"statements":[{"sl":32},{"sl":53}]},"test_179":{"methods":[{"sl":30},{"sl":43},{"sl":51}],"name":"shouldBuildAsymmetricObjectProperty","pass":true,"statements":[{"sl":32},{"sl":46},{"sl":47},{"sl":53}]},"test_35":{"methods":[{"sl":30},{"sl":51}],"name":"shouldBuildAsymmetricObjectProperty","pass":true,"statements":[{"sl":32},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [35, 179, 150], [], [35, 179, 150], [], [], [], [], [], [], [], [], [], [], [179], [], [], [179], [179], [], [], [], [35, 179, 150], [], [35, 179, 150], [], [], []]
