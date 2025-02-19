public class DealerOption {
    private String optionCode;
    private String description;
    private double price;
    
    public DealerOption(String optionCode, String description, double price) {
        this.optionCode = optionCode;
        this.description = description;
        this.price = price;
    }
    
    // Getters and setters
    public String getOptionCode() {
        return optionCode;
    }
    public void setOptionCode(String optionCode) {
        this.optionCode = optionCode;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
