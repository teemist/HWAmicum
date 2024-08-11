package module1.lessons.lesson1;

public class Lesson1 {

    // Задание 1
//    public static void main(String[] args) {
//
//    }

    // Задание 2
    byte p1 = 0;
    short p2 = 0;
    int p3 = Integer.MAX_VALUE;
    long p4 = Long.MAX_VALUE;
    float p5 = 0.1f;
    double p6 = 0.1;
    char p7 = '*';
    boolean p8 = true;

    // Задание 3
    public static float method(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    // Задание 4
    public static boolean isInRange(int a, int b) {
        if (a + b >= 10 & a + b <= 20) return true;
        return false;
    }

    // Задание 5
    public static void isPositive(int number) {
        if (number >= 0) System.out.println("positive");
        else System.out.println("negative");
    }

    // Задание 6
    public static void isPositiveReverse(int number) {
        if (number < 0) System.out.println("positive");
        else System.out.println("negative");
    }

    // Задание 7
    public static void printName(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // Задание 8
   public static boolean isLeap(int year) {

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            }
            return true;
        }
        else return false;
    }
}
