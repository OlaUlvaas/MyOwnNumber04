package se.lexicon.ex01;

import se.lexicon.ex01.Animal;
import se.lexicon.ex01.Dog;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*Car.nextId();
        Car.nextId();*/
        Car car1 = new Car("AFS 777", "Porsche", "Blue");
        System.out.println(car1);
        Car car2 = new Car("AFS 888", "Fiat", "White");
        System.out.println(car2);
        Car car3 = new Car("AFS 999", "Ford", "Red");
        System.out.println(car3);


        /*Animal animal = new Animal("Bobby", 26.6);
        Dog dog = new Dog("Fido", 10.5, 4,1,20);
        Animal anny = new Dog("Fiffi", 12.3, 4,1,20);

        animal.getWeight();
        System.out.println(animal.getWeight());

        double bobby = animal.getWeight();
        System.out.println(bobby);

        animal.eat();

        dog.eat();
        dog.getWeight();

        System.out.println(animal);
        System.out.println("------------------------------------");
        System.out.println(dog);
        System.out.println("------------------------------------");
        System.out.println(anny);
        anny.getWeight();
        anny.eat();*/

    }
}
