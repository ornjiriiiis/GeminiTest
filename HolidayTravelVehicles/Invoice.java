import java.util.List;

public class Invoice {
    private String invoiceID;
    private String date;
    private String customerID;
    private String salespersonID;
    private String vehicleID;
    private String tradeInVehicleID;
    private List<DealerOption> dealerOptions;
    private double totalAmount;
    
    public Invoice(String invoiceID, String date, String customerID, String salespersonID, 
                   String vehicleID, String tradeInVehicleID, List<DealerOption> dealerOptions, 
                   double totalAmount) {
        this.invoiceID = invoiceID;
        this.date = date;
        this.customerID = customerID;
        this.salespersonID = salespersonID;
        this.vehicleID = vehicleID;
        this.tradeInVehicleID = tradeInVehicleID;
        this.dealerOptions = dealerOptions;
        this.totalAmount = totalAmount;
    }
    
    public void negotiatePrice() {
        // Implementation for price negotiation
    }
    
    // Getters and setters
    public String getInvoiceID() {
        return invoiceID;
    }
    public void setInvoiceID(String invoiceID) {
        this.invoiceID = invoiceID;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getCustomerID() {
        return customerID;
    }
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
    public String getSalespersonID() {
        return salespersonID;
    }
    public void setSalespersonID(String salespersonID) {
        this.salespersonID = salespersonID;
    }
    public String getVehicleID() {
        return vehicleID;
    }
    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }
    public String getTradeInVehicleID() {
        return tradeInVehicleID;
    }
    public void setTradeInVehicleID(String tradeInVehicleID) {
        this.tradeInVehicleID = tradeInVehicleID;
    }
    public List<DealerOption> getDealerOptions() {
        return dealerOptions;
    }
    public void setDealerOptions(List<DealerOption> dealerOptions) {
        this.dealerOptions = dealerOptions;
    }
    public double getTotalAmount() {
        return totalAmount;
    }
}