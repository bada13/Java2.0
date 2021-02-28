/** Задание 4.2 по курсу Java2.0
 * Формируем подарок
 * @author Бахирев Денис
 * */
package Task4present;

public class Main {
    public static void main(String[] args) {
        double sumPrice = 0, sumWeight = 0;

        Candy candy1 = new Candy("Куракум",2.3,2.3,"text");
        Chocolate chocolate1 = new Chocolate("Аленка",100,100,666);
        Jellybean jellybean1 = new Jellybean("Fruittella",25.55,155,12.3);

        System.out.println("Подарок состоит из:");
        Present [] presents = {candy1,chocolate1,jellybean1};
        for (Present somePresent: presents){
            System.out.println(somePresent.toString());
        }

        sumPrice = candy1.getPrice() + chocolate1.getPrice() + jellybean1.getPrice();
        sumWeight = candy1.getWeight() + chocolate1.getWeight() + jellybean1.getWeight();
        System.out.println("Общая стоимость подарка = " + sumPrice + "руб.");
        System.out.println("Общий вес подарка = " + sumWeight + "гр.");
    }
}
