package assign_010;

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Circle");
	}
}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Square");
	}
}

class Triangle extends Shape {
	@Override
	void draw() {
		System.out.println("Triangle");
	}
}

public class Ten001 {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		
		Triangle tr = new Triangle();
		tr.draw();
		
		Square s = new Square();
		s.draw();
	}
}
