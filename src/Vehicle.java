// Example 14: Basic inheritance and polymorphism

class Vehicle {

    protected int speed;
    protected int capacity;

    public Vehicle(int speed, int capacity) {
        this.speed = speed;
        this.capacity = capacity;
    }

    public void move() {
        System.out.println("Vehicle is moving.");
    }
}

class Car extends Vehicle {

    private String model;

    public Car(int speed, int capacity, String model) {
        super(speed, capacity);
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println("Car is moving at speed: " + speed);
    }

    public String getModel() {
        return model;
    }
}
