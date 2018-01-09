package main.java.io.symphonia;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InputOutputLambda {
//    public List<Integer> handler(List<Integer> input) {
//        List<Integer> newList = new ArrayList<>();
//        input.forEach(x -> newList.add(100 + x));
//        return newList;
//    }
    public Map<String, String> handler(Map<String, String> input) {
        Map<String, String> newMap = new HashMap<>();
        input.forEach((k,v) -> newMap.put("New Map -> " + k, v));
        return newMap;
    }
}
