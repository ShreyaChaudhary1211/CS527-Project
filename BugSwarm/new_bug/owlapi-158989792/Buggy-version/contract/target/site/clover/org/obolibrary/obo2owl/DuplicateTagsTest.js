var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":737,"methods":[{"el":27,"sc":13,"sl":23},{"el":33,"sc":5,"sl":17}],"name":"DuplicateTagsTest","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3007":{"methods":[{"sl":17},{"sl":23}],"name":"test","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":25},{"sl":26},{"sl":29},{"sl":30},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [3007], [], [3007], [3007], [3007], [], [3007], [], [3007], [3007], [], [], [3007], [3007], [], [3007], [], []]
