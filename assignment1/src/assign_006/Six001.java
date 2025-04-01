package assign_006;

class A {
	int a = 20;
	
	A() {
		System.out.println("Constructor A");
	}
	
	public void display() {
		System.out.println("running display...");
	}
	
}

class B extends A {
	
	
	
	B() {
		System.out.println("Constructor B");
	}
	public void test() {
		System.out.println(a);
	}
}

public class Six001 {
	public static void main(String[] args) {
		B b1 = new B();
		b1.display();
		b1.test();
	}
}
