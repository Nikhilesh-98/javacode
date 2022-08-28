package app_01;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
	    int Exp;
	    System.out.println("Enter your experience");
	    Scanner sc = new Scanner(System.in);
	    Exp = sc.nextInt();
		
		switch (Exp) {
		case 2:
			System.out.println("You are a fresher");
			break;
		
		case 4:
			System.out.println("You are a intermediate");
			break;
			
		case 50:
			System.out.println("You are an experience employee");
			break;
			default:
			System.out.println("You are jobless");
		}

	}

}
