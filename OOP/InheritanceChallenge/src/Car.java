public class Car extends Vehicle {

    private int doors;
    private int wheels;
    private String engine;

    public Car(String name, int doors, int wheels, String engine) {
        super(true, name);
        this.doors = doors;
        this.wheels = wheels;
        this.engine = engine;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
