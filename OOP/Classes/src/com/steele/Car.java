package com.steele;

public class Car {

    private int doors = 4;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("comodore")) {
            this.model = model;
        } else {
            this.model = "UNKOWN";
        }
    }

    public String getModel() {
        return this.model;
    }
}
