package oop_l4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Human {
	
	List<String> disc = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	int year_enter, numb, qu_discipline, sa;
	
	public void stud() {
		System.out.println("rik vstupy -> ");
		this.year_enter=scan.nextInt();
		System.out.println("nomer zalikovki -> ");
		this.numb=scan.nextInt();
		System.out.println("kilkist disciplin -> ");
		this.qu_discipline=scan.nextInt();
		System.out.println("Seredne bal ->");
		this.sa=scan.nextInt();
		System.out.println("Seredne arifmetichne => ");
		System.out.println(sa);
	}
	
	public void addDis(String elemnt){
        disc.add(elemnt);
    }
	
	public void getDis() {
		for(int i=0;i<qu_discipline;i++) {
			System.out.print(disc.get(i)+" ");
		}
	}
	
}
