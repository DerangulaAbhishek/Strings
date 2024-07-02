package com.kn.strings;

public class StringMethods2 {

	public static void main(String[] args) {
		String s1="Raja Ram Mohan Roy";
		System.out.println("Returns the Length of the given String ");
		System.out.println(s1.length());
		System.out.println("Returns the boolean true if Substring is start with the given substring ortherwise returns false");
		System.out.println(s1.startsWith("Raja"));
		System.out.println("Returns the boolean true if Substring is start with the given substring with Index ortherwise returns false");
		System.out.println(s1.startsWith("Ram", 5));
		System.out.println("Returns the boolean true if Substring is ends with the given substring ortherwise returns false");
		System.out.println(s1.endsWith("Roy"));
		System.out.println("Returns the Squuence of Characters as an Array");
		char [] crr=s1.toCharArray();
		System.out.println(s1.length());
		System.out.println(crr.length);
		//Forward Direction
		for(int i=0;i<crr.length;i++)
		{
			System.out.print(crr[i]);
		}
		System.out.println();
		//Backward Direction
		for(int i=crr.length-1;i>=0;i--)
		{
			System.out.print(crr[i]);
		}
		System.out.println();
		System.out.println("***********");
		System.out.println("Returns the array of strings computed by splitting this string around matches of the given regular expression");
		
		String [] srr=s1.split(" ");
		//Split Function in Forward Direction
		System.out.println("=======*********========");
		for(int i=0;i<srr.length;i++)
		{
			System.out.print(i+"="+srr[i]);
		}
		System.out.println();
		//Backward Direction
		for(int i=srr.length-1;i>=0;i--)
		{
			System.out.print(srr[i]+" ");
		}
		System.out.println();
		System.out.println("Returns the Replace String ");
		
		System.out.println(s1.replace("Ra", "pa"));
		System.out.println(s1.trim());

	}

}
