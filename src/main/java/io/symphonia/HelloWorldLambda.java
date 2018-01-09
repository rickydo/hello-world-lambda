package main.java.io.symphonia;

public class HelloWorldLambda {
    public String handler(String input) {
        String message = String.format("Hellow, %s!", input);
        return message;
    }
}
