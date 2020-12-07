package Zadanie5;

public class Car {
    private String model;
    private float pojemnoscSilnika;

    public Car(String model, float pojemnoscSilnika) {
        this.model = model;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public String getModel() {
        return "Model: " + model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
