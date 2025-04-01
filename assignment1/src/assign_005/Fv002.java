package assign_005;

class User {
	
	public void sum(int a, int b) {
		System.out.println(a + b);
	}
	
	public float sum(float a, float b, float c) {
		return (a + b + c);
	}
	
	public double sum(double a, double b) {
		return (a + b);
	}
	
	

}

public class Fv002 {
	public static void main(String[] args) {
		User u1 = new User();
		
		u1.sum(7,2);
		
		float sum = u1.sum(-4, 2, 7);
		System.out.println(sum);
		
		double s = u1.sum(15.45,10.23);
		System.out.println(s);
		
	}
}
