package week8;
import java.util.ArrayList;

public class Healthrun {
    public static void main(String[] args) {
        ArrayList<HealthClass> list = new ArrayList<HealthClass>();
        list.add(new HealthClass("Jason", 80, 168, 30, 'm'));
        list.add(new HealthClass("Adam", 70, 180, 15, 'M'));
        list.add(new HealthClass("Taylor", 75, 165,20, 'w'));
        list.add(new HealthClass("Linda", 100, 180,25, 'W'));

        for(HealthClass argument : list){
            System.out.println("name :" + argument.getName() + " weight :" + argument.getWeight() + " height :" + argument.getHeight() + " age :" +
            argument.getAge() + " gender :" + argument.getGender());
            if(argument.isFat() == true){
                System.out.println("Fat");
            }
            else{
                System.out.println("Not Fat");
            }
            System.out.println("This is BMR value recommend per day " + argument.calculateBMR());

        }
    }
}
