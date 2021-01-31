public class Syrup extends Medicine{
    public Syrup(int type) {
        super(type);
    }

    @Override
    public void displayLabel() {
        System.out.println("Take with precautions and stay away from children");
    }
}
