public class ElectricityBill {
    public static void main(String[] args) {
        double billAmount = calculateBill("commercial",240);
        System.out.println("Bill amount is " + billAmount);
    }
    public static double calculateBill(String type, double units)
    {
        double billAmount = 0;
        if(type.equalsIgnoreCase("Commercial"))
        {
            if(units<=100)
            {
                 double amount = units*4.25;
                 if(amount>350)
                 {
                     billAmount = amount;
                 }
                 else
                 {
                     billAmount = 350;
                 }
            }
            else if(units>100&& units<=300)
            {
                billAmount = units*4.75;
            }
            else if(units>300&& units<=500)
            {
                billAmount = units*5;
            }
            else {
                billAmount = units*5.25;
            }
        }
        else if(type.equalsIgnoreCase("domestic"))
        {
            if(units<=100)
            {
                double amount = units*4;
                if(amount>250)
                {
                    billAmount = amount;
                }
                else
                {
                    billAmount = 250;
                }
            }
            else if(units>100&& units<=300)
            {
                billAmount = units*4.5;
            }
            else if(units>300&& units<=500)
            {
                billAmount = units*4.75;
            }
            else {
                billAmount = units*5;
            }
        }
        return billAmount;
    }
}
