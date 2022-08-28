package app_01;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		int age;
		System.out.println("Enter your age");
	    Scanner sc = new Scanner(System.in);
	    age = sc.nextInt();
	    
	    if(age>18) {
	    	System.out.println("You can vote.");
	    }
	    else {
	    	System.out.println("You can not vote.");
	    	if (age>15) {
	    		System.out.println("You may vote");
	    	}
	    	else {
	    		System.out.println("abcd");
	    	}
	    
	    }

	}

}
