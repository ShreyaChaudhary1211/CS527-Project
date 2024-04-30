var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":1073,"methods":[{"el":39,"sc":5,"sl":34},{"el":48,"sc":5,"sl":45},{"el":54,"sc":5,"sl":50}],"name":"BuilderSymmetricObjectProperty","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_152":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildSymmetricObjectProperty","pass":true,"statements":[{"sl":47},{"sl":52}]},"test_51":{"methods":[{"sl":34},{"sl":45},{"sl":50}],"name":"shouldBuildSymmetricObjectProperty","pass":true,"statements":[{"sl":36},{"sl":37},{"sl":47},{"sl":52}]},"test_78":{"methods":[{"sl":45},{"sl":50}],"name":"shouldBuildSymmetricObjectProperty","pass":true,"statements":[{"sl":47},{"sl":52}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [51], [], [51], [51], [], [], [], [], [], [], [], [78, 152, 51], [], [78, 152, 51], [], [], [78, 152, 51], [], [78, 152, 51], [], [], []]
