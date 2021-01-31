public abstract class SoftwareProduct extends Product{
    private String operatingSystem;
    private int memory;
    private String licenceKey;
    private String version;

    public SoftwareProduct(int productNumber, String productName, int serialNumber, String operatingSystem, int memory, String licenceKey, String version) {
        super(productNumber, productName, serialNumber);
        this.operatingSystem = operatingSystem;
        this.memory = memory;
        this.licenceKey = licenceKey;
        this.version = version;
    }

    @Override
    public String toString() {
        return super.toString() + "SoftwareProduct{" +
                "operatingSystem='" + operatingSystem + '\'' +
                ", memory=" + memory +
                ", licenceKey='" + licenceKey + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}
