package activity11;

public class Square extends Shape{
	private double length;
	
	Square(double length){
		super(length, 4);
		this.length = length;
	}
	
	double getArea() {
		return Math.pow(length, 2);
	}
}