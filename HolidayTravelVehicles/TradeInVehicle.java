public class TradeInVehicle {
    private String serialNo;
    private String make;
    private String model;
    private int year;
    
    public TradeInVehicle(String serialNo, String make, String model, int year) {
        this.serialNo = serialNo;
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Getters and setters
    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
