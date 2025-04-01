package assign_003;

public class Th003 {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		
		System.out.print(a + " " + b);
		for(int i=0; i<20; i++) {
			int temp = b;
			b = a + b;
			a = temp;
			
			System.out.print(" " + b);
		}
	}
}
