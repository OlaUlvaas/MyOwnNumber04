package se.lexicon.ex01;

public class Animal {
    private String name;
    public double weight;

    public Animal(String name, double weight){
        //super();
        this.name = name;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public String toString(){
        return "Name: " + getName() + "\nWeight: " + getWeight();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}




