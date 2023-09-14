package ObjectInheritence;

public class Circle extends Shape {
	
	private int radius;
	
	
	public Circle() {
		
		
	}

	public Circle(String name,String Color,int radius) {
		super();
		this.radius = radius;
	}
	
	

	public double Area(int radius) {
		double area=3.14*radius*radius;
		System.out.println("Area of Circle"+"= "+area);
		return area;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", getName()=" + getName() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	
}
