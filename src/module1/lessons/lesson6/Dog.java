package module1.lessons.lesson6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void run(int dest) {
        if (dest > 500) System.out.println(super.getName() + " не может пробежать больше 500м, потому что он собака");
        else System.out.println(super.getName() + " пробежал " + dest + "м");
    }

    @Override
    public void swim(int dest) {
        if (dest > 10) System.out.println(super.getName() + " не может проплыть больше 10м, потому что он собака");
        else System.out.println(super.getName() + " проплыл " + dest + "м");
    }
}
