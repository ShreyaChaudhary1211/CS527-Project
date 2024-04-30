var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":54,"methods":[{"el":43,"sc":5,"sl":41},{"el":49,"sc":5,"sl":45},{"el":55,"sc":5,"sl":51},{"el":60,"sc":5,"sl":57}],"name":"AddAxiomData","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2003":{"methods":[{"sl":41},{"sl":45}],"name":"testOntologyChange","pass":true,"statements":[{"sl":42},{"sl":48}]},"test_2190":{"methods":[{"sl":41},{"sl":45}],"name":"testCreateOntologyChangeEquals","pass":true,"statements":[{"sl":42},{"sl":48}]},"test_2943":{"methods":[{"sl":41},{"sl":57}],"name":"shoudReturnRightName","pass":true,"statements":[{"sl":42},{"sl":59}]},"test_3952":{"methods":[{"sl":41}],"name":"testRoundTripChange","pass":true,"statements":[{"sl":42}]},"test_4031":{"methods":[{"sl":41}],"name":"testEquals","pass":true,"statements":[{"sl":42}]},"test_437":{"methods":[{"sl":41},{"sl":45}],"name":"shouldReplaceLiteralsWithTransformer","pass":true,"statements":[{"sl":42},{"sl":48}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [437, 2003, 2943, 2190, 4031, 3952], [437, 2003, 2943, 2190, 4031, 3952], [], [], [437, 2003, 2190], [], [], [437, 2003, 2190], [], [], [], [], [], [], [], [], [2943], [], [2943], [], []]
