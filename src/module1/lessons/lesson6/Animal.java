package module1.lessons.lesson6;

public abstract class Animal {
    private String name;
    public abstract void run(int dest);
    public abstract void swim(int dest);

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
