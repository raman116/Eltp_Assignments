public class TestMedicine {
    public static void main(String[] args) {
        Medicine medicine[] = new Medicine[10];
        for(int i=0;i<10;i++)
        {
            medicine[i].setType((int) Math.random());
        }
    }
}
