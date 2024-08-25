package module2.lesson1;

public class Cat implements Moveable {
    private int jumpHeight;
    private int runLength;

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public Cat(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }
    @Override
    public int run() {
        System.out.println("Cat is run");
        return runLength;
    }

    @Override
    public int jump() {
        System.out.println("Cat is jump");
        return jumpHeight;
    }
}
