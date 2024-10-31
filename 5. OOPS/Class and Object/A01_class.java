public class A01_class {
    // Main class to create and interact with Car objects

    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2019);

        // Display the details of the cars
        System.out.println("Details of Car 1:");
        car1.displayDetails();
        
        System.out.println(); // Adding a line break

        System.out.println("Details of Car 2:");
        car2.displayDetails();
    }


}

// Define a class named 'Car'
class Car {
    // Fields (attributes) of the Car class
    String make;
    String model;
    int year;

    // Constructor to initialize the Car object
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display the details of the Car
    void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }
}
    

