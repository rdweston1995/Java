package activity9;

import java.lang.Math;

public class Square {
	private double sideLength;
	private final int sides = 4;
	private double area;
	private double perimeter;
	
	private void setArea() {
		this.area = Math.pow(this.sideLength, 2);
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
	
	public int getSides() {
		return this.sides;
	}
	
	Square(double length){
		this.sideLength = length;
		this.setArea();
		this.setPerimeter();
	}
}
