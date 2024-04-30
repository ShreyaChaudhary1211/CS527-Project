var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":67,"id":7213,"methods":[{"el":43,"sc":5,"sl":35},{"el":53,"sc":5,"sl":45},{"el":66,"sc":5,"sl":55}],"name":"DisjointClassesRoundTripTestCase","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_271":{"methods":[{"sl":35},{"sl":55}],"name":"shouldParse","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":40},{"sl":41},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":64},{"sl":65}]},"test_333":{"methods":[{"sl":45},{"sl":55}],"name":"shouldRoundTrip","pass":true,"statements":[{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":57},{"sl":58},{"sl":59},{"sl":60},{"sl":61},{"sl":62},{"sl":64},{"sl":65}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [271], [], [271], [271], [], [271], [271], [], [], [], [333], [], [333], [333], [333], [333], [333], [], [], [], [333, 271], [], [333, 271], [333, 271], [333, 271], [333, 271], [333, 271], [333, 271], [], [333, 271], [333, 271], [], []]
