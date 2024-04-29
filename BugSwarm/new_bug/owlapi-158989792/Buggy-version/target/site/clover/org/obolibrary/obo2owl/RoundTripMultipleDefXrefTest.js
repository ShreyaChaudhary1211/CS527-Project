var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":7776,"methods":[{"el":19,"sc":5,"sl":16},{"el":44,"sc":5,"sl":21}],"name":"RoundTripMultipleDefXrefTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1118":{"methods":[{"sl":21}],"name":"testDefinitions","pass":true,"statements":[{"sl":23},{"sl":24},{"sl":25},{"sl":27},{"sl":28},{"sl":29},{"sl":32},{"sl":34},{"sl":35},{"sl":37},{"sl":38},{"sl":43}]},"test_704":{"methods":[{"sl":16}],"name":"testRoundTrip","pass":true,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [704], [], [704], [], [], [1118], [], [1118], [1118], [1118], [], [1118], [1118], [1118], [], [], [1118], [], [1118], [1118], [], [1118], [1118], [], [], [], [], [1118], [], []]
