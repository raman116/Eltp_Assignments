public class MsOffice extends SoftwareProduct {
    private String usage;

    public MsOffice(int productNumber, String productName, int serialNumber, String operatingSystem, int memory, String licenceKey, String version) {
        super(productNumber, productName, serialNumber, operatingSystem, memory, licenceKey, version);
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return super.toString() + "MsOffice{" +
                "usage='" + usage + '\'' +
                '}';
    }
}
