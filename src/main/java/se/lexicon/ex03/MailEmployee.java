package se.lexicon.ex03;

import java.time.LocalDate;

public class MailEmployee {
    public static void main(String[] args){

        SystemDeveloper worker1 = new SystemDeveloper();
        SystemDeveloper worker2 = new SystemDeveloper();
        SalesPerson worker3 = new SalesPerson();
        SalesPerson worker4 = new SalesPerson();
        SystemDeveloper worker5 = new SystemDeveloper();
        SalesPerson worker6 = new SalesPerson();

        worker1.setFirstName("Billy");
        worker1.setLastName("Bob");
        worker1.setAge(30);
        worker1.setDateHired(LocalDate.parse("2021-01-02"));
        worker1.addCertificate("ABC");
        worker1.addCertificate("CDC");
        worker1.addLanguange("C#");
        worker1.addLanguange("C++");
        worker1.calculateSalary();

        worker2.setFirstName("Randy");
        worker2.setLastName("Rubby");
        worker2.setAge(33);
        worker2.setDateHired(LocalDate.parse("2020-08-12"));
        worker2.addCertificate("EEE");
        worker2.addCertificate("FGH");
        worker2.addLanguange("Python");
        worker2.addLanguange("C#");
        worker2.calculateSalary();

        worker3.setFirstName("Fiffi");
        worker3.setLastName("Fastball");
        worker3.setAge(30);
        worker3.setDateHired(LocalDate.parse("2019-03-26"));
        worker3.addClient("Huffy");
        worker3.addClient("Fluffy");
        worker3.addClient("Bobby");
        worker3.addClient("Fiffy");
        worker3.addClient("Duffy");
        worker3.calculateSalary();

        worker4.setFirstName("Mimmi");
        worker4.setLastName("Middleton");
        worker4.setAge(43);
        worker4.setDateHired(LocalDate.parse("2020-11-07"));
        worker4.addClient("Byty");
        worker4.calculateSalary();

        worker5.setFirstName("Bill");
        worker5.setLastName("Fill");
        worker5.setAge(25);
        worker5.setDateHired(LocalDate.parse("2021-01-06"));
        worker5.addCertificate("ABC");
        worker5.addCertificate("BCS");
        worker5.addCertificate("HET");
        worker5.addCertificate("RRR");
        worker5.addCertificate("UTY");
        worker5.addLanguange("C++");
        worker5.addLanguange("C#");
        worker5.addLanguange("HTML");
        worker5.addLanguange("Java");
        worker5.addLanguange("Python");
        worker5.calculateSalary();

        worker6.setFirstName("Anny");
        worker6.setLastName("Panny");
        worker6.setAge(43);
        worker6.setDateHired(LocalDate.parse("2020-11-07"));
        worker6.addClient("Rinne");
        worker6.addClient("Finne");
        worker6.addClient("Kimbley");
        worker6.calculateSalary();

        System.out.println("-------------------------------------");
        System.out.println(worker1);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(worker2);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(worker3);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(worker4);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(worker5);
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println(worker6);
        System.out.println("-------------------------------------");
    }
}
