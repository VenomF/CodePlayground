package triangle;

public class Triangle extends GeometricObject {
	
	private double side1;
	private double side2;
	private double side3;
	
	Triangle(){
		new GeometricObject();
		this.side1=1;
		this.side2=1;
		this.side3=1;
	}
	
	public Triangle(int side1, int side2, int side3, String color, boolean filled){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		this.color=color;
		this.filled=filled;
	}
	
	public double getSide1(){
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		double s=getPerimeter()/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	
	public double getPerimeter() {
		return side1+side2+side3;
	}

	@Override
	public String toString() {
		return "Trinagle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}

}
