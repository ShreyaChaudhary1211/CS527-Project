var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":3235,"methods":[{"el":20,"sc":5,"sl":18},{"el":26,"sc":5,"sl":22},{"el":31,"sc":5,"sl":28}],"name":"PiffTrackEncryptionBox","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_55":{"methods":[{"sl":18},{"sl":22},{"sl":28}],"name":"testRoundTrip","pass":true,"statements":[{"sl":19},{"sl":24},{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [55], [55], [], [], [55], [], [55], [], [], [], [55], [], [55], [], [], [], []]
