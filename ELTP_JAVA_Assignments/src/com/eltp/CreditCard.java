public class CreditCard {
    public static void main(String[] args) {
        double payback = payBack(2600);
        System.out.println(payback);
    }
    public static double payBack(double totalAmount)
    {
        double amount = totalAmount;
        double payBack;
        if(amount<=500)
        {
            payBack = (amount *0.25)/100;
            return payBack;
        }
        else
        {
            payBack = (500 *0.25)/100;
            amount = amount-500;
        }
        if(amount<=1000 && totalAmount>500)
        {
            payBack = payBack + (amount *0.5)/100;
            return payBack;
        }
        else
        {
            payBack = payBack + (1500 *0.5)/100;
            amount = amount-1500;
        }
        if(amount<=1000 && totalAmount>1500)
        {
            payBack = payBack + (amount *0.75)/100;
            return payBack;
        }
        else
        {
            payBack += (2500 *0.75)/100;
            amount = amount-1000;
            System.out.println(payBack + " 6");
        }
        if(amount!=0 && totalAmount>2500)
        {
            payBack += (amount *1)/100;
        }
        return payBack;
    }
}
