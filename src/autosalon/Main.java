package autosalon;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SalonService service = new SalonService();
        Car c1 = new Car(1, "Toyota", "Camry", 2022, 28000);
        Car c2 = new Car(2, "Toyota", "Corolla", 2021, 19000);
        Car c3 = new Car(3, "BMW", "X5", 2023, 65000);
        service.addCar(c1); service.addCar(c2); service.addCar(c3);
        Client a = new Client(1, "Ivan Petrov", 20000);
        Client b = new Client(2, "Anna Smirnova", 70000);
        service.addClient(a); service.addClient(b);
        service.addOrder(new Order(1, b, c3));

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Menu: 1 - brand, 2 - budget, 0 - exit");
            String cmd = in.hasNextLine() ? in.nextLine().trim() : "0";
            if (cmd.equals("0")) break;
            if (cmd.equals("1")) {
                System.out.print("Brand: ");
                print(service.findByBrand(in.nextLine()));
            } else if (cmd.equals("2")) {
                System.out.print("Min budget: ");
                print(service.filterByBudget(Double.parseDouble(in.nextLine().trim())));
            }
        }
    }

    private static <T> void print(List<T> items) {
        if (items.isEmpty()) System.out.println("Nothing found");
        for (T t : items) System.out.println(t);
    }
}
