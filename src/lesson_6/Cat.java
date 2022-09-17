package lesson_6;

public class Cat extends Animal {
    public Cat(byte length) {
        super(length);
    }
    public void run(int length) {
        setLength(length);
        if (getLength() <= 200) {
            System.out.println("Барсик пробежал " + getLength() + " м.");
        } else {
            System.out.println("Барсик устал и решил не бежать");
        }
    }

    public void swimming(int length){
            System.out.println("Барсик не умеет плавать (");
    }

}
