package se.lexicon.ex01;

import se.lexicon.ex01.Animal;

public class Dog extends Animal {
    private int legs;
    private int tail;
    private int teeth;

    public Dog(String name, double weight, int legs, int tail, int teeth){
        super(name, weight);
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }
    public void eat(){
        System.out.println(getName() + " chews on a bone");
    }
    @Override
    public String toString(){
        return "Name: " + getName() + "\nWeight: " + getWeight() + "\nLegs: " + getLegs() + "\nTail: " + getTail() + "\nTeeth: " + getTeeth();
    }
    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getTail() {
        return tail;
    }

    public void setTail(int tail) {
        this.tail = tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }
}
