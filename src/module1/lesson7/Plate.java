package module1.lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food <= n) {
            System.out.println("В тарелке недостаточно еды");
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void addFood(int n) {
        this.food += n;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

}
