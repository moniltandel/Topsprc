package assign_002;

import java.util.Scanner;

public class Tw002 {
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		double a = sc.nextDouble();
		
		System.out.println("Enter a number");
		double b = sc.nextDouble();
		
		System.out.println("Enter a operator");
		String op = sc.next();
		
		switch(op) {
		case "+" : System.out.println(a + b);
		break;
		
		case "-" : System.out.println(a - b);
		break;
		
		case "*" : System.out.println(a * b);
		break;
		
		case "/" : System.out.println(a / b);
		break;
		
		case "%" : System.out.println(a % b);
		break;
		
		default : System.out.println("Invalid input");
		}
	}
}
