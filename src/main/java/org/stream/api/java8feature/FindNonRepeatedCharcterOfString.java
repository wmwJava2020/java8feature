package org.stream.api.java8feature;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindNonRepeatedCharcterOfString {

    static void getNonRepeatedChar(){
        String str = "All Java Codes of Today".toLowerCase();

        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(e->e, LinkedHashMap::new,Collectors.counting()));
    }
}
