package lab1_oop;

import java.util.Scanner;
import java.lang.Math;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println("vvedit operator");
		Scanner in = new Scanner(System.in);
		String op=in.nextLine();
		
		System.out.println("vvedit chislo");
		double a=in.nextInt();
		double b=in.nextInt();
		
		if(op.endsWith("dodavannya"))System.out.println("a+b= "+(a+b));else 
		if(op.endsWith("vidnimannya"))System.out.println("a-b= "+(a-b));else 
		if(op.endsWith("mnojennya"))System.out.println("a*b= "+(a*b));else 
		if(op.endsWith("dilennya"))System.out.println("a/b= "+(a/b));else 
		if(op.endsWith("korin"))System.out.println("a="+Math.sqrt(a)+" , "+"b="+Math.sqrt(b));else 
		if(op.endsWith("modul"))System.out.println("a="+Math.abs(a)+" , "+"b="+Math.abs(b));
		else System.out.println("error");
		
		
	}
	

}
