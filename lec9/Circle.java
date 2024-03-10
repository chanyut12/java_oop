package week9;

public class Circle extends GeometricObject {
    private double radius ; 
    Circle(){
        super();
        radius = 1 ;
    }

    Circle(double radius){
        super();
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI ;
    }
    public double getPerimeter(){
        return radius * 2 * Math.PI ; 
    }
    @Override
    public void print(){
        super.print();
        System.out.println("Radius is: " + radius);
        System.out.println("Area is: " + getArea());
    }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
    }
}
