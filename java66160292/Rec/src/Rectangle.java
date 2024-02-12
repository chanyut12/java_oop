public class Rectangle {

	private int width;
	private int height;
	private double area;
	
	Rectangle()
	{
		width = 1;
		height = 1;
	}
	
	Rectangle(int width, int height)
	{
		this.height = height;
		this.width = width;
	}

	double Cal() {
		area = 0.5 * height * width;
		return area;
	}
	
}