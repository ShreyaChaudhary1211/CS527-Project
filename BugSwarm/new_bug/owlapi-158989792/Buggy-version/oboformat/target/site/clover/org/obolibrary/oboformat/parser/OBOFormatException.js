var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":4446,"methods":[{"el":12,"sc":5,"sl":12},{"el":22,"sc":5,"sl":20},{"el":32,"sc":5,"sl":30},{"el":44,"sc":5,"sl":42}],"name":"OBOFormatException","sl":6}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_130":{"methods":[{"sl":20}],"name":"testCurlyBracesInComments","pass":true,"statements":[{"sl":21}]},"test_137":{"methods":[{"sl":20}],"name":"shouldFailWithBanningOfTriX","pass":true,"statements":[{"sl":21}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [137, 130], [137, 130], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], []]
