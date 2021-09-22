package com.lockme.app;

public class LockMeMain {

	public static void main(String[] args) {
		 
        FileOperations.createMainFolderIfNotPresent("main");
		
		MenuOptions.printWelcomeScreen("LockMe", "Sangeetha N");
		
		OptionHandling.handleWelcomeScreenInput();
	}

	
}
 
