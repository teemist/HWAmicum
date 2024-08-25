package module2.lesson1;

public class Human  implements Moveable {
    private int jumpHeight;
    private int runLength;

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getRunLength() {
        return runLength;
    }

    public void setRunLength(int runLength) {
        this.runLength = runLength;
    }

    public Human(int jumpHeight, int runLength) {
        this.jumpHeight = jumpHeight;
        this.runLength = runLength;
    }

    @Override
    public int run() {
        System.out.println("Human is run");
        return runLength;
    }

    @Override
    public int jump() {
        System.out.println("Human is jump");
        return jumpHeight;
    }
}
