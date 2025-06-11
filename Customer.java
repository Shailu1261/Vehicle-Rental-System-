public class Customer {
    private String name;
    private String licenseNo;
    private String phone;

    public Customer(String name, String licenseNo, String phone) {
        this.name = name;
        this.licenseNo = licenseNo;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public String getPhone() {
        return phone;
    }
}