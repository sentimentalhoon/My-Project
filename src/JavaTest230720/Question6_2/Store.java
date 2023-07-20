package JavaTest230720.Question6_2;

public abstract class Store {
    public String name;
    public String event;
    public double price;

    public double maxPrice = 20000;
    public double maxFlvor = 100, maxClean = 100, maxThchnology = 100, maxKindness = 100, maxService = 100;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double grade(){
        return 0;        
    };
}
