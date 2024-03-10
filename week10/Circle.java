package week10;

public class Circle extends TwoDimenstionalShape{
    public String toString(){
        return "Circle " + super.toString() ;
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());
    }
}
