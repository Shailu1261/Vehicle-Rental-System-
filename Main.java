import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RentalService service = new RentalService();

        while (true) {
            System.out.println("\n----- Vehicle Rental System -----");
            System.out.println("1. Register Customer");
            System.out.println("2. Show Available Vehicles");
            System.out.println("3. Rent a Vehicle");
            System.out.println("4. Return a Vehicle");
            System.out.println("5. View Rental History");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter license no: ");
                    String license = sc.nextLine();
                    System.out.print("Enter phone no: ");
                    String phone = sc.nextLine();
                    service.registerCustomer(name, license, phone);
                    break;

                case 2:
                    service.showAvailableVehicles();
                    break;

                case 3:
                    System.out.print("Enter license no: ");
                    String lic = sc.nextLine();
                    System.out.print("Enter vehicle ID: ");
                    String vid = sc.nextLine();
                    System.out.print("Enter number of days: ");
                    int days = sc.nextInt();
                    sc.nextLine();
                    service.rentVehicle(lic, vid, days);
                    break;

                case 4:
                    System.out.print("Enter vehicle ID to return: ");
                    String returnId = sc.nextLine();
                    service.returnVehicle(returnId);
                    break;

                case 5:
                    service.showRentalHistory();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
