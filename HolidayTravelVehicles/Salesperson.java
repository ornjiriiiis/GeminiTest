public class Salesperson extends Person {
    private String salespersonID;
    private String name;
    private int numberOfSales;
    
    public Salesperson(String personID, String salespersonID, String name, int numberOfSales) {
        super(personID);
        this.salespersonID = salespersonID;
        this.name = name;
        this.numberOfSales = numberOfSales;
    }
    
    // Getters and setters
    public String getSalespersonID() {
        return salespersonID;
    }
    public void setSalespersonID(String salespersonID) {
        this.salespersonID = salespersonID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfSales() {
        return numberOfSales;
    }
    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }
}