package activity11;

public class Test{
	public static void main(String[] args) {
		System.out.println("Testing Triangle and Square classes built around the Shape class");
		
		Square square = new Square(10);
		Triangle triangle = new Triangle(10);
		
		System.out.println("\n====== Square ======");
		System.out.println("Area = " + square.getArea());
		System.out.println("Perimeter = " + square.getPerimeter());
		
		System.out.println("\n====== Triangle ======");
		System.out.println("Area = " + triangle.getArea());
		System.out.println("Perimeter = " + triangle.getPerimeter());
	}
}