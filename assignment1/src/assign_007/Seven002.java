package assign_007;

class Calc {
	
	Calc() {
		System.out.println("Default Constructor");
	}
	
	Calc(int a) {
		System.out.println(a);
	}
	
	Calc(int a, int b) {
		System.out.println(a + " " + b);
	}
	
	Calc(double a, double b, double c) {
		System.out.println(a * b * c);
	}
	
	Calc(double a, double b) {
		System.out.println(a / b);
	}
	
	Calc(float a, float b) {
		float c = a - b;
		System.out.println(c);
	}
}

public class Seven002 {
	public static void main(String[] args) {
		Calc c1 = new Calc();
		Calc c2 = new Calc(8);
		Calc c3 = new Calc(45, 65, 78);
		Calc c4 = new Calc(8.2,6.4);
		Calc c5 = new Calc((-12.4545f),(-5.1131f));
	}
}
