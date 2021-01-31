public class Laptop extends HardwareProduct {
    private int screenSize;
    private int camera;

    public Laptop(int productNumber, String productName, int serialNumber, int dimensions, int capacity,
                  String brand, String model, String batteryBackup, String energyConsumption) {
        super(productNumber, productName, serialNumber, dimensions, capacity, brand, model, batteryBackup, energyConsumption);
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return super.toString() + "Laptop{" +
                "screenSize=" + screenSize +
                ", camera=" + camera +
                '}';
    }
}
