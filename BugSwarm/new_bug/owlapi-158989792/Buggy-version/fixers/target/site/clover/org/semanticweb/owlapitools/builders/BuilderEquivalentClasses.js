var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":55,"id":477,"methods":[{"el":34,"sc":5,"sl":31},{"el":49,"sc":5,"sl":44},{"el":54,"sc":5,"sl":51}],"name":"BuilderEquivalentClasses","sl":23}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_163":{"methods":[{"sl":31},{"sl":51}],"name":"shouldBuildEquivalentClasses","pass":true,"statements":[{"sl":33},{"sl":53}]},"test_5":{"methods":[{"sl":31},{"sl":44},{"sl":51}],"name":"shouldBuildEquivalentClasses","pass":true,"statements":[{"sl":33},{"sl":46},{"sl":47},{"sl":53}]},"test_95":{"methods":[{"sl":31},{"sl":51}],"name":"shouldBuildEquivalentClasses","pass":true,"statements":[{"sl":33},{"sl":53}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [163, 5, 95], [], [163, 5, 95], [], [], [], [], [], [], [], [], [], [], [5], [], [5], [5], [], [], [], [163, 5, 95], [], [163, 5, 95], [], []]
