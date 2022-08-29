package L5;

public class ConsoleLogger implements Logger{
    public void log (String message){
        System.out.println("ConsoleLogger – Log into console: " + message);
    }

}
