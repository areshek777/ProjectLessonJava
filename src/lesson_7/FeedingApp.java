package lesson_7;

import java.lang.reflect.Array;

public class FeedingApp {

    public static void main(String[] args) {
        Cat pank = new Cat("Pank", 10);
        Cat simba = new Cat("Simba", 15);
        Cat loki = new Cat("Loki", 80);
        Cat[] cats = {pank, simba, loki};

        Plate plate = new Plate(100);

        pank.eat(plate);
        System.out.println(plate);
        System.out.println("Кот " + pank.getName() + " сыт? " + pank.getSatiety());

        satietyCats(cats, plate);


    }

    public static void satietyCats(Cat[] cats, Plate plate) {
        for(Cat cat : cats) {
            cat.eat(plate);
            System.out.println("Кот " + cat.getName() + " сыт? " + cat.getSatiety());
        }
    }
}
