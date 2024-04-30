var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":20,"id":363,"methods":[{"el":19,"sc":5,"sl":17}],"name":"DocumentStructureException","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1030":{"methods":[{"sl":17}],"name":"testCheckForMultipleCommentsinFrame","pass":true,"statements":[{"sl":18}]},"test_764":{"methods":[{"sl":17}],"name":"testParseOBOFile","pass":true,"statements":[{"sl":18}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1030, 764], [1030, 764], [], []]
