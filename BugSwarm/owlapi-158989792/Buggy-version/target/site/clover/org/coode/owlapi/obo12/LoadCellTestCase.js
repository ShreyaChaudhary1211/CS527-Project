var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":42,"id":75174,"methods":[{"el":24,"sc":5,"sl":17},{"el":33,"sc":5,"sl":26},{"el":41,"sc":5,"sl":35}],"name":"LoadCellTestCase","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_27":{"methods":[{"sl":17}],"name":"shouldParse","pass":true,"statements":[{"sl":19},{"sl":20},{"sl":21},{"sl":23}]},"test_906":{"methods":[{"sl":35}],"name":"shouldParseGenericOBO","pass":true,"statements":[{"sl":37},{"sl":38},{"sl":39},{"sl":40}]},"test_959":{"methods":[{"sl":26}],"name":"shouldParseOBO12","pass":true,"statements":[{"sl":28},{"sl":29},{"sl":30},{"sl":32}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [27], [], [27], [27], [27], [], [27], [], [], [959], [], [959], [959], [959], [], [959], [], [], [906], [], [906], [906], [906], [906], [], []]
