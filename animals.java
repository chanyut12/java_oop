interface Pet {
    void makeSound();  
    void play();
}

class Dogs implements Pet {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    @Override
    public void play() {
        System.out.println("Fetch!");
    }
}

public class animals {
    public static void main(String[] args) {
        Dogs dog1 = new Dogs();
        dog1.play();
        dog1.makeSound();
    }
}
