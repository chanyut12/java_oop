public class Box extends Rectangle {
    private double height;

    Box() {
        super(); 
        height = 0;
    }

    Box(double l, double w, double h) {
        super(l, w); 
        height = h;
    }

    public void setDimension(double l, double w, double h) {
        super.setDimension(l, w); 
        if (h >= 0) {
            height = h;
        } else {
            height = 0;
        }
    }

    public double getHeight() {
        return height;
    }

    public double volume() {
        return super.area() * height; 
    }
    public double area()
    {
    return  super.area() * 6;
   }

    @Override
    public String toString() {
        return super.toString() + "; Height = " + height;
    }
}

