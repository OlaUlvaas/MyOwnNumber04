package se.lexicon.ex02;

import java.util.Objects;

public class Norwegian extends Human{

    private String homeTown;
    private int lengthInCm;

    public Norwegian(){

    }
    public Norwegian(String homeTown, int lengthInCm) {
        this.homeTown = homeTown;
        this.lengthInCm = lengthInCm;
    }

    @Override
    public void nationalityHey(){
        System.out.println("Hey I'm from Norway.");
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public int getLengthInCm() {
        return lengthInCm;
    }

    public void setLengthInCm(int lengthInCm) {
        this.lengthInCm = lengthInCm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Norwegian norwegian = (Norwegian) o;
        return lengthInCm == norwegian.lengthInCm && Objects.equals(homeTown, norwegian.homeTown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), homeTown, lengthInCm);
    }

    @Override
    public String toString() {
        return "HomeTown: " + homeTown +
                "\nLength: " + lengthInCm + " cm\n";
    }
}
