var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":822,"methods":[{"el":39,"sc":5,"sl":34},{"el":48,"sc":5,"sl":45},{"el":54,"sc":5,"sl":50}],"name":"BuilderObjectPropertyRange","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_21":{"methods":[{"sl":34},{"sl":45},{"sl":50}],"name":"shouldBuildObjectPropertyRange","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":47},{"sl":52}]},"test_55":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildObjectPropertyRange","pass":true,"statements":[{"sl":47},{"sl":52}]},"test_64":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildObjectPropertyRange","pass":true,"statements":[{"sl":47},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [21], [], [21], [21], [], [], [], [], [], [], [], [55, 21, 64], [], [55, 21, 64], [], [], [55, 21, 64], [], [55, 21, 64], [], [], []]
