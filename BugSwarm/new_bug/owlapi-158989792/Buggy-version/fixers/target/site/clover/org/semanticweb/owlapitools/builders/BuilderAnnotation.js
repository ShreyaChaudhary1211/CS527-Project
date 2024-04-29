var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":77,"id":111,"methods":[{"el":39,"sc":5,"sl":36},{"el":52,"sc":5,"sl":49},{"el":63,"sc":5,"sl":59},{"el":68,"sc":5,"sl":65},{"el":76,"sc":5,"sl":73}],"name":"BuilderAnnotation","sl":26}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_39":{"methods":[{"sl":36},{"sl":59},{"sl":65},{"sl":73}],"name":"shouldBuildAnnotation","pass":true,"statements":[{"sl":38},{"sl":61},{"sl":62},{"sl":67},{"sl":75}]},"test_58":{"methods":[{"sl":36},{"sl":49},{"sl":59},{"sl":65},{"sl":73}],"name":"shouldBuildAnnotation","pass":true,"statements":[{"sl":38},{"sl":50},{"sl":51},{"sl":61},{"sl":62},{"sl":67},{"sl":75}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [39, 58], [], [39, 58], [], [], [], [], [], [], [], [], [], [], [58], [58], [58], [], [], [], [], [], [], [], [39, 58], [], [39, 58], [39, 58], [], [], [39, 58], [], [39, 58], [], [], [], [], [], [39, 58], [], [39, 58], [], []]
