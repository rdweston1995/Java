package activity9;

public class Test {
	public static void main(String[] args) {
		System.out.println("Testing the square and triangle classes");
		
		Triangle triangle = new Triangle(10);
		Square square = new Square(10);
		
		System.out.println("\n====== Square ==========");
		System.out.println("Area = " + square.getArea());
		System.out.println("Perimeter = " + square.getPerimeter());
		
		System.out.println("\n====== Triangle ========");
		System.out.println("Area = " + triangle.getArea());
		System.out.println("Perimeter = " + triangle.getPerimeter());
	}
}
