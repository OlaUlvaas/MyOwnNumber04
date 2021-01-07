package se.lexicon.ex01;

public class Car {
    private static int sequencer = 0;
    private String regNumber;
    private String brand;
    private String color;

    /*public static int nextId(){
        return ++sequencer;
    }*/

    public Car(String regNumber, String brand, String color){
        this.regNumber = regNumber;
        this.brand = brand;
        this.color = color;
        ++sequencer;
    }

    @Override
    public String toString() {
        return "Car: " + sequencer +
                "\nRegNumber: " + regNumber +
                "\nBrand: " + brand +
                "\nColor " + color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public static int getSequencer() {
        return sequencer;
    }

}
