package se.lexicon.ex03;

import java.util.Arrays;

public class SalesPerson extends Employee{
    private String[] clients;



    public SalesPerson(){
        clients = new String[0];
    }


    @Override
    public void calculateSalary(){
        int baseSalary = 25000;
        int extraMaintaining = 500;
        //int extraPerLanguage = 1000;
        double salary = baseSalary + (extraMaintaining * clients.length);
        this.setSalary(salary);
    }
    public void addClient(String mupp){
        String[] clientArray = Arrays.copyOf(clients, clients.length + 1);
        clientArray[clientArray.length - 1] = mupp;
        this.setClients(clientArray);
    }

    public String[] getClients() {
        return clients;
    }

    public void setClients(String[] clients) {
        this.clients = clients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SalesPerson that = (SalesPerson) o;
        return Arrays.equals(clients, that.clients);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(clients);
        return result;
    }

    @Override
    public String toString() {
        return "Worker: " + nextId() +
                "\nFirstName: " + getFirstName() +
                "\nLastName: " + getLastName() +
                "\nAge: " + getAge() +
                "\nSalary: " + getSalary() +
                "\nDateHired: " + getDateHired() +
                "\nClients: " + Arrays.toString(clients);
    }
}

