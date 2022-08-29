package L5.exercise.one;

public class DbLoggerFactory extends LoggerFactory {
    @Override
    public Logger createLogger() {

        return new DbLogger();
    }
}
