var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":62,"id":100,"methods":[{"el":44,"sc":5,"sl":42},{"el":50,"sc":5,"sl":46},{"el":56,"sc":5,"sl":52},{"el":61,"sc":5,"sl":58}],"name":"AddOntologyAnnotationData","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1381":{"methods":[{"sl":42}],"name":"testEquals","pass":true,"statements":[{"sl":43}]},"test_1426":{"methods":[{"sl":42},{"sl":46}],"name":"testCreateOntologyChange","pass":true,"statements":[{"sl":43},{"sl":49}]},"test_2245":{"methods":[{"sl":42}],"name":"testOntologyChangeSymmetry","pass":true,"statements":[{"sl":43}]},"test_2943":{"methods":[{"sl":42},{"sl":58}],"name":"shoudReturnRightName","pass":true,"statements":[{"sl":43},{"sl":60}]},"test_3777":{"methods":[{"sl":42},{"sl":46}],"name":"testGettersReturnNotNull","pass":true,"statements":[{"sl":43},{"sl":49}]},"test_4401":{"methods":[{"sl":42}],"name":"testGettersEquals","pass":true,"statements":[{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1381, 1426, 2943, 2245, 4401, 3777], [1381, 1426, 2943, 2245, 4401, 3777], [], [], [1426, 3777], [], [], [1426, 3777], [], [], [], [], [], [], [], [], [2943], [], [2943], [], []]
