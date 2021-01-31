public class ProgramDay {
    public static void main(String[] args) {
        int numbers[] = {10,11,12,14,15,20};
       // int total = totalEven(numbers);
        //System.out.println(total);
        //evenMultiple(numbers);
        String sentence = "Hey it you";
        int length = totalChar(sentence);
        int spaces = totalSpace(sentence);
        int vowel = totalVowel(sentence);
        System.out.println("Characters are " + length + " and spaces are " + spaces + " and vowels are " + vowel);
    }
    public static int totalEven(int[] arr)     // 1. total of even
    {
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static void evenMultiple(int[] arr)    // 2. even multiple of 5
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0 && arr[i]%5==0)
            {
                System.out.println(arr[i]);
            }
        }
    }

    public static int totalChar(String sentence)        // 3. Find total characters in a string
    {
        int count= 0;
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i)!=' ')
            {
                count++;
            }
        }
        return count;
    }
    public  static  int totalVowel(String sentence)                //4. Find total number of vowel
    {
        int count=0;
        for(int i = 0; i < sentence.length(); i++) {
            if ((sentence.charAt(i) == 'a') || (sentence.charAt(i) == 'e') || (sentence.charAt(i) == 'i') || (sentence.charAt(i) == 'o') || (sentence.charAt(i) == 'u') || (sentence.charAt(i) == 'A')
                    || (sentence.charAt(i) == 'E') || (sentence.charAt(i) == 'I') || (sentence.charAt(i) == 'O') || (sentence.charAt(i) == 'U'))
            {
                count++;
            }
        }
        return count;
    }
    public static int totalSpace(String sentence)        // 5. Find total spaces in a string
    {
        int count= 0;
        for(int i = 0; i < sentence.length(); i++)
        {
            if(sentence.charAt(i)==' ')
            {
                count++;
            }
        }
        return count;
    }
}
