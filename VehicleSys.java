class Vehicle {
    String type;

    Vehicle() {}
    Vehicle(String type) { this.type = type; }

    void startEngine() {
        System.out.println("Vehicle engine started");
    }
}

class Car extends Vehicle {
    Car(String type) { super(type); }

    void startEngine() {
        System.out.println("Car engine started");
    }
}

class Bike extends Vehicle {
    Bike(String type) { super(type); }

    void startEngine() {
        System.out.println("Bike engine started");
    }
}

public class VehicleSys {
    public static void main(String[] args) {
        Vehicle v = new Car("SUV");
        v.startEngine();
    }
}