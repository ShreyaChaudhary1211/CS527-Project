var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":64,"id":4805,"methods":[{"el":42,"sc":5,"sl":38},{"el":47,"sc":5,"sl":44},{"el":52,"sc":5,"sl":49},{"el":57,"sc":5,"sl":54},{"el":63,"sc":5,"sl":59}],"name":"UseOfPropertyInChainCausesCycle","sl":28}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_3216":{"methods":[{"sl":38},{"sl":44},{"sl":49},{"sl":54},{"sl":59}],"name":"shouldCreateViolationForOWLSubPropertyChainOfAxiomInOWL2DLProfile","pass":true,"statements":[{"sl":41},{"sl":46},{"sl":51},{"sl":56},{"sl":61}]},"test_4165":{"methods":[{"sl":38}],"name":"shouldCauseViolationsWithUseOfPropertyInChain","pass":true,"statements":[{"sl":41}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [4165, 3216], [], [], [4165, 3216], [], [], [3216], [], [3216], [], [], [3216], [], [3216], [], [], [3216], [], [3216], [], [], [3216], [], [3216], [], [], []]
