package com.kn.strings;

public class StringComparison5 {

	public static void main(String[] args) {
		String s1="Ram";
		String s3=s1+" sita";
		String s4=s1+" sita";
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
