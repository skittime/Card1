package L5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Calc calc = new Calc();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        try {
            LoggerType loggerType = LoggerType.valueOf(scanner.nextLine().toUpperCase());
            LoggerFactory loggerFactory = null;
            switch (loggerType) {
                case FILE -> loggerFactory = new FileLoggerFactory();
                case CONSOLE -> loggerFactory = new ConsoleLoggerFactory();
                case DATABASE -> loggerFactory = new DbLoggerFactory();
                default -> System.out.println("Ни одно значение не верно");
            }

            if (loggerFactory != null) {
                Logger logger = loggerFactory.createLogger();
                logger.log(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Введено не то значение");
        }

    }
}
