package com.eltp;

public class Programs {
public static void main(String args[])
{
	int occur =  checkOccurance("HEY THERE CHECK THERE","THERE");
	int[] arr = {1,2,4,6,233,9,5};
	int index = findPosition(9,arr);
	System.out.println(index);
}
public static int checkOccurance(String sentence, String word)
{
	int count = 0;
	String str = sentence;
	String word1[] = str.split(" ");
	for(int i=0;i<word1.length;i++)
	{
		if(word1[i].equals(word))
		{
			count++;
		}
	}
	return count;
}
public static int findPosition(int number, int[] word)
{
	int count = 0;
	for(int i=0;i<word.length;i++)
	{
		if(word[i]==number)
		{
			return i;
		}
	}
	return 00;
}
}
