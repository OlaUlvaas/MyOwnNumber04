package se.lexicon.ex02;

public class MainHuman {
    public static void main(String[] args){
        Norwegian person1 = new Norwegian();
        American person2 = new American();


        person1.setFirstName("Runar");
        person1.setLastName("Ulvang");
        person1.setAge(40);
        person1.setNationality("Norweigan");
        person1.setHomeTown("Oslo");
        person1.setLengthInCm(189);

        person2.setFirstName("Donald");
        person2.setLastName("Trump");
        person2.setAge(72);
        person2.setNationality("American");
        person2.setHomeTown("Washington DC");
        person2.setSalary(0);


        System.out.println("--------------------------------\n");
        person1.nationalityHey();

        System.out.println(person1.getFirstName());
        System.out.println(person1.getLastName());
        System.out.println(person1.getAge());
        System.out.println(person1.getNationality());
        System.out.println(person1.toString());
        System.out.println("--------------------------------");

        System.out.println("--------------------------------\n");
        person2.nationalityHey();

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());
        System.out.println(person2.getAge());
        System.out.println(person2.getNationality());
        System.out.println(person2.toString());
        System.out.println("--------------------------------");


    }
}
