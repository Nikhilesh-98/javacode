package app_01;

import java.util.Scanner;

public class If3 {

	public static void main(String[] args) {
		
		int age;
		System.out.println("Enter your age");
		Scanner sc = new Scanner(System.in);
		age =sc. nextInt();
		
		if(age<=5){
			System.out.println("You are in Jr.Kg");
		}
		else if(age<10) {
			System.out.println("You are in school");
		}
		else if(age<18) {
			System.out.println("You are in college");
		}
		else if(age<22) {
			System.out.println("You are doing your graduation");
		}
		else if(age<30) {
			System.out.println("You are doing your job");
		}
		else if(age<50) {
			System.out.println("You are doing your business");
		}
		else if (age<120) {
			System.out.println("You are died");
		}
		
	}

	

}
