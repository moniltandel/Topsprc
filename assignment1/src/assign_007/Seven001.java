package assign_007;

class Student {
	String name;
	int rollno;
	
	Student() {
		System.out.println("Default");
	}
	
	Student(String name, int rollno){
		this.name = name;
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println(rollno + " " + name);
	}
}

public class Seven001 {
	public static void main(String[] args) {
		Student s1 = new Student("Max", 47);
		
		s1.display();
	}
}
