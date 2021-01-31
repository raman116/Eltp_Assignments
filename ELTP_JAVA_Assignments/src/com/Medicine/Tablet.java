public class Tablet extends Medicine {
    String tabletName;

    public Tablet(int type) {
        super(type);
    }

    @Override
    public void displayLabel() {
        System.out.println("Take with doctor's approval and store it in cool or dry place");
    }
}
