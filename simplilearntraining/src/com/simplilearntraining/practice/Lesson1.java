package com.simplilearntraining.practice;

public class Lesson1 {

	public static void main(String[] args) {
		 
		// new keyword is used to create a dynamic object
		 Variables obj=new Variables(); // to create object of the class then declare it in the main method
		 obj.method();
		 
		 System.out.println(obj.n); // accessing instance variable
		 System.out.println(Variables.a); // accessing the static variable using classname
		 System.out.println("hi the value of x is:"+obj.x);
	}

}
