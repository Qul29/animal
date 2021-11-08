abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;

    abstract void run(int length);

    public abstract int getSatiety();
}

class Cat extends Animal
{
    private final int MAX_RUN_LENGTH = 200;
    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    public int getSatiety() {
        return 0;
    }

    void swim(int length) {
        System.out.println("swim: false");
    }


}

class Dog extends Animal {
    private final int MAX_RUN_LENGTH = 500;
    private final int MAX_SWIM_LENGTH = 10;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
    }

    @Override
    public int getSatiety() {
        return 0;
    }

    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }



}

class HW6_1to4 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(201);
        cat.swim(1);

        Dog dog = new Dog();
        dog.run(500);
        dog.swim(10);

    }
}