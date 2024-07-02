package com.kn.strings;

public class Strings {

	public static void main(String[] args) {
		String s1="Ram";
		String s2="Ram";
		
		if(s1==s2)
		{
			System.out.println("References are point to same object");
		}
		else
		{
			System.out.println("References are point to Different Object");
		}
		if(s1.equals(s2)) {
			System.out.println("String object Data is Equal");
		}
		else {
			System.out.println("String object Data is not Equal");
		}

	}

}
