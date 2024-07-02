package com.kn.strings;

public class Strings2 {

	public static void main(String[] args) {
		String s1=new String ("Ram");
		String s2=new String ("Ram");
		
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
