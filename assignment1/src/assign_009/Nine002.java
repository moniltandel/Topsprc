package assign_009;

class X {
	int a = 10;
	
	public void msg() {
		System.out.println("Runnig X...");
	}
	
	public void display() {
		System.out.println(a);
	}
}

class Y extends X{
	@Override
	public void msg() {
		System.out.println("Running Y...");
		super.msg();
	}
	
	@Override
	public void display() {
		super.display();
		a++;
		System.out.println(a);
		
	}
}
public class Nine002 {
	public static void main(String[] args) {
		Y y = new Y();
		y.msg();
		y.display();
	}
}
