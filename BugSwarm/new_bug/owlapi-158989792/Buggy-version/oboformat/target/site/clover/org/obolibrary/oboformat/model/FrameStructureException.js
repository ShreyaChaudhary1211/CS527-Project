var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":32,"id":4162,"methods":[{"el":19,"sc":5,"sl":17},{"el":31,"sc":5,"sl":29}],"name":"FrameStructureException","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1030":{"methods":[{"sl":29}],"name":"testCheckForMultipleCommentsinFrame","pass":true,"statements":[{"sl":30}]},"test_764":{"methods":[{"sl":29}],"name":"testParseOBOFile","pass":true,"statements":[{"sl":30}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1030, 764], [1030, 764], [], []]
