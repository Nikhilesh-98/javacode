package app_01;

public class Test2 {
	
	String name;
	int age;
	float salary;
	boolean isActive;

	public static void main(String[] args) {
		
		Test2 e1 = new Test2 ();
		
		e1.name = "Nikhilesh";
		e1.age = 25;
		e1.salary = 40.50f;
		e1.isActive = true;
		
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println(e1.isActive);
		
Test2 e2 = new Test2 ();
		
		e2.name = "Shital";
		e2.age = 26;
		e2.salary = 30.50f;
		e2.isActive = true;
		
		System.out.println(e2.name+" "+e2.age+" "+e2.salary+" "+e2.isActive);
		
		
		
	}

}
