public class InventoryClerk {
    String ClerkId;
    String authCode;
    Pharmacuetical[] processedMedicine;

    public InventoryClerk(String clerkId, String authCode) {
        this.ClerkId = clerkId;
        this.authCode = authCode;
        processedMedicine = new Pharmacuetical[6];
    }
    public void handleDuplicateMedicine(){

    }
}
