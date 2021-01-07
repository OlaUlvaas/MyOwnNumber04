package se.lexicon.ex02;

import java.util.Objects;

public class American extends Human{
    private String homeTown;
    private double salary;

    public American(){

    }

    public American(String homeTown, double salary) {
        this.homeTown = homeTown;
        this.salary = salary;
    }



    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void nationalityHey() {
        System.out.println("Hey I'm from America");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        American american = (American) o;
        return Double.compare(american.salary, salary) == 0 && Objects.equals(homeTown, american.homeTown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), homeTown, salary);
    }

    @Override
    public String toString() {
        return "HomeTown: " + homeTown +
                "\nSalary: " + salary + "\n";
    }
}
