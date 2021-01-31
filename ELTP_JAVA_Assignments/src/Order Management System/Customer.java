import java.util.Arrays;

public class Customer {
    private int id;
    private String name;
    private long homePhone;
    private long workPhone;
    private long cellPhone;
    private String street;
    private String city;
    private String state;
    private String pinCode;
    private PurchaseOrder[] purchaseOrders;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public void printPhoneNumbers()
    {
        System.out.println("HomePhone " + getHomePhone() + " CellPhone " + getCellPhone() + " WorkPhone " + getWorkPhone());
    }
    public void printAddress()
    {
        System.out.println(" Street " + getStreet() + " City " + getCity() + " State " + getState() + " Zip " + getPinCode());
    }
    public void setPhoneNumbers(long cellPhone, long workPhone, long homePhone)
    {
        setCellPhone(cellPhone);
        setWorkPhone(workPhone);
        setHomePhone(homePhone);
    }
    public void setAddress(String street, String city,String state, String pinCode)
    {
        setStreet(street);
        setCity(city);
        setState(state);
        setPinCode(pinCode);
    }
    public void showDetails()
    {
        System.out.println(Customer.this.toString() );
    }
    public int getId() {
        return id;
    }

    public PurchaseOrder[] getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(PurchaseOrder[] purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }

    public String getName() {
        return name;
    }


    public long getHomePhone() {
        return homePhone;
    }

    private void setHomePhone(long homePhone) {
        this.homePhone = homePhone;
    }

    public long getWorkPhone() {
        return workPhone;
    }

    private void setWorkPhone(long workPhone) {
        this.workPhone = workPhone;
    }

    public long getCellPhone() {
        return cellPhone;
    }

    private void setCellPhone(long cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getStreet() {
        return street;
    }

    private void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    private void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    private void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    private void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

   public double totalBill()
   {
       double bill=0;
       purchaseOrders = getPurchaseOrders();
       for(int i=0;i<getPurchaseOrders().length;i++)
       {
           bill+=purchaseOrders[i].sumItems();
       }
       System.out.println("Total Bill for customer " + name + " is " + bill);
       return bill;
   }

   public void generateInvoice()
   {
       long totalPrice;
       for (PurchaseOrder po : getPurchaseOrders()) {
           totalPrice=0;
           String label="--------------------------------------";
           label+="\n Order No :"+po.getPoNumber();
           label+="\n Ordered Date : "+po.getOrderDate();
        //   po.setShipDate(po.getShipDate());
           label+="\n shipped on :"+po.getShipDate();
           label+="\n Items to be shipped ";
           for (OrderItem orderedItem : po.getOrderItem()) {
               label+="\n Item : "+orderedItem.getStockItem().getItemDescription()+", Qty :"+orderedItem.getNumberOfItems()+
                       ",  price :"+orderedItem.getTotalPrice();
               totalPrice+=orderedItem.getTotalPrice();
           }
           label+="\n Total Bill of Order :"+totalPrice;
           System.out.println(label);

       }

   }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homePhone=" + homePhone +
                ", workPhone=" + workPhone +
                ", cellPhone=" + cellPhone +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", purchaseOrders=" + Arrays.toString(purchaseOrders) +
                '}';
    }
}
