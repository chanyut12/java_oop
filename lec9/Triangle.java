package week9;

public class Triangle extends GeometricObject{
    private double side1;
    private double side2;
    private double side3;

    Triangle(){
        super();
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
    }
    Triangle(double side1, double side2 , double side3){
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public double getSide2() {
        return side2;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public double getSide3() {
        return side3;
    }
    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        return 0.5 * side1 * side2 ;
    }
    public double getPerimeter(){
        return side1 + side2 + side3 ;
    }
    public String toString(){
        return "Triangle: side1 = " + side1 + " side2 = "  + side2 + " side3 = " + side3; 
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle(3, 4, 5);
        t1.setColor("yellow");
        System.out.println(t1.getArea());
        System.out.println(t1.getPerimeter());
        System.out.println(t1.getColor());
        System.out.println(t1.toString());
    }
    
}
