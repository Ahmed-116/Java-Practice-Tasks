public abstract class Pharmacuetical {
    String medName;
    String manufacturer;
    String expiryDate;
    StockStatus stockStatus;

    public Pharmacuetical(String medName, String manufacturer, String expiryDate, StockStatus stockStatus) {
        this.medName = medName;
        this.manufacturer = manufacturer;
        this.expiryDate = expiryDate;
        this.stockStatus = stockStatus;
    }
    public abstract void displaySpec();

public boolean isEquivalent(Pharmacuetical pharmacuetical) {
    return this.medName.equals(pharmacuetical.medName) && this.expiryDate.equals(pharmacuetical.expiryDate);
}
}
