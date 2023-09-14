package ObjectInheritence;

public class Shape {
	
	private String Color;
	private String name;
	
	public Shape() {
		
	};
	public Shape(String color, String name) {
		super();
		Color = color;
		this.name = name;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Shape [Color=" + Color + ", name=" + name + "]";
	}
	
	

}
