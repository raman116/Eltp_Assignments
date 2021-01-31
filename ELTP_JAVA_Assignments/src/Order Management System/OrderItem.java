public class OrderItem {
    private StockItems stockItem;
    private int numberOfItems;

    public OrderItem(StockItems stockItem, int numberOfItems) {
        this.stockItem = stockItem;
        this.numberOfItems = numberOfItems;
    }

    public StockItems getStockItem() {
        return stockItem;
    }

    public void setStockItem(StockItems stockItem) {
        this.stockItem = stockItem;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(int numberOfItems) {
        this.numberOfItems = numberOfItems;
    }


    public double getTotalPrice()
    {
        double total = 0;
        total = stockItem.getItemPrice()*numberOfItems;
        return total;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "stockItem=" + stockItem +
                ", numberOfItems=" + numberOfItems +
                '}';
    }
}
