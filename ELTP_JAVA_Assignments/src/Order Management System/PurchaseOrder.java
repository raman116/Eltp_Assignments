import java.util.Arrays;
import java.util.Date;

public class PurchaseOrder {
    private int poNumber;
    private Date orderDate;
    private Date shipDate;
    private OrderItem[] orderItem;
    public PurchaseOrder(int poNumber, Date orderDate) {
        this.poNumber = poNumber;
        this.orderDate = orderDate;
    }

    public int getPoNumber() {
        return poNumber;
    }

    public void setPoNumber(int poNumber) {
        this.poNumber = poNumber;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShipDate() {
        return shipDate;
    }

    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }

    public boolean isShipped(Date shipDate)
    {
        return true;
    }

    public OrderItem[] getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(OrderItem[] orderItem) {
        this.orderItem = orderItem;
    }

    public double sumItems()
    {
        double total =0;
        orderItem = getOrderItem();
        for(int i=0;i<getOrderItem().length;i++)
        {
            total+=orderItem[i].getTotalPrice();

        }
        System.out.println("Total Bill amount is "+ total);
        return total;
    }

    @Override
    public String toString() {
        return "PurchaseOrder{" +
                "poNumber=" + poNumber +
                ", orderDate=" + orderDate +
                ", shipDate=" + shipDate +
                ", orderItem=" + Arrays.toString(orderItem) +
                '}';
    }
}
