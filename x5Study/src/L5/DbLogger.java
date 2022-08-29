package L5;

public class DbLogger implements Logger{
    public void log(String message) {
        System.out.println("DbLogger – Log into database: " + message);
    }
}
