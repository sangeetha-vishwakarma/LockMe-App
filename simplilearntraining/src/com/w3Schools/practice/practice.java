package com.w3Schools.practice;

public class practice {

	public static void main(String[] args) {
		
		System.out.println("Hello World!!");
		String name = "Joey";
		final int num=10;  //num becomes read only
		//num=20;
		float num1=10.33f; // add datatype at the end
		char letter='S';
		
		String firstname = "Tom";
		String lastname = "Cruise";
		String fullname = firstname +  lastname;
		System.out.println("Name is :"  +fullname);
		
		System.out.println("Name is:"  +name);
		System.out.println(num);
		System.out.println(num1);
		System.out.println(letter);
		System.out.println(num +" "+num1);
		System.out.println(num + num1);
	}

}
