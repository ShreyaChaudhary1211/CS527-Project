var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":17576,"methods":[{"el":41,"sc":5,"sl":39}],"name":"TrackReferenceBox","sl":36}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_150":{"methods":[{"sl":39}],"name":"testRoundTrip_1a","pass":true,"statements":[{"sl":40}]},"test_60":{"methods":[{"sl":39}],"name":"testRoundTrip_1e","pass":false,"statements":[{"sl":40}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [60, 150], [60, 150], [], []]
