package autosalon;

public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final int year;
    private final double price;

    public Car(int id, String brand, String model, int year, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public int getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "#" + id + " " + brand + " " + model + ", " + year + ", $" + price;
    }
}
