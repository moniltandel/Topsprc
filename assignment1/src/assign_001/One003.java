package assign_001;
// javac One003.java to compile the program
// java One003 to run the program
class A {
	int a,b;
	
	public void sum(int a, int b) {
		this.a = a;
		this.b = b;
		
		System.out.println(a + b);
	}
}
public class One003 {
	public static void main(String[] args) {
		A a = new A();
		
		a.sum(89, 12);
	}
}
