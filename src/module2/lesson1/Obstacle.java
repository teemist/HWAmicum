package module2.lesson1;

public abstract class Obstacle {
    private int length;
    private int height;

    public abstract boolean tryPass(Moveable member);
}
