package com.kn.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Raja Ram Mohan Roy";
		System.out.println("To Convert String Data in Upper case");
		System.out.println(s1.toUpperCase());
		System.out.println("To Convert String Data in lower case");
		System.out.println(s1.toLowerCase());
		System.out.println("Return the Character at Specifies Index");
		System.out.println(s1.charAt(5));
		System.out.println("Returns index value of first occurance of specifies character");
		System.out.println(s1.indexOf('a'));
		System.out.println("Returns index value of first occurance of specifies character");
		System.out.println(s1.lastIndexOf('a'));
		System.out.println("Returns string starting from specified index");
		System.out.println(s1.substring(5));
		System.out.println("Returns String starting from beginning index till ending index (exclude)");
		System.out.println(s1.substring(9, 14));
		System.out.println("Return true if specified string found else false");
		System.out.println(s1.contains("Rama"));
		

	}

}
