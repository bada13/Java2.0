/** Задание 4.1 по курсу Java2.0
 * Заполнение массива случайными числами
 * Поменять местами минимальное полоположительное значение и максимальное отрицательное
 * @author Бахирев Денис
 * */
package Task4array;

public class Array {
    public static void main(String[] args) {
        int size = 20;
        //Заполнение массива рандомными значениями
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 21) - 10);
        }
        //объявление максимальных и минимальных значений по умолчанию
        int max = -11;
        int min = 11;
        //Индексы максимального и минимального значения.
        int indexMax = 0;
        int indexMin = 0;
        for(int i = 0; i != array.length; i ++){
            if(array[i] > 0 && array[i] < min){
                min = array[i];
                indexMin = i;
            }
            if(array[i] < 0 && array[i] > max){
                max = array[i];
                indexMax = i;
            }
        }

        System.out.println("Максимально отрицательный элемента = " + max);
        System.out.println("Индекс максимально отрицательного элемента = " + (indexMax+1));
        System.out.println("Минимально положительный элемента = " + min);
        System.out.println("Индекс минимально положительного элемента = " + (indexMin+1));
        System.out.println("Массив до перестановки");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        array[indexMax] = min;
        array[indexMin] = max;
        System.out.println("\nМассив после перестановки");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
    }

}
