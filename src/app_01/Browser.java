package app_01;

public class Browser {
	
	String name;
	double version;
	String vendor;
	
	public void getInfo(Browser br) {
		System.out.println(br.name + " "+ br.version+" "+br.vendor);
	}

	public static void main(String[] args) {
		
		Browser br1 = new Browser();
		br1.name="chrome";
		br1.version=1.1;
		br1.vendor="google";
	br1.getInfo(br1);
		

	}

}
