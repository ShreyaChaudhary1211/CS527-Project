var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":33,"id":16485,"methods":[{"el":22,"sc":5,"sl":19},{"el":27,"sc":5,"sl":24},{"el":32,"sc":5,"sl":29}],"name":"NoOpReadWriteLock_TestCase","sl":15}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2055":{"methods":[{"sl":29}],"name":"shouldNotReturnNullForWriteLock","pass":true,"statements":[{"sl":31}]},"test_549":{"methods":[{"sl":24}],"name":"shouldNotReturnNullForReadLock","pass":true,"statements":[{"sl":26}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [549], [], [549], [], [], [2055], [], [2055], [], []]
