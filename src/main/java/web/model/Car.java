package web.model;

public class Car {
    private int series;
    private String model;
    private String owner;

    public Car(int series, String model, String owner) {
        this.series = series;
        this.model = model;
        this.owner = owner;
    }


    public int getSeries() {
        return series;
    }

    public String getModel() {
        return model;
    }

    public String getOwner() {
        return owner;
    }
}
