package JavaTest230720.Question6_2;

public class Salon extends Store{
    private double technology;
    private double kindness;

    public Salon(String name, String event, double price, double technology, double kindness) {
        this.technology = technology;
        this.kindness = kindness;
        this.name = name;
        this.event = event;
        this.price = price;
    }

    public double grade(){
        return (((this.kindness/maxKindness) + (this.technology/maxThchnology) + (this.price/maxPrice)) / 3) * 100;
    }
}
