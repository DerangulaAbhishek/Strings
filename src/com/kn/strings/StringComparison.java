package com.kn.strings;

public class StringComparison {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Sita";
		String s3=s1+s2;
		String s4=s1+s2;
		//Reference Comparison
		if(s3==s4)
		{
			System.out.println("References are point to same object");
		}
		else 
		{
			System.out.println("References are point to different object");
		}
		//String Comparison
		if(s3.equals(s4))
		{
			System.out.println("String data is same");
		}
		else 
		{
			System.out.println("String data is Not same");
		}

	}

}
