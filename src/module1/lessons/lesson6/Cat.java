package module1.lessons.lesson6;

import module1.lessons.lesson7.Plate;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
    private int appetite;
    private boolean satiety;

    @Override
    public void run(int dest) {
        if(dest > 200) System.out.println(super.getName() + " не может пробежать больше 200м, потому что он кот");
        else System.out.println(super.getName() + " пробежал " + dest + "м");
    }

    @Override
    public void swim(int dest) {
        System.out.println(super.getName() + " не умеет плавать, потому что он кот");
    }


    public Cat(String name, int appetite) {
        super(name);
        this.appetite = appetite;
        if(appetite > 0) satiety = false;
    }
    public void eat(Plate p) {
        satiety = p.decreaseFood(appetite);
    }

    public boolean isSatiety() {
        return satiety;
    }
}
