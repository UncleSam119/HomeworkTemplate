/*
 * Name:
 * Date:
 * Course Number:
 * Course Name:
 * Problem Number:
 * Email: 
 * Short Description of the Problem
 */

import java.util.Scanner;

public class TemplateForProjects2 {
	final static String TITLE = "CSC111 Project Template";
	final static String CONTINUE_PROMPT = "Do this again? [y/N] ";
	
	//**********************************************
	// Put as many methods you need here
	
	
	//**********************************************
	
	private static void process(Scanner sc, String args[]) {
		// Start Coding your problem in the process method
		
		// Code here is merely a sample
		int x;
		System.out.print("Enter value: ");
		x = sc.nextInt();
		System.out.println("Processing " + x + " ...");
		sc.nextLine();  // Clear Keyboard
	}
	
	//**********************************************
	
	private static boolean doThisAgain(Scanner sc, String prompt) {
		System.out.print(prompt); 
		String doOver = sc.nextLine();
		return doOver.trim().equalsIgnoreCase("Y");
	}
	
	//**********************************************
	
	public static void main(String args[]) {
		System.out.println("Welcome to " + TITLE);
		Scanner sc = new Scanner(System.in);
		do {
			process(sc, args);
		} while (doThisAgain(sc, CONTINUE_PROMPT));
		sc.close();
		System.out.println("Thank you for using " + TITLE);
	}

}