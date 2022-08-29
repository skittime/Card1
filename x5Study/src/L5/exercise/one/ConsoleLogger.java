package L5.exercise.one;

public class ConsoleLogger implements Logger {
    public void log(String message) {
        System.out.println("ConsoleLogger – Log into console: " + message);
    }

}
