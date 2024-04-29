var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":140,"methods":[{"el":32,"sc":5,"sl":29},{"el":46,"sc":5,"sl":42},{"el":54,"sc":5,"sl":48}],"name":"BuilderAnnotationProperty","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_116":{"methods":[{"sl":29},{"sl":48}],"name":"shouldBuildAnnotationProperty","pass":true,"statements":[{"sl":31},{"sl":50},{"sl":53}]},"test_27":{"methods":[{"sl":29},{"sl":42},{"sl":48}],"name":"shouldBuildAnnotationProperty","pass":true,"statements":[{"sl":31},{"sl":44},{"sl":45},{"sl":50},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [27, 116], [], [27, 116], [], [], [], [], [], [], [], [], [], [], [27], [], [27], [27], [], [], [27, 116], [], [27, 116], [], [], [27, 116], [], []]
