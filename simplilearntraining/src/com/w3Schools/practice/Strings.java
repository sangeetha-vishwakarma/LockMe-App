package com.w3Schools.practice;

public class Strings {

	public static void main(String[] args) {
		 
		String firstname = "Tom";
		String lastname = "Cruise";
		
		String txt1="We are the So called \"VIKINGS\" from the south";
		
		String fullname = firstname +  lastname;
		System.out.println("Name is :"  +fullname); //concatenation
		System.out.println("---------------------");
		System.out.println("Quote is: " +txt1);
		System.out.println("String length is :"+txt1.length());
		System.out.println("---------------------");
		System.out.println("Name is :"  +firstname.concat(lastname)); //concatenation
		
		System.out.println("---------------------");
		
		System.out.println("String length is :"  +fullname.length());
		System.out.println("Uppercase String is :"  +fullname.toUpperCase());
		System.out.println("LowerCase String is :"  +fullname.toLowerCase());
		
		System.out.println("---------------------");
		
		String txt = "Please locate where 'locate' occurs!";
		System.out.println(txt.indexOf("locate")); // Outputs 7

	}

}
