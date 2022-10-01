package lesson_7;

public class Plate {
    private int foodAmount;

    public Plate(int foodAmount){
        this.foodAmount = foodAmount;
    }

    public void addFood(int amount){
        foodAmount += amount;
    }

    public boolean decreaseFood(int appetite){
        Cat cats = new Cat("random", appetite);
        if(foodAmount - cats.getAppetite() >= 0){
            foodAmount -= cats.getAppetite();
            return true;
        }
        return false;
    }

    public String toString(){
        return "Plate{" + foodAmount + '}';
    }
}
