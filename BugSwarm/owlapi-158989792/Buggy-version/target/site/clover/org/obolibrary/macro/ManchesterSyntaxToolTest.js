var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":3130,"methods":[{"el":33,"sc":5,"sl":28},{"el":40,"sc":5,"sl":35},{"el":54,"sc":5,"sl":42}],"name":"ManchesterSyntaxToolTest","sl":20}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_410":{"methods":[{"sl":28},{"sl":42}],"name":"testParseManchesterIds","pass":true,"statements":[{"sl":30},{"sl":32},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":53}]},"test_588":{"methods":[{"sl":35},{"sl":42}],"name":"testParseManchesterNames","pass":true,"statements":[{"sl":37},{"sl":39},{"sl":44},{"sl":45},{"sl":46},{"sl":47},{"sl":48},{"sl":49},{"sl":50},{"sl":51},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [410], [], [410], [], [410], [], [], [588], [], [588], [], [588], [], [], [410, 588], [], [410, 588], [410, 588], [410, 588], [410, 588], [410, 588], [410, 588], [410, 588], [410, 588], [], [410, 588], [], []]
