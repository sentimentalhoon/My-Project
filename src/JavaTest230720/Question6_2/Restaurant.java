package JavaTest230720.Question6_2;

public class Restaurant extends Store{
    private double service;
    private double flavor;
    private double clean;

    public Restaurant(String name, String event, double price, double service, double flavor, double clean) {
        this.service = service;
        this.flavor = flavor;
        this.clean = clean;
        this.name = name;
        this.event = event;
        this.price = price;
    }

    public double grade(){
        return (((this.service / maxService) + (this.flavor/maxFlvor) + (this.clean/maxClean) + (this.price/maxPrice)) / 4) * 100;
    }
    public double getService() {
        return service;
    }

    public void setService(double service) {
        this.service = service;
    }

    public double getFlavor() {
        return flavor;
    }

    public void setFlavor(double flavor) {
        this.flavor = flavor;
    }

    public double getClean() {
        return clean;
    }

    public void setClean(double clean) {
        this.clean = clean;
    }

}
