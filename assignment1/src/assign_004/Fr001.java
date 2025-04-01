package assign_004;

class Student {
	String name;
	int age;
	
	Student() {
		
	}
	
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("name : "+ name);
		System.out.println("age : "+ age);
	}
}

public class Fr001 {
	public static void main(String[] args) {
		Student s1 = new Student("Max", 24);
		s1.display();
	}
}
