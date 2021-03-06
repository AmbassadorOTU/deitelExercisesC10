package chapterThree;

public class PetrolPurchase {
    private String location;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public void petrolPurchase(String location, String petrolType, int quantity, double price, double percentageDiscount) {
        this.location = location;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = price;
        this.percentageDiscount = percentageDiscount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount() {
        double netPurchaseAmount = (quantity * pricePerLiter) - percentageDiscount;
        return netPurchaseAmount;
    }
}
