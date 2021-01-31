public class InterestCalculation {
    public static void main(String[] args) {
        //double interestAmount = callInterest(10000);
        double taxAmount = callTax(480);
        //System.out.println("Interest amount per year is = " + interestAmount);
        System.out.println("Tax amount per year is = " + taxAmount);
    }
    public  static double  callInterest(int amount)    // Interest amount
    {
        double interestAmount;
        if(amount<=1000)
        {
            interestAmount = (amount*4)/100;
        }
        else if(amount>1000 && amount<=5000)
        {
         interestAmount = ((amount*4.5)/100);
        }
        else
        {
            interestAmount = ((amount*5)/100);
        }
        return interestAmount;
    }
    public static double callTax(int amount)        // Tax amount
    {
        double taxAmount;
        if(amount<=240)
        {
            taxAmount = (amount*0)/100;
        }
        else if(amount>240 && amount<=480)
        {
            taxAmount = ((amount*15)/100);
        }
        else
        {
            taxAmount = ((amount*28)/100);
        }
        return taxAmount;
    }
}
