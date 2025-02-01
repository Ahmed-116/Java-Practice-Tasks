public class Seat {
    private String seatId;
    private double price;
    private String seatType;
    private boolean available;

    public Seat(String seatId, double price, String seatType, boolean available) {
        this.seatId = seatId;
        this.price = price;
        this.seatType = seatType;
        this.available = available;

    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return
                "seatId='" + seatId +
                        ", price=" + price +
                        ", seatType='" + seatType +
                        ", available=" + available;
    }
}
