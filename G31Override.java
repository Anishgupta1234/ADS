class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting");
    }
}

public class G31Override {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}