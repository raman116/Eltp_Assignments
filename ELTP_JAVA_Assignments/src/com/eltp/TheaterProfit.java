public class TheaterProfit {
    public static void main(String[] args) {
      float profit = calculateProfit(100);
        System.out.println("Total Profit per show is " + profit);
    }
    public static float calculateProfit(int numberOfAttendee)
    {
        float totalIncome = numberOfAttendee*5;
        float totalExpense = (float) (20 + numberOfAttendee*0.5);
        float totalProfit = totalIncome-totalExpense;
        return totalProfit;
    }
}
