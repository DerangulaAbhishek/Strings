package com.kn.strings;

public class StringComparison7 {

	public static void main(String[] args) {
		String s1="Ram";
		String s2=s1;
		
		//Reference Comparison
		if(s1==s2)
		{
			System.out.println("References are point to same object");
		}
		else 
		{
			System.out.println("References are point to different object");
		}
		//String Comparison
		if(s1 .equals(s2))
		{
			System.out.println("String data is same");
		}
		else 
		{
			System.out.println("String data is Not same");
		}

	}

}
