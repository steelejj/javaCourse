public class Vehicle {

    private boolean steering;
    private String name;
    private int speed;
    private int direction;

    public Vehicle(boolean steering, String name) {
        this(steering, 0, 0, name);
    }

    public Vehicle(boolean steering, int speed, int direction, String name) {
        this.steering = steering;
        this.speed = speed;
        this.direction = direction;
        this.name = name;
    }

    public void increaseSpeed(int increaseBy) {
        this.speed += increaseBy;
    }

    public void changeDirection(int newDirection) {
        this.direction = newDirection;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSteering() {
        return steering;
    }

    public void setSteering(boolean steering) {
        this.steering = steering;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }
}
