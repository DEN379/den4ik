package oop_l4;
import java.util.Scanner;

public class Human {
	Scanner scan = new Scanner(System.in);

	
	
	public void hum(String a,String b,int c) {
		System.out.println("vvedit imya");
		String name = scan.nextLine();
		System.out.println("vvedit stat");
		String sex = scan.nextLine();
		System.out.println("vvedit rik narodjennya");
		int year=scan.nextInt();
		a=name;
		b=sex;
		c=year;
		
		System.out.println("name => "+a);
		System.out.println("sex => "+b);
		System.out.println("yaer => "+c);
	}


	
}
