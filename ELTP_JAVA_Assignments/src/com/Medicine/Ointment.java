public class Ointment extends Medicine {
    public Ointment(int type) {
        super(type);
    }

    @Override
    public void displayLabel() {
        System.out.println("for external use only");
    }
}
