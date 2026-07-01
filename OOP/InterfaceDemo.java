interface Vehicle {

    void start();
}

class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("Car Started");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();
    }
}
