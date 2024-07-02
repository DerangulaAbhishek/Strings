package com.kn.strings;

public class StringComparision3 {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Sita";
		String s3="Ram sita";
		String s4="Ram sita";
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
