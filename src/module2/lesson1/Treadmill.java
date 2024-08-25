package module2.lesson1;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    public int getlength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }


    public boolean tryPass(Moveable member) {
        if (member.run() > this.length) {
            System.out.println("И пробегает успешно");
            return true;
        } else {
            System.out.println("И не смог пробежать");
            return false;
        }
    }
}
