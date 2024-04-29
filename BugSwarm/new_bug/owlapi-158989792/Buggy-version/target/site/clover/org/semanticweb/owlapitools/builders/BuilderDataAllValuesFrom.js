var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":52,"id":102143,"methods":[{"el":32,"sc":5,"sl":29},{"el":46,"sc":5,"sl":42},{"el":51,"sc":5,"sl":48}],"name":"BuilderDataAllValuesFrom","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_2406":{"methods":[{"sl":29},{"sl":42},{"sl":48}],"name":"shouldBuildDataAllValuesFrom","pass":true,"statements":[{"sl":31},{"sl":44},{"sl":45},{"sl":50}]},"test_3026":{"methods":[{"sl":29},{"sl":48}],"name":"shouldBuildDataAllValuesFrom","pass":true,"statements":[{"sl":31},{"sl":50}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [2406, 3026], [], [2406, 3026], [], [], [], [], [], [], [], [], [], [], [2406], [], [2406], [2406], [], [], [2406, 3026], [], [2406, 3026], [], []]
