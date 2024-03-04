package J.example;
//subclass and superclass
public class Inheritance {
    protected String brand = "Ford" ; 
    public void honk(){
        System.err.println("Tuut , tuut!");
    }    
}

class Car extends Inheritance {
    private String modelName = "Mustang" ; //car attribute
    public static void main(String[] args) {
        
        Car myCar = new Car();

        myCar.honk();

        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
