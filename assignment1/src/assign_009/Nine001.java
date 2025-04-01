package assign_009;

class A {
	int x;
	
	A() {
		System.out.println("Constructor A");
	}
	
	public void display() {
		System.out.println("Display A");
	}
} 

class B extends A {
	B() {
		System.out.println("Constructor B");
	}
	
	public void test() {
		System.out.println(x);
	}
}


public class Nine001 {
	public static void main(String[] args) {
		B b = new B();
		b.x = 20;
		b.test();
		b.display();
	}
}
