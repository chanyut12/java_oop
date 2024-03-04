// Superclass
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

// Subclasses
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

// Using polymorphism
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] { new Dog(), new Cat() };

        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphic behavior
        }
    }
}
