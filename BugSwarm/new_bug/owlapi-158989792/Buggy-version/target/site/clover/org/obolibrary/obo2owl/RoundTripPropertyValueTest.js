var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":7873,"methods":[{"el":11,"sc":5,"sl":8},{"el":16,"sc":5,"sl":13},{"el":21,"sc":5,"sl":18}],"name":"RoundTripPropertyValueTest","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1068":{"methods":[{"sl":18}],"name":"testRoundTripHeader","pass":true,"statements":[{"sl":20}]},"test_483":{"methods":[{"sl":8}],"name":"testRoundTrip","pass":true,"statements":[{"sl":10}]},"test_991":{"methods":[{"sl":13}],"name":"testRoundTripWithQualifiers","pass":true,"statements":[{"sl":15}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [483], [], [483], [], [], [991], [], [991], [], [], [1068], [], [1068], [], []]
