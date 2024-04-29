var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":25,"id":1603,"methods":[{"el":15,"sc":5,"sl":12},{"el":24,"sc":5,"sl":17}],"name":"RoundTripVersionIRITest","sl":10}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1487":{"methods":[{"sl":12}],"name":"testRoundTrip","pass":true,"statements":[{"sl":14}]},"test_3163":{"methods":[{"sl":17}],"name":"testConvert","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":22}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [1487], [], [1487], [], [], [3163], [], [3163], [3163], [3163], [3163], [], [], []]
