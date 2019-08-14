package activity11;

public class Triangle extends Shape{
	private double height;
	private double length;
	
	Triangle(double length){
		super(length, 3);
		this.length = length;
		setHeight();
	}
	
	private void setHeight() {
		this.height = Math.sin(Math.toRadians(60)) * this.length;
	}
	
	public double getArea() {
		return 0.5 * this.height * this.length;
	}
}