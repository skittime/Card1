package L5;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {

        return new DbLogger();
    }
}
