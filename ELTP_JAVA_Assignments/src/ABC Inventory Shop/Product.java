public abstract class Product implements iProduct {
    private int productNumber;
    private String productName;
    private int serialNumber;
    public Product(int productNumber, String productName, int serialNumber) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.serialNumber = serialNumber;
    }

    @Override
    public void addProduct(Product[] p) {
        int size =0;
        Product[] products = new Product[p.length];
        for (int i=0;i<p.length;i++)
        {
            products[size++] = p[i];
        }
        for (Product pro:products) {
            System.out.println(pro.toString());
        }
    }


    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", productName='" + productName + '\'' +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
