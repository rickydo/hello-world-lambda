package main.java.io.symphonia;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

public class InputOutputLambda {
    public PojoResponse handler(PojoInput input) {
        return new PojoResponse("Input was " + input.getA());
    }

    public static class PojoInput {
        private String a;

        public String getA() {
            return a;
        }

        public void setA(String a) {
            this.a = a;
        }
    }

    public static class PojoResponse {
        private final String b;

        PojoResponse(String b) {
            this.b = b;
        }

        public String getB() {
            return b;
        }
    }
}
