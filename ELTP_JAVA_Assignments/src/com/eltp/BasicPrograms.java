public class BasicPrograms {
    public static void main(String[] args) {
        /*int max = calMax(10,20,5);
        System.out.println(max);*/
        boolean vowel = checkVowel('a');
        if(vowel==true)
        {
            System.out.println("VOWEL");
        }
        else
        {
            System.out.println("Not a Vowel");
        }
    }
    public static int  calMax(int x, int y, int z)           //Max of three
    {
        if(x>y&&x>z)
        {
            return x;
        }
        if(y>x&&y>z)
        {
            return y;
        }
        if(z>y&&z>x)
        {
            return z;
        }
        return 0;
    }
    public  static  boolean checkVowel(char character)                //Find a vowel
    {
        boolean check=false;
        if((character=='a')||(character=='e')||(character=='i')||(character=='o')||(character=='u')||(character=='A')
            ||(character=='E')||(character=='I')||(character=='O')||(character=='U'))
        {
            check = true;
        }
     return check;
    }
}
