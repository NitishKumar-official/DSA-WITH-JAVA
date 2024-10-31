

public class A01_abstraction {

    public static void main(String[] args) {
        // Creating objects for the subclasses
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        TeslaCar myTesla = new TeslaCar();

        // Calling methods from Car and Bike
        System.out.println("Car Actions:");
        myCar.start();
        myCar.stop();

        System.out.println("\nBike Actions:");
        myBike.start();
        myBike.stop();

        System.out.println("\nTesla Actions:");
        myTesla.start();
        myTesla.chargeBattery();
        myTesla.stop();
    }
    
}


// Abstract class demonstrating Abstraction
abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// A class Car that extends the abstract class Vehicle
class Car extends Vehicle {
    // Providing implementation for the abstract method
    @Override
    void start() {
        System.out.println("Car starts with an ignition key.");
    }
}

// Another class Bike that extends the abstract class Vehicle
class Bike extends Vehicle {
    // Providing implementation for the abstract method
    @Override
    void start() {
        System.out.println("Bike starts with a kick.");
    }
}

// Interface demonstrating Abstraction
interface ElectricVehicle {
    void chargeBattery(); // Abstract method by default in an interface
}

// A class TeslaCar that extends Vehicle and implements ElectricVehicle
class TeslaCar extends Vehicle implements ElectricVehicle {
    // Providing implementation for the abstract method from Vehicle
    @Override
    void start() {
        System.out.println("Tesla car starts with a button press.");
    }

    // Providing implementation for the abstract method from ElectricVehicle
    @Override
    public void chargeBattery() {
        System.out.println("Tesla car is charging its battery.");
    }
}



