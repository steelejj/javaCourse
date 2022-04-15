public class Challenger extends Car {
    private String model;

    public Challenger(String engine, String model) {
        super("Challenger", 2, 4, engine);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
