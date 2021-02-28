package Task4present;

public class Jellybean extends Present{
    private double uniqueParameter3;

    public Jellybean(String name, double weight, double price, double uniqueParameter3) {
        super(name, weight, price);
        this.uniqueParameter3 = uniqueParameter3;
    }

    public double getUniqueParameter3() {
        return uniqueParameter3;
    }

    public void setUniqueParameter3(double uniqueParameter3) {
        this.uniqueParameter3 = uniqueParameter3;
    }

    @Override
    public String toString() {
        return "Мармелад{" + super.toString() +
                "uniqueParameter3=" + uniqueParameter3 +
                '}';
    }
}
