package Task5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorInterface {
    private CalculatorCalculations calculator;

    public CalculatorInterface()    {
        calculator = new CalculatorCalculations();
    }

    public void doIt(){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите операцию которую хотите выполнить (+,-,/,*): ");
        char operation = input.next().charAt(0);
        
        boolean inputCorrect;
        double num1 = 0, num2 = 0;

        System.out.print("Введите первое число: ");
        do {
            try {
                inputCorrect = false;
                num1 = input.nextDouble();
            } catch (InputMismatchException e) {
                input.next();
                inputCorrect = true;
                System.out.println("Введенное значение некорректно. Введите первое число: ");
            }
        } while (inputCorrect);

        System.out.print("Введите второе число: ");
        do {
            try {
                inputCorrect = false;
                num2 = input.nextDouble();
            } catch (InputMismatchException e) {
                input.next();
                inputCorrect = true;
                System.out.println("Введенное значение некорректно. Введите второе число: ");
            }
        } while (inputCorrect);

        switch (operation) {
            case '+':
                System.out.printf("Операция сложения.\nРезультат = %.4f", calculator.Addition(num1, num2));
                break;
            case '-':
                System.out.printf("Операция вычитания.\nРезультат = %.4f", calculator.Subtraction(num1, num2));
                break;
            case '*':
                System.out.printf("Операция умножения.\nРезультат = %.4f", calculator.Multiplication(num1, num2));
                break;
            case '/':
                try {
                    double res = calculator.Division(num1, num2);
                    if (res == Double.POSITIVE_INFINITY ||
                            res == Double.NEGATIVE_INFINITY)
                        throw new ArithmeticException();
                    System.out.printf("Операция деления.\nРезультат = %.4f", res);
                } catch (ArithmeticException ex) {
                    System.out.println("Делить на 0 нельзя");
                }
                break;
        }

    }
}
