var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":31,"id":92256,"methods":[{"el":22,"sc":5,"sl":16},{"el":30,"sc":5,"sl":24}],"name":"OBODocDifferTest","sl":14}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1047":{"methods":[{"sl":24}],"name":"testDiff","pass":true,"statements":[{"sl":26},{"sl":27},{"sl":28},{"sl":29}]},"test_950":{"methods":[{"sl":16}],"name":"testIdentical","pass":true,"statements":[{"sl":18},{"sl":19},{"sl":20},{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [950], [], [950], [950], [950], [950], [], [], [1047], [], [1047], [1047], [1047], [1047], [], []]
