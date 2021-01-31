public class StringManipulations {
    public static void main(String[] args) {
        //String reverse = makeReverse("Hey here we are");
       // System.out.println(reverse);
        int arr[] = {3,4,5,6,7,8,5,4,44,66};
        int[] prime = findPrime(arr);
        for(int i=0;i<prime.length;i++)
        {
            System.out.println(prime[i] + " ");
        }
    }
   /* public  static String makeReverse(String sentence)
    {
        String str = sentence;
        String newWord = "";
        String word1[] = str.split(" ");
        for(String word : word1)
        {
            StringBuffer stringBuffer = new StringBuffer(word);
            stringBuffer.reverse();
            newWord += stringBuffer.toString() + " ";
        }
        return newWord;
    }*/
    public static int[] findPrime(int numbers[])
    {
        int primeNumbers[] = new int[numbers.length];
        int count = 0;
        boolean check = false;
        for(int i=0;i<numbers.length;i++)
        {
         //   System.out.println(numbers.length);
            for(int j=2;j<=numbers[i];j++)
            {
                if(numbers[i]%j==0)
                {
                   // System.out.println(numbers[i]);
                    check = true;
                    //primeNumbers[count++] = numbers[i];
                }
            }
            if(check==false)
            {
                primeNumbers[count++] = numbers[i];
            }
        }
        return primeNumbers;
    }
}
