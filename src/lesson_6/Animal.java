package lesson_6;

public class Animal {
    private int length;



    public static void main(String[] args) {
        Dog dogBobik = new Dog(0);
        dogBobik.run(600);
        dogBobik.run(500);
        dogBobik.swimming(10);

        Cat catBarsik = new Cat((byte) 0);
        catBarsik.run(200);
        catBarsik.swimming(200);
    }

    public Animal(int length) {
        this.length = length;
    }

    public Animal(byte length) {
        this.length = length;
    }

    public void run(int length) {
        this.length = length;
        if (this.length <= 500) {
            System.out.println("Бобик пробежал " + this.length + " м.");
        } else {
            System.out.println("Бобик устал и решил не бежать");
        }
    }



    public void swimming(int length){
        this.length = length;
        if (this.length <= 10) {
            System.out.println("Бобик проплыл " + this.length + " м.");
        } else {
            System.out.println("Бобик устал и решил не плыть");
        }

    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
