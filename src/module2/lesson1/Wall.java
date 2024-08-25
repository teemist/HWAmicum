package module2.lesson1;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public boolean tryPass(Moveable member) {
        if (member.jump() > this.height) {
            System.out.println("И перепрыгивает успешно");
            return true;
        }
        else{
            System.out.println("И не смог перепрыгнуть");
            return false;
        }
    }

}
