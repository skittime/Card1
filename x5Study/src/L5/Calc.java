package L5;

import java.util.Scanner;

public class Calc {

    Calc() throws Exception {
        System.out.println("Введите первое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Введите действие");
        String doIt = scanner.nextLine();
        inputNumbers(a, b, doIt);

    }

    public void inputNumbers(int a, int b, String doIt) {
        int result = 0;
        switch (doIt) {
            case "+":
                result = a + b;
            case "-":
                result = a - b;
            case "*":
                result = a * b;
            case "/":
                result = a / b;

            default:
                System.out.println("Введено неверное действие вычисления");


        }
    }
}