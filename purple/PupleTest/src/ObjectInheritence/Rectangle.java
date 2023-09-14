package ObjectInheritence;

public class Rectangle extends Shape {
	
	private int width;
	private int Hieght;
	
	public Rectangle() {
		
	}
	public Rectangle(String name,String Color,int width, int hieght) {
		super();
		this.width = width;
		this.Hieght = hieght;
	}
	
	public double Area(int width,int hieght) {
		int area=width*hieght;
		System.out.println("Area of Rectangle"+"= "+area);
		return area;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", Hieght=" + Hieght + ", getColor()=" + getColor() + ", getName()="
				+ getName() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
	
	
	

}
