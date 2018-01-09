package main.java.io.symphonia;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class InputOutputLambda {
    public Map<String, Map<String, Integer>> handler (List<Map<String, Integer>> input) {
        Map<String, Map<String, Integer>> newMap = new HashMap<>();
        IntStream.range(0, input.size())
                .forEach(i -> newMap.put("Nested at position " + i, input.get(i)));
        return newMap;
    }
}
