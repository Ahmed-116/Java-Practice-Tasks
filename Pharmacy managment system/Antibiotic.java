public class Antibiotic extends Pharmacuetical implements Classifable{
    String spectrum;
Antibiotic(String medName,String manufacturer,String expiryDate,String spectrum){
    super(medName,manufacturer,expiryDate,StockStatus.INSTOCK);
    this.spectrum = spectrum;
}
    @Override
    public void addMedicine() {
        System.out.println("Medicine added");
    }

    @Override
    public void removeMedicine() {
        System.out.println("Medicine removed");
    }

    @Override
    public void searchMedicine() {
    System.out.println("Medicine searched");

    }

    @Override
    public void displaySpec() {
   System.out.println("Spectrum: " + spectrum);
        System.out.println("Antibiotic :"+medName);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Stock Status: " + stockStatus);
        System.out.println("manufacturer: " + manufacturer);

    }
}
