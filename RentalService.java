import java.util.*;

public class RentalService {
    private List<Vehicle> availableVehicles = new ArrayList<>();
    private List<Vehicle> rentedVehicles = new ArrayList<>();
    private List<RentalRecord> rentalHistory = new ArrayList<>();
    private Map<String, Customer> customerMap = new HashMap<>();
    private Map<String, Vehicle> vehicleMap = new HashMap<>();

    public RentalService() {
        Vehicle v1 = new Car("C101", "Honda City", 1000, true);
        Vehicle v2 = new Car("C102", "Suzuki Swift", 800, false);
        Vehicle v3 = new Bike("B201", "Hero Splendor", 300);
        Vehicle v4 = new Bike("B202", "Bajaj Pulsar", 400);

        addVehicle(v1);
        addVehicle(v2);
        addVehicle(v3);
        addVehicle(v4);
    }

    private void addVehicle(Vehicle v) {
        availableVehicles.add(v);
        vehicleMap.put(v.getVehicleId(), v);
    }

    public void registerCustomer(String name, String licenseNo, String phone) {
        if (!customerMap.containsKey(licenseNo)) {
            Customer c = new Customer(name, licenseNo, phone);
            customerMap.put(licenseNo, c);
            System.out.println("Customer registered successfully.");
        } else {
            System.out.println("Customer already exists.");
        }
    }

    public void rentVehicle(String licenseNo, String vehicleId, int days) {
        Customer customer = customerMap.get(licenseNo);
        if (customer == null) {
            System.out.println("Customer not found.");
            return;
        }

        Vehicle vehicle = null;
        for (Vehicle v : availableVehicles) {
            if (v.getVehicleId().equals(vehicleId)) {
                vehicle = v;
                break;
            }
        }

        if (vehicle == null) {
            System.out.println("Vehicle not available.");
            return;
        }

        double cost = vehicle.calculateRentalCost(days);
        RentalRecord record = new RentalRecord(customer.getName(), vehicle.getVehicleId(), days, cost);
        rentalHistory.add(record);

        rentedVehicles.add(vehicle);
        availableVehicles.remove(vehicle);

        System.out.println("Vehicle rented successfully. Total cost: Rs." + cost);
    }

    public void returnVehicle(String vehicleId) {
        Vehicle vehicle = null;
        for (Vehicle v : rentedVehicles) {
            if (v.getVehicleId().equals(vehicleId)) {
                vehicle = v;
                break;
            }
        }

        if (vehicle != null) {
            rentedVehicles.remove(vehicle);
            availableVehicles.add(vehicle);
            System.out.println("Vehicle returned successfully.");
        } else {
            System.out.println("Vehicle not found in rented list.");
        }
    }

    public void showAvailableVehicles() {
        System.out.println("\nAvailable Vehicles:");
        for (Vehicle v : availableVehicles) {
            System.out.println(v);
        }
    }

    public void showRentalHistory() {
        System.out.println("\nRental History:");
        for (RentalRecord r : rentalHistory) {
            System.out.println(r);
        }
    }
}
