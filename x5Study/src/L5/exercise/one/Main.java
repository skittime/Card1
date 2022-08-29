package L5.exercise.one;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите один знак из (+,-,*,/)");
        String action = scanner.next();
        Calc calc = new Calc(firstNumber, secondNumber, action);
        try {


        System.out.println("Какой логгер нужен? (FILE, CONSOLE, DATABASE)");
        LoggerType type = LoggerType.valueOf(scanner.next());
        LoggerFactory typeLogger = null;
            switch (type) {
                case FILE -> typeLogger = new FileLoggerFactory();
                case CONSOLE -> typeLogger = new ConsoleLoggerFactory();
                case DATABASE -> typeLogger = new DbLoggerFactory();
                default -> System.out.println("Введен неверный логгер");
            }
    if (typeLogger != null ){
        Logger logger = typeLogger.createLogger();
        logger.log(String.valueOf(calc.inputNumbers()));
    }
}catch (Exception e){
        e.printStackTrace();
        }
    }
}
