package assign_004;

class ConstOverloading {
	
	ConstOverloading() {
		System.out.println("Default Constructor");
	}
	
	ConstOverloading(String name){
		System.out.println(name);
	}
	
	ConstOverloading(int a, int b) {
		System.out.println(a + b);
	}
}

public class Fr002 {
	public static void main(String[] args) {
		
		ConstOverloading c1 = new ConstOverloading("Max");
		
		ConstOverloading c2 = new ConstOverloading(45, 79);
		
		ConstOverloading c3 = new ConstOverloading();
	}
}
