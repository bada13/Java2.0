package Task4present;

public class Candy extends Present {
    private String uniqueParameter1;

    public Candy(String name, double weight, double price, String uniqueParameter1) {
        super(name, weight, price);
        this.uniqueParameter1 = uniqueParameter1;
    }

    public String getUniqueParameter1() {
        return uniqueParameter1;
    }

    public void setUniqueParameter1(String uniqueParameter1) {
        this.uniqueParameter1 = uniqueParameter1;
    }

    @Override
    public String toString() {
        return "Конфеты{" + super.toString() +
                "uniqueParameter1='" + uniqueParameter1 + '\'' +
                '}';
    }
}
