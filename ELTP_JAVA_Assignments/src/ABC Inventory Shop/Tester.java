public class Tester {
    public static void main(String[] args) {
        MsOffice msOffice = new MsOffice(01,"MsOffice",2020202,"Windows 10",512,"ABS2334","V1.1");
        msOffice.setUsage("It is used for Official purpose");
       // System.out.println(msOffice.toString());

        Laptop laptop = new Laptop(001,"Laptop",10101,200,8,"Lenovo","idepad" ,
                "4Hr","20 watt");
        laptop.setCamera(20);
        laptop.setScreenSize(18);
        //System.out.println(laptop.toString());
    }
}
