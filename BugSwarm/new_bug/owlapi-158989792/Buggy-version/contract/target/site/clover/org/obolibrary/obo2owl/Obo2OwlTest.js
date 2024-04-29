var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":22,"id":960,"methods":[{"el":15,"sc":5,"sl":11},{"el":21,"sc":5,"sl":17}],"name":"Obo2OwlTest","sl":9}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3185":{"methods":[{"sl":11}],"name":"testConvertCARO","pass":true,"statements":[{"sl":13},{"sl":14}]},"test_723":{"methods":[{"sl":17}],"name":"testConvertXPWithQV","pass":true,"statements":[{"sl":19},{"sl":20}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [3185], [], [3185], [3185], [], [], [723], [], [723], [723], [], []]
