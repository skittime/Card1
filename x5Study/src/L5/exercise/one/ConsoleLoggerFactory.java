package L5.exercise.one;

public class ConsoleLoggerFactory extends LoggerFactory{
    @Override
    public Logger createLogger() {
        return new ConsoleLogger();
    }
}
