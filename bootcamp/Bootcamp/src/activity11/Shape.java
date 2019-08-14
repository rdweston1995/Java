package activity11;

public class Shape{
	protected final int sides;
	protected final double sideLength;
	
	Shape(double sideLength, int sides){
		this.sides = sides;
		this.sideLength = sideLength;
	}
	
	Shape(double sideLength, int sides, double height){
		this.sideLength = sideLength;
		this.sides = sides;
	}
	
	//Perimeter
	double getPerimeter() {
		return this.sides * this.sideLength;
	}
	
	//Sides
	int getSides(){
		return this.sides;
	}
	
	
}