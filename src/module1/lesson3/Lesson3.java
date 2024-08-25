package module1.lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void gameRandomNum() {
        while (true) {

            int randomNum = (int) (Math.random() * 10 - 1);
            for (int tryCounter = 3; tryCounter > 0; tryCounter--) {
                System.out.println("У вас " + tryCounter + " попытки. " + "Попробуйте угадать число от 0 до 9:");
                Scanner scanner = new Scanner(System.in);
                if (scanner.nextInt() == randomNum) {
                    System.out.println("Вы угадали!");
                    break;
                    // блок успешной попытки
                } else {
                    System.out.println("Неверно");
                }
            }
            System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
            Scanner scanner = new Scanner(System.in);
            if (scanner.nextInt() == 0) break;
        }
        System.out.println("Игра окончена");
    }
}
