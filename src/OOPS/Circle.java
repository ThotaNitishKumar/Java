package OOPS;

public class Circle extends Shape{

	public void displayshape() {
		System.out.println("Shape is Circle");
		
	}
	public static void main(String[] args) {
		Shape s = new Circle();
		Shape s1 = new Triangle();
		
		s.displayshape();
		s1.displayshape();
		
	}

}
