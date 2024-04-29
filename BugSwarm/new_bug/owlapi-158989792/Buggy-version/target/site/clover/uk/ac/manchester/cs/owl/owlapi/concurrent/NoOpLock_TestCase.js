var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":39,"id":13274,"methods":[{"el":23,"sc":5,"sl":20},{"el":28,"sc":5,"sl":25},{"el":33,"sc":5,"sl":30},{"el":38,"sc":5,"sl":35}],"name":"NoOpLock_TestCase","sl":16}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_1862":{"methods":[{"sl":30}],"name":"shouldReturn_true_When_tryLock","pass":true,"statements":[{"sl":32}]},"test_1944":{"methods":[{"sl":25}],"name":"shouldNotReturnNullCondition","pass":true,"statements":[{"sl":27}]},"test_2034":{"methods":[{"sl":35}],"name":"shouldReturn_true_When_tryLockWithTimeOut","pass":true,"statements":[{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [1944], [], [1944], [], [], [1862], [], [1862], [], [], [2034], [], [2034], [], []]
