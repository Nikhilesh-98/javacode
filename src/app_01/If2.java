package app_01;

import java.util.Scanner;

public class If2 {

	public static void main(String[] args) {
		
		int ATMPin ;
		System.out.println("Enter your ATM pin");
		Scanner sc = new Scanner(System.in);
		ATMPin = sc.nextInt();
		
		if (ATMPin == 7512) {
			System.out.println("Your ATM pin is correct..");
			System.out.println("Please enter amount...");
		}
		else {
			System.out.println("ATM pin is incorrect..");
		}
	}

}
