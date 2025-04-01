package assign_005;

class Max {
	
	public void maxOfThree(int a, int b, int c) {
		if(a>b && a>c) {
			System.out.println(a +" is maximum");
		}else if(b>a && b>c) {
			System.out.println(b + " is maximum");
		}else {
			System.out.println(c + " is maximum");
		}
	}
}

public class Fv001 {
	public static void main(String[] args) {
		Max m1 = new Max();
		m1.maxOfThree(54, 89, 464);
	}
}
