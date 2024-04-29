var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":717,"methods":[{"el":37,"sc":5,"sl":33},{"el":46,"sc":5,"sl":43},{"el":51,"sc":5,"sl":48}],"name":"BuilderObjectAllValuesFrom","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_123":{"methods":[{"sl":43},{"sl":48}],"name":"shouldBuildObjectAllValuesFrom","pass":true,"statements":[{"sl":45},{"sl":50}]},"test_135":{"methods":[{"sl":33},{"sl":43},{"sl":48}],"name":"shouldBuildObjectAllValuesFrom","pass":true,"statements":[{"sl":35},{"sl":36},{"sl":45},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [135], [], [135], [135], [], [], [], [], [], [], [123, 135], [], [123, 135], [], [], [123, 135], [], [123, 135], [], []]
