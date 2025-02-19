public class Customer extends Person {
    private String customerID;
    private String name;
    private String address;
    private String phoneNo;
    
    public Customer(String personID, String customerID, String name, String address, String phoneNo) {
        super(personID);
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }
    
    // Getters and setters
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    
}
