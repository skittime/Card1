package L5.exercise.one;

public class DbLogger implements Logger{
    public void log(String message) {
        System.out.println("DbLogger – Log into database: " + message);
    }
}
