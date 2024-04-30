var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":65,"id":2508,"methods":[{"el":59,"sc":5,"sl":57},{"el":64,"sc":5,"sl":62}],"name":"OBOPrefix","sl":47}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_0":{"methods":[{"sl":62}],"name":"shouldParseOBO12","pass":true,"statements":[{"sl":63}]},"test_1":{"methods":[{"sl":62}],"name":"shouldParse","pass":true,"statements":[{"sl":63}]},"test_2":{"methods":[{"sl":57},{"sl":62}],"name":"shouldParseGenericOBO","pass":true,"statements":[{"sl":58},{"sl":63}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2], [2], [], [], [], [2, 0, 1], [2, 0, 1], [], []]
