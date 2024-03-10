package week9;

public class GeometricObject {
    private String color;
    public GeometricObject(){

    }
    public GeometricObject(String color){
        setColor(color);
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void print(){
        System.out.println("color is" + getColor());
    }

}



