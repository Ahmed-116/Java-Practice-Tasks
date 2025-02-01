public class Sender {
    private String senderName;
    private String senderAddress;

    public Sender(String senderName, String senderAddress) {
        this.senderName = senderName;
        this.senderAddress = senderAddress;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderAddress() {
        return senderAddress;
    }

    public void setSenderAddress(String senderAddress) {
        this.senderAddress = senderAddress;
    }

    @Override
    public String toString() {
        return "Sender{" +
                "senderName='" + senderName + '\'' +
                ", senderAddress='" + senderAddress + '\'' +
                '}';
    }
}
