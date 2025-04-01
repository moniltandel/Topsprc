package assign_009;


class M {
	int a,b;
	
	M() {
		System.out.println("Constructor M");
	}
	public void count(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	M(int a, int b){
		this.a = a;
		this.b = b;
	}
	
}

class N extends M {
	int c;
	
	N() {
		super();
		System.out.println("Constructor N");
		
	}
	
	N(int a, int b, int c){
		super(a,b);
		this.c = c;
		
		double d = super.a + super.b + c;
		
		System.out.println(d);
	}
	
	public void math(int a, int b, int c) {
		super.count(a, b);
		this.c = c;
		
		int d = super.a * super.b * c;
		System.out.println(d);
	}
}

public class Nine003 {
	public static void main(String[] args) {
		N n = new N();
		
		n.math(7,8,9);
		
		N n1 = new N(8,9,12);
	}
}
