package Task4present;

public class Chocolate extends Present {
    private int uniqueParameter2;

    public Chocolate(String name, double weight, double price, int uniqueParameter2) {
        super(name, weight, price);
        this.uniqueParameter2 = uniqueParameter2;
    }

    public int getUniqueParameter2() {
        return uniqueParameter2;
    }

    public void setUniqueParameter2(int uniqueParameter2) {
        this.uniqueParameter2 = uniqueParameter2;
    }

    @Override
    public String toString() {
        return "Шоколад{" + super.toString() +
                "uniqueParameter2=" + uniqueParameter2 +
                '}';
    }
}
