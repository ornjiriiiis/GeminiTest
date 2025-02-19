public class Vehicle {
    private String serialNo;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;
    
    public Vehicle(String serialNo, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNo = serialNo;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Serial No: " + serialNo);
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Base Cost: $" + baseCost);
    }
    
    // Getters and setters
    public String getSerialNo() {
        return serialNo;
    }
    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
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
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getBaseCost() {
        return baseCost;
    }
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }
}
