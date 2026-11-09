package autosalon;

public class Client {
    private final int id;
    private final String name;
    private final double budget;

    public Client(int id, String name, double budget) {
        this.id = id;
        this.name = name;
        this.budget = budget;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getBudget() { return budget; }

    @Override
    public String toString() { return name + " (budget $" + budget + ")"; }
}
