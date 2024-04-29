var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":61,"id":87098,"methods":[{"el":43,"sc":5,"sl":41},{"el":49,"sc":5,"sl":45},{"el":55,"sc":5,"sl":51},{"el":60,"sc":5,"sl":57}],"name":"RemoveAxiomData","sl":30}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2527":{"methods":[{"sl":41},{"sl":57}],"name":"shoudReturnRightName","pass":true,"statements":[{"sl":42},{"sl":59}]},"test_2863":{"methods":[{"sl":41},{"sl":45}],"name":"shouldReplaceLiteralsWithTransformer","pass":true,"statements":[{"sl":42},{"sl":48}]},"test_4280":{"methods":[{"sl":41}],"name":"testRoundTripChange","pass":true,"statements":[{"sl":42}]},"test_4665":{"methods":[{"sl":41},{"sl":45}],"name":"testCreateOntologyChange","pass":true,"statements":[{"sl":42},{"sl":48}]},"test_4673":{"methods":[{"sl":41}],"name":"testEquals","pass":true,"statements":[{"sl":42}]},"test_4723":{"methods":[{"sl":41}],"name":"testGettersNotNull","pass":true,"statements":[{"sl":42}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2863, 2527, 4665, 4673, 4280, 4723], [2863, 2527, 4665, 4673, 4280, 4723], [], [], [2863, 4665], [], [], [2863, 4665], [], [], [], [], [], [], [], [], [2527], [], [2527], [], []]
