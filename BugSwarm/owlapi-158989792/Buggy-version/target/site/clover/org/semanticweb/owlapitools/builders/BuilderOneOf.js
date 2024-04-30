var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":102741,"methods":[{"el":37,"sc":5,"sl":34},{"el":46,"sc":5,"sl":43},{"el":51,"sc":5,"sl":48}],"name":"BuilderOneOf","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1409":{"methods":[{"sl":34},{"sl":43},{"sl":48}],"name":"shouldBuildOneOf","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":45},{"sl":50}]},"test_2530":{"methods":[{"sl":43},{"sl":48}],"name":"shouldBuildOneOf","pass":true,"statements":[{"sl":45},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1409], [1409], [1409], [], [], [], [], [], [], [2530, 1409], [], [2530, 1409], [], [], [2530, 1409], [], [2530, 1409], [], []]
