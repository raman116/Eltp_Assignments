import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TestCustomer
{
    public static void main(String[] args) throws ParseException {
        Customer customer2 = new Customer(201,"Jamie");
        customer2.setAddress("101, washingtone tower ","washinton DC", "USA", "2345");
        customer2.setPhoneNumbers(47474747,838434834,984722444);
        StockItems[] stockItems = new StockItems[5];
        stockItems[0] = new StockItems(1,"Milk",50,20);
        stockItems[1] = new StockItems(2,"Chicken",500,100);
        stockItems[2] = new StockItems(3,"Egg",10,150);
        stockItems[3] = new StockItems(4,"Apple",50,12);
        stockItems[4] = new StockItems(5,"Oranges",50,10);
        OrderItem[] orderItem1 = new OrderItem[3];
        orderItem1[0] = new OrderItem(stockItems[0],2);
        orderItem1[1] = new OrderItem(stockItems[1],2);
        orderItem1[2] = new OrderItem(stockItems[2],12);
        OrderItem[] orderItem2 = new OrderItem[2];
        orderItem2[0] = new OrderItem(stockItems[3],5);
        orderItem2[1] = new OrderItem(stockItems[4],10);
        PurchaseOrder[] purchaseOrder = new PurchaseOrder[2];
        purchaseOrder[0] = new PurchaseOrder(01,new Date());
        purchaseOrder[0].setOrderItem(orderItem1);
        purchaseOrder[1] = new PurchaseOrder(02,new Date(01-01-2021));
        purchaseOrder[1].setOrderItem(orderItem2);
        customer2.setPurchaseOrders(purchaseOrder);
        customer2.showDetails();
        System.out.println(purchaseOrder.length);
        System.out.println(customer2.totalBill());
        customer2.generateInvoice();
    }
}
