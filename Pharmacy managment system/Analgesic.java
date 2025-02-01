public class Analgesic extends Pharmacuetical implements Classifable{

    String painType;
    Analgesic(String medName,String manufacturer,String expiryDate,String spectrum){
        super(medName,manufacturer,expiryDate,StockStatus.INSTOCK);
        this.painType = painType;
    }
    @Override
    public void addMedicine() {
        System.out.println("Add medicine");
    }

    @Override
    public void removeMedicine() {
       System.out.println("Remove medicine");
    }

    @Override
    public void searchMedicine() {
        System.out.println("Search medicine");

    }

    @Override
    public void displaySpec() {
        System.out.println("Display specification");
        System.out.println("Antibiotic :"+medName);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Stock Status: " + stockStatus);
        System.out.println("manufacturer: " + manufacturer);
    }
}

