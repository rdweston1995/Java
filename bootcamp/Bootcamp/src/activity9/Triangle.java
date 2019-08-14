package activity9;

import java.lang.Math;

public class Triangle {
	private double sideLength;
	private double height;
	private final int sides = 3;
	private double area;
	private double perimeter;
	
	private void setHeight() {
		this.height = Math.sin(Math.toRadians(60)) * this.sideLength;
	}
	
	private void setArea() {
		this.area = 0.5 * sideLength * height;
	}
	
	public double getArea() {
		return this.area;
	}
	
	private void setPerimeter() {
		this.perimeter = this.sideLength * this.sides;
	}
	
	public double getPerimeter() {
		return this.perimeter;
	}
	
	Triangle(double length){
		this.sideLength = length;
		this.setHeight();
		System.out.println("Height = " + this.height);
		this.setArea();
		this.setPerimeter();
	}
	
}
