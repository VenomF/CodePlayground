package triangle;

public class GeometricObject {
	
	protected String color;
	protected boolean filled;
	
	protected GeometricObject() {
		
	}
	
	public GeometricObject(String color, boolean filled) {
		this.color=color;
		this.filled=filled;
	}
	
	protected void setColor(String color){
		this.color=color;
	}
	
	protected void setFilled(boolean filled) {
		this.filled=filled;
	}

}
