package se.lexicon.ex03;

import java.time.LocalDate;
import java.util.Objects;

public abstract class Employee {
    private static int sequencer = 0;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;
    private LocalDate dateHired;

    public Employee(){

    }

    public Employee(String firstName, String lastName, int age, double salary, LocalDate dateHired) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
        this.dateHired = dateHired;

    }
    public static int nextId(){
        return ++sequencer;
    }
    public abstract void calculateSalary();

    public static int getSequencer() {
        return sequencer;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Double.compare(employee.salary, salary) == 0 && Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateHired, employee.dateHired);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary, dateHired);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }
}
