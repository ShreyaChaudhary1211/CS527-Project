var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":34,"id":5932,"methods":[{"el":18,"sc":5,"sl":14},{"el":23,"sc":5,"sl":20},{"el":28,"sc":5,"sl":25},{"el":33,"sc":5,"sl":30}],"name":"RangeVisitor","sl":12}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1816":{"methods":[{"sl":14},{"sl":30}],"name":"testObjectProperty","pass":true,"statements":[{"sl":17},{"sl":32}]},"test_2213":{"methods":[{"sl":14},{"sl":25}],"name":"testDataProperty","pass":true,"statements":[{"sl":17},{"sl":27}]},"test_2644":{"methods":[{"sl":14},{"sl":25}],"name":"shouldSearchDataProperties","pass":true,"statements":[{"sl":17},{"sl":27}]},"test_2967":{"methods":[{"sl":14},{"sl":30}],"name":"testObjectPropertyRangeAxiomAccessors","pass":true,"statements":[{"sl":17},{"sl":32}]},"test_467":{"methods":[{"sl":14},{"sl":25}],"name":"testDataPropertyRangeAxiomAccessors","pass":true,"statements":[{"sl":17},{"sl":27}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [2213, 2644, 2967, 467, 1816], [], [], [2213, 2644, 2967, 467, 1816], [], [], [], [], [], [], [], [2213, 2644, 467], [], [2213, 2644, 467], [], [], [2967, 1816], [], [2967, 1816], [], []]
