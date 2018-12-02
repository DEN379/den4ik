package oop_l3;

public class Main {

	public static void main(String[] args) {
		RationalNumber d1=new RationalNumber(3, 7);
		RationalNumber d2=new RationalNumber(4, 9);
		RationalNumber rez=new RationalNumber();
		rez=RationalNumber.add(d1, d2);
		RationalNumber.out(rez);
		
		rez=RationalNumber.sub(d1, d2);	
		RationalNumber.out(rez);
		
		rez=RationalNumber.mul(d1, d2);
		RationalNumber.out(rez);
		
		rez=RationalNumber.div(d1, d2);
		RationalNumber.out(rez);

	}

}
