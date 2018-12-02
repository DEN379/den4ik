package oop_l4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Human h=new Human();
		h.hum(null, null,0);
		
		Student s=new Student();
		s.stud();
		System.out.println("vvedit disciplini -> ");
		
		for(int i=0;i<s.qu_discipline;i++) {
			s.addDis(scan.nextLine());
		}
		
		s.getDis();
	}

}
