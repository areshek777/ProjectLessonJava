package lesson_7;

public class Cat {
    private String name;
    private int appetite;

    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public boolean eat(Plate plate){
        return satiety = plate.decreaseFood(appetite);
    }


    public int getAppetite() {
        return appetite;
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }
}
