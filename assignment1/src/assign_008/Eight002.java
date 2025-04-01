package assign_008;

public class Eight002 {
	public static void main(String[] args) {
		String s1 = "BoB";
		
		String s2 = "";
		
		for(int i=s1.length()-1; i>=0; i--) {
			s2+=s1.charAt(i);
		}
		
		System.out.println("Reverse String is : "+ s2);
		
		if(s2.equals(s1)) {
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not palindrom");
		}
	}
}
