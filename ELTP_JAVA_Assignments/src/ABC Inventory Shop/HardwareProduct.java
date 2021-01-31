public abstract class HardwareProduct extends Product{
    private int dimensions;
    private int capacity;
    private String brand;
    private String model;
    private String batteryBackup;
    private String energyConsumption;

    public HardwareProduct(int productNumber, String productName, int serialNumber, int dimensions,
                           int capacity, String brand, String model, String batteryBackup, String energyConsumption) {
        super(productNumber, productName, serialNumber);
        this.dimensions = dimensions;
        this.capacity = capacity;
        this.brand = brand;
        this.model = model;
        this.batteryBackup = batteryBackup;
        this.energyConsumption = energyConsumption;
    }

    @Override
    public String toString() {
        return super.toString() + "HardwareProduct{" +
                "dimensions=" + dimensions +
                ", capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", batteryBackup='" + batteryBackup + '\'' +
                ", energyConsumption='" + energyConsumption + '\'' +
                '}';
    }
}
