package com.kn.stringBuffer;

public class StringBufferDemo {
  public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Rama ");
		System.out.println("Data = "+sb);
		System.out.println("Length = "+sb.length());
		//The capacity() method of the StringBuffer class returns 
		//the current capacity of the buffer. The default capacity 
		//of the buffer is 16. If the number of character increases 
		//from its current capacity, it increases the capacity by (oldcapacity*2)+2. 
		//For example if your current capacity is 16, it will be (16*2)+2=34.
		System.out.println("Data = "+sb.capacity());
		System.out.println("************");
		System.out.println();
		sb.append(" Sita ");
		sb.append(" Sita ");
		sb.append(" Sita ");
		sb.append(" Sita ");
		System.out.println("Data = "+sb);
		System.out.println("Length = "+sb.length());
		//New Capacity is produced until the the current Capacity is full with the Newly added String.
		//With this Formula
		//  New Capacity = (Current Capacity *2)+2
		System.out.println("Data = "+sb.capacity());
		//The append() concatenates the given argument with this string
		System.out.println(sb.append("Sita"));
		System.out.println(sb.append("1466.86"));
		//insert() inserts the given String with this string at given position
		System.out.println(sb.insert(0, "Hi "));
		//replace() method is used to replace the given string from the specified begin index to the end index
		System.out.println(sb.replace(0, 5, "Hey"));
		//delete() method is used to  the given string from the specified begin index to the end index
		System.out.println(sb.replace(0, 0, "Hey"));
		// reverse() method of the StringBuilder class reverses the current String
		System.out.println(sb.reverse());
		
  
  
  
  
  }

}
 