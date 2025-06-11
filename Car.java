public class Car extends Vehicle {
    private boolean isLuxury;

    public Car(String vehicleId, String brand, double rentalRate, boolean isLuxury) {
        super(vehicleId, brand, rentalRate);
        this.isLuxury = isLuxury;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = getRentalRate() * days;
        if (isLuxury) cost += 500; // luxury charge
        return cost;
    }
}
