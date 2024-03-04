abstract class Car {
    Car() //Constructor 
    {
        System.out.println("Car is created");
    }
    abstract void run(); 
    //mandatory override()= บังคับการ overriding
    
    void changeGear()
    {
        System.out.println("Gear changed");
    }  
}
// Creating a Child class with inherits Abstract  class

class Toyota extends Car
{
    @Override
    void run()
    {
        System.out.println("Running Safely");
    }
} 

//Creating a Test class which calls abstract and non-abstract methods
public class testcar {
    public static void main(String[] args) {
        Toyota obj =  new Toyota();
        obj.run();
        obj.changeGear();
    }
}
