public class Pattern {
    public static void main(String[] args) {
        //patternFirst();
        //wordPattern("Hello");
        wordLinePattern("Hey There what's up");
    }
    public static void patternFirst()       // 6.A
    {
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(j+1 + " ");
            }
            System.out.println("");
        }
        for(int i=4;i>1;i--)
        {
            for(int j=1;j<i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
    public static void wordPattern(String word)    //6.B
    {
        for(int i=0;i<word.length();i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print(word.charAt(j)+" ");
            }
            System.out.println("");
        }
    }
    public static void wordLinePattern(String sentence)    //6.C
    {
        String[] word = sentence.split(" ");
        for(int i=0;i<word.length;i++)
        {
            for(int j =0;j<=i;j++)
            {
                System.out.print(word[j]+ " ");
            }
            System.out.println("");
        }
    }
}
