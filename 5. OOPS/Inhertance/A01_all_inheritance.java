

public class A01_all_inheritance {

    // Main class to demonstrate all forms of inheritance

    public static void main(String[] args) {
        // Single Inheritance: Dog inherits from Animal
        Dog dog = new Dog("Rex");
        dog.sound(); // Rex barks.

        // Hierarchical Inheritance: Cat inherits from Animal
        Cat cat = new Cat("Whiskers");
        cat.sound(); // Whiskers meows.

        // Multilevel Inheritance: Puppy inherits from Dog
        Puppy puppy = new Puppy("Max");
        puppy.sound(); // Max yelps.

        // Multiple Inheritance using Interface: PetDog inherits from Dog and implements Pet
        PetDog petDog = new PetDog("Buddy");
        petDog.sound();        // Buddy barks.
        petDog.showAffection(); // Buddy wags its tail to show affection.
    }
    
}

// Example of Inheritance in Java

// Base class (Parent class)
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method for the Animal class
    void sound() {
        System.out.println(name + " makes a sound.");
    }
}

// Derived class from Animal (Single Inheritance)
class Dog extends Animal {
    // Constructor
    Dog(String name) {
        super(name); // Call the parent class constructor
    }

    // Method specific to Dog class
    void sound() {
        System.out.println(name + " barks.");
    }
}

// Another Derived class from Animal (Hierarchical Inheritance)
class Cat extends Animal {
    // Constructor
    Cat(String name) {
        super(name);
    }

    // Method specific to Cat class
    void sound() {
        System.out.println(name + " meows.");
    }
}

// Another derived class from Dog (Multilevel Inheritance)
class Puppy extends Dog {
    // Constructor
    Puppy(String name) {
        super(name); // Call the parent class (Dog) constructor
    }

    // Method specific to Puppy class
    void sound() {
        System.out.println(name + " yelps.");
    }
}

// Interface to demonstrate Multiple Inheritance using Interfaces
interface Pet {
    void showAffection();
}

// Dog implements Pet interface
class PetDog extends Dog implements Pet {
    // Constructor
    PetDog(String name) {
        super(name);
    }

    // Implement showAffection method from Pet interface
    public void showAffection() {
        System.out.println(name + " wags its tail to show affection.");
    }
}



