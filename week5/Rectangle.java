package week5;

public class Rectangle {


    private int width;
	private int height;
	private int area;
    private int perimeter;
	
	Rectangle()
	{
	 	width = 1;
	 	height = 1;
		// area = 0.5 ;
	}
	
	public Rectangle(int width, int height)
	{
		// area =  0.5 * width * height;
		this.width = width;
		this.height = height;
	}

    public int getWidth() {
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        } else {
            System.out.println("Width must be greater than 0. Setting to default (1).");
            this.width = 1; 
        }
    }

    public void setHeight(int height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Height must be greater than 0. Setting to default (1).");
            this.height = 1; 
        }
    }

    int perimeter(){
        perimeter = 2*width + 2*height ;
        return perimeter ;
    }


	int show_area()
	{
		area = width * height;
		return area;
	}
	
	
}



// public class Rectangle {

//     private int width;
//     private int height;

//     // Constructor with default values
//     public Rectangle() {
//         this(1, 1); // Call the parameterized constructor with default values
//     }

//     // Parameterized constructor
//     public Rectangle(int width, int height) {
//         setWidth(width);   // Use setter methods to ensure valid values
//         setHeight(height); // Use setter methods to ensure valid values
//     }

//     // Calculate and return the area
//     public double calculateArea() {
//         return 0.5 * width * height;
//     }

//     // Getter for width
//     public int getWidth() {
//         return width;
//     }

//     // Setter for width with validation
//     public void setWidth(int width) {
//         if (width > 0) {
//             this.width = width;
//         } else {
//             System.out.println("Width must be greater than 0.");
//             this.width = 1; // Default to 1 if an invalid value is provided
//         }
//     }

//     // Getter for height
//     public int getHeight() {
//         return height;
//     }

//     // Setter for height with validation
//     public void setHeight(int height) {
//         if (height > 0) {
//             this.height = height;
//         } else {
//             System.out.println("Height must be greater than 0.");
//             this.height = 1; // Default to 1 if an invalid value is provided
//         }
//     }
// }
