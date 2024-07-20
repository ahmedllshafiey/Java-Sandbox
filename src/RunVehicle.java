
public class RunVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(60, 4);
        vehicle.move();

        Car car = new Car(120, 4, "Tesla Model S");
        car.move();
        System.out.println("Car model: " + car.getModel());
    }
}
