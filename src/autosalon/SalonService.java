package autosalon;

import java.util.ArrayList;
import java.util.List;

public class SalonService {
    private final List<Car> cars = new ArrayList<>();
    private final List<Client> clients = new ArrayList<>();
    private final List<Order> orders = new ArrayList<>();

    public void addCar(Car car) { cars.add(car); }
    public void addClient(Client client) { clients.add(client); }
    public void addOrder(Order order) { orders.add(order); }

    public List<Order> getOrders() { return new ArrayList<>(orders); }

    /** Поиск автомобилей по марке (без учёта регистра). */
    public List<Car> findByBrand(String brand) {
        List<Car> result = new ArrayList<>();
        for (Car c : cars) {
            if (c.getBrand().equalsIgnoreCase(brand.trim())) {
                result.add(c);
            }
        }
        return result;
    }

    /** Фильтрация клиентов по бюджету (не меньше minBudget). */
    public List<Client> filterByBudget(double minBudget) {
        List<Client> result = new ArrayList<>();
        for (Client c : clients) {
            if (c.getBudget() >= minBudget) {
                result.add(c);
            }
        }
        return result;
    }
}
