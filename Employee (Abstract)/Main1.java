class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat meow");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal[] animal = new Animal[10];

        animal[0] = new Dog();
        animal[1] = new Cat();

        for (Animal a : animal) {
            if (a instanceof Dog) {
                System.out.println("This is a Dog instance.");
                a.makeSound();
            }

            if (a instanceof Cat) {
                System.out.println("This is a Cat instance.");
                a.makeSound();
            }
        }

    }
}

