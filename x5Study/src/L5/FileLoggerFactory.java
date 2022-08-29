package L5;

public class FileLoggerFactory extends LoggerFactory{
    @Override
    public Logger createLogger() {
        return new FileLogger();
    }
}
