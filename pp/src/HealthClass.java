public class HealthClass {

    public HealthClass(String name, double weight, double height, int age, char gender) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
    }

    private String name ;
    private double weight;
    private double height ;
    private int age ;
    private char gender ;
    //

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    // 

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    //

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age ; 
    }
    //

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    //

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public double calculateBMR(){
        if(getGender() =='M' || getGender() == 'm'){
            return  66.00 + (13.7 * getWeight()) +(5 * getHeight()) - (6.8 * getAge());
            
            }
        else if (getGender() == 'W' || getGender() =='w'){
            return 665 + (9.6 * getWeight()) + (1.8 * getHeight()) - (4.7 * getAge()) ;
        }
        else{
            throw new IllegalArgumentException("Invalid gender. Please enter 'M' or 'F'");
        }
    }

    public boolean isFat(){
        if(getGender() =='M' || getGender() == 'm'){
            if(getWeight() > (getHeight()-100)){
                return true ;
            }
            return false;
        }
        else if(getGender() == 'W' || getGender() =='w'){
            if(getWeight() > (getHeight()-110)){
                return true ;
            }
            return false ;
        }
        else{
            throw new IllegalArgumentException("Invalid gender. Please enter 'M' or 'F'");
        }

    }

    // public boolean isFat() {
    //     if (getGender() == 'M' || getGender() == 'm') {
    //         return getWeight() > (getHeight() - 100);
    //     } else if (getGender() == 'W' || getGender() == 'w') {
    //         return getWeight() > (getHeight() - 110);
    //     } else {
    //         throw new IllegalArgumentException("Invalid gender. Please enter 'M' or 'W'");
    //     }
    // }
}

