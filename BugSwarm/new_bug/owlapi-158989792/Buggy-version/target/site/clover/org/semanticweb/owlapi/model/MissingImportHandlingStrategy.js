var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":45,"id":74270,"methods":[{"el":44,"sc":5,"sl":41}],"name":"MissingImportHandlingStrategy","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1092":{"methods":[{"sl":41}],"name":"shouldLoad","pass":true,"statements":[{"sl":43}]},"test_1441":{"methods":[{"sl":41}],"name":"shouldThrowExceptionWithDefaultImportsconfig","pass":true,"statements":[{"sl":43}]},"test_4125":{"methods":[{"sl":41}],"name":"shouldFindExpectedValue","pass":true,"statements":[{"sl":43}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1092, 4125, 1441], [], [1092, 4125, 1441], [], []]
