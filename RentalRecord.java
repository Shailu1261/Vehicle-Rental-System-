public class RentalRecord {
    private String customerName;
    private String vehicleId;
    private int rentalDays;
    private double totalCost;

    public RentalRecord(String customerName, String vehicleId, int rentalDays, double totalCost) {
        this.customerName = customerName;
        this.vehicleId = vehicleId;
        this.rentalDays = rentalDays;
        this.totalCost = totalCost;
    }

    public String toString() {
        return "Customer: " + customerName + ", Vehicle ID: " + vehicleId + ", Days: " + rentalDays + ", Cost: Rs." + totalCost;
    }
}
