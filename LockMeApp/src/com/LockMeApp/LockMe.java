package com.LockMeApp;

import java.util.Scanner;

public class LockMe {

	public static void main(String[] args) {
		 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Welcome to the LockMe App\nCreated by Sangeetha N!");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("\nPlease choose from the below options: ");
	
			String menu = "\n1) New User\n" + "2) Registered User\n"
					+ "3) Exit program\n";
			System.out.println(menu);
			Scanner sc=new Scanner(System.in);
			int x = sc.nextInt();
			 
			if(x==1) {
				
				System.out.println("\nEnter the Credentials:\n ");
				
			}
	}

}
