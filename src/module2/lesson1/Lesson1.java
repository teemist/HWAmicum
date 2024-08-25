package module2.lesson1;

public class Lesson1 {
    public static void ex1(){
        Moveable[] members = new Moveable[]{
                new Human(1, 100),
                new Human(2, 50),
                new Cat(1, 50),
                new Cat(3, 70),
                new Robot(10, 1000),
        };

        Obstacle[] obstacles = new Obstacle[]{
                new Wall(9),
                new Treadmill(500)
        };


        boolean isPassed;
        for (Moveable member: members
             ) {
            for(Obstacle obstacle: obstacles){
               isPassed = obstacle.tryPass(member);
               if(!isPassed) break;
            }
        }
    }
}
