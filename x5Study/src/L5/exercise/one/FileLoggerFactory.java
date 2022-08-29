package L5.exercise.one;

public class FileLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {

        return new FileLogger();
    }
}
