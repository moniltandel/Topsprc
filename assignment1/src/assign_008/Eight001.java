package assign_008;

class MatrixAddAndSub {
	
	public int[][] addMatrix(int a[][], int b[][], int size){
		
		int c[][] = new int[size][size];
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}
	
	public int[][] SubMatrix(int a[][], int b[][], int size){
		
		int c[][] = new int[size][size];
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				c[i][j] = b[i][j] - a[i][j];
			}
		}
		
		return c;
	}
	
	
	
	public void prinMatrix(int a[][], int rows, int cols) {
		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
	}
	
	
}
public class Eight001 {
	public static void main(String[] args) {
		MatrixAddAndSub m1 = new MatrixAddAndSub();
		
		
		int a[][] = {{7,5}, {9,4}};
		
		int b[][] = {{12,23}, {78,45}};
		
		int c[][] = m1.addMatrix(a, b, 2);
		System.out.println("Matrix Addition");
		m1.prinMatrix(c, 2, 2);
		
		System.out.println("************************");
		
		int d[][] = m1.SubMatrix(a, b, 2);
		System.out.println("Matrix Subtraction");
		m1.prinMatrix(d, 2, 2);
		
		
	}
}
