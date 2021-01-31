public class StockItems {
    private int itemNumber;
    private String itemDescription;
    private double itemPrice;
    private int itemQuantity;

    public StockItems(int itemNumber, String itemDescription, double itemPrice, int itemQuantity) {
        this.itemNumber = itemNumber;
        this.itemDescription = itemDescription;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    @Override
    public String toString() {
        return "StockItems{" +
                "itemNumber=" + itemNumber +
                ", itemDescription='" + itemDescription + '\'' +
                ", itemPrice=" + itemPrice +
                ", itemQuantity=" + itemQuantity +
                '}';
    }
}
