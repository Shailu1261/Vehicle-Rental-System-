public abstract class Vehicle {
    private String vehicleId;
    private String brand;
    private double rentalRate;

    public Vehicle(String vehicleId, String brand, double rentalRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentalRate = rentalRate;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String toString() {
        return vehicleId + " - " + brand + " (Rate: Rs." + rentalRate + "/day)";
    }
} 