public class Bike extends Vehicle {
    public Bike(String vehicleId, String brand, double rentalRate) {
        super(vehicleId, brand, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
}
