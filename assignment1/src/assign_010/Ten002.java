package assign_010;

interface I1 {
	public void sum(int a, int b);
}

interface I2 {
	public void mul(int a, int b);
}

class Basic implements I1,I2 {
	@Override
	public void sum(int a, int b) {
		System.out.println(a + b);
		
	}
	
	@Override
	public void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a * b);
	}
}

public class Ten002 {
	public static void main(String[] args) {
		Basic b1 = new Basic();
		
		b1.sum(78, 95);
		
		b1.mul(471, 956);
	}
}
