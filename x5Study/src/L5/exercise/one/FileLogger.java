package L5.exercise.one;

public class FileLogger implements Logger{
    public void log(String message) {
        System.out.println("FileLogger – Log into file: " + message);
    }
}
