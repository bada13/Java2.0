/** Задания 1-3 по курсу Java2.0
 * Калькулятор и поиск максимальной длины элемента в массиве
 * @author Бахирев Денис
 * */
package Task1_3;

import java.util.Scanner; // импорт сканнера

public class Task1_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 1 если хотите использовать калькулятор");
        System.out.println("Введите 2 если хотите найти максимальный элемент в массиве");
        int choice = input.nextInt();

        char operation;
        switch (choice){
            case 1:
                System.out.print("Введите первое число: ");
                double num1 = input.nextDouble();
                System.out.print("Введите второе число: ");
                double num2 = input.nextDouble();
                System.out.print("Введите операцию которую хотите выполнить (+,-,/,*): ");
                operation = input.next().charAt(0);
                double result;
                switch (operation){
                    case '+':
                        result = num1 + num2;
                        System.out.printf("Операция сложения.\nРезультат = %.4f" ,result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.printf("Операция вычитания.\nРезультат = %.4f" ,result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.printf("Операция умножения.\nРезультат = %.4f" ,result);
                        break;
                    case '/':
                        result = num1 / num2;
                        System.out.printf("Операция деления.\nРезультат = %.4f" ,result);
                        break;
                    default:
                        System.out.println("Ошибка. Введено значение отличное от +,-,/,*");
                }
                break;
            case 2:
                System.out.print("Введите размер массива: ");
                int size = input.nextInt();
                input.nextLine();
                String[] array = new String[size];
                for (int i = 0; i < array.length; i++) {
                    System.out.print("Введите " + (i+1) +"-е слово : ");
                    array[i] = input.nextLine();
                }
                //подсчет символов в слове
                //запись максимальной длины слова
                int maxLength = 0;
                for(String word : array) {
                    if(word.length() > maxLength) maxLength = word.length();
                }
                System.out.println("Самое длинное слово содержит: " + maxLength + " символов");
                //вывод слов где длина слова равна максимальной длине слова
                for(String word: array) {
                    if(word.length() == maxLength) System.out.println("Самое длинное слово: " + word);
                }
                break;
            default:
                System.out.println("Ошибка. Введено значение отличное от 1 или 2");
        }
    }

}

