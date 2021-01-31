public class Prime {
    public static void main(String[] args) {
       /* boolean checkPrime = isPrime(97);
        if(checkPrime==true)
        {
            System.out.println("Number is prime" );
        }
        else
        {
            System.out.println("Number is not prime" );
        }*/
       printPrime(100);
    }
    public static boolean isPrime(int number)
    {
        boolean check = true;
            for(int j=2;j<number;j++)
            {
                if(number%j==0)
                {
                    check = false;
                }
            }
            return check;
    }
    public static void printPrime(int maxValue) {
        boolean check;
        for (int number = 2; number <= maxValue; number++) {
            check = false;
            for (int j = 2; j < number; j++) {
                if (number % j == 0) {
                    check = true;
                    //primeNumbers[count++] = numbers[i];
                }
            }
            if(check==false)
            {
                System.out.println(number);
            }
        }
    }
}
