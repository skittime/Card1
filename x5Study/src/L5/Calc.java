package L5;

public class Calc {
    int result = 0;
    static int a, b;
    String doit, action ;

    Calc(int firstNumber, int secondNumber, String doIt) {
        this.doit = doIt;
               switch (doIt) {
            case ("+"):
                result = summ(firstNumber, secondNumber);
                break;
            case ("-"):
                result = subtraction(firstNumber, secondNumber);
                break;
            case ("*"):
                result = multiplication(firstNumber, secondNumber);
                break;
            case ("/"):
                result = division(firstNumber, secondNumber);
                break;

            default:
                System.out.println("Введено неверное действие вычисления");

        }
    }


    private int summ(int a, int b) {
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

