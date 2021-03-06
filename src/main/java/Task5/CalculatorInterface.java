package Task5;

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

        System.out.print("Введите первое число: ");
        double num1 = input.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = input.nextDouble();

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
                System.out.printf("Операция деления.\nРезультат = %.4f", calculator.Division(num1, num2));
                break;
        }

    }
}
