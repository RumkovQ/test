package autosalon;

public class Order {
    private final int id;
    private final Client client;
    private final Car car;

    public Order(int id, Client client, Car car) {
        this.id = id;
        this.client = client;
        this.car = car;
    }

    public int getId() { return id; }
    public Client getClient() { return client; }
    public Car getCar() { return car; }

    @Override
    public String toString() { return "Order #" + id + ": " + client.getName() + " -> " + car; }
}
