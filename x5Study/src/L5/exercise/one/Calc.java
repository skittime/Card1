package L5.exercise.one;

public class Calc {
    int result;
    String action;

    Calc(int firstNumber, int secondNumber, String doIt) {
        this.action = doIt;
        switch (doIt) {
            case ("+") -> result = sum(firstNumber, secondNumber);
            case ("-") -> result = subtraction(firstNumber, secondNumber);
            case ("*") -> result = multiplication(firstNumber, secondNumber);
            case ("/") -> result = division(firstNumber, secondNumber);
            default -> System.out.println("Введено неверное действие вычисления");
        }
    }


    private int sum(int a, int b) {
        return a + b;
    }

    private int subtraction(int a, int b) {
        return a - b;
    }

    private int multiplication(int a, int b) {
        return a * b;
    }

    private int division(int a, int b) {
        return a / b;
    }


    public int inputNumbers() {
        return result;
    }
}

