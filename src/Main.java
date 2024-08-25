import module1.lesson1.Lesson1;
import module1.lesson2.Lesson2;
import module1.lesson3.Lesson3;
import module1.lesson5.Employee;
import module1.lesson6.Cat;
import module1.lesson6.Dog;
import module1.lesson7.Plate;
import module2.lesson2.MyArrayDataException;
import module2.lesson2.MyArraySizeException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        mainModule1();

//        mainModule2();
    }

    public static void mainModule1() {
        // Урок 1. Введение в платформу Java
        System.out.println("___________________________" +
                "\nУрок 1");
        System.out.println("Задание 3: " + Lesson1.method(10, 10, 10, 10));
        System.out.println("Задание 4: " + Lesson1.isInRange(5, 7));
        System.out.println("Задание 5:");
        Lesson1.isPositive(0);
        System.out.println("Задание 6:");
        Lesson1.isPositiveReverse(0);
        System.out.println("Задание 7:");
        Lesson1.printName("Artem");
        System.out.println("Задание 8:" + Lesson1.isLeap(2020));


        // Урок 2. Основные конструкции
        System.out.println("___________________________" +
                "\nУрок 2");
        Lesson2.ex1();
        Lesson2.ex2();
        Lesson2.ex3();
        Lesson2.ex4();
        Lesson2.ex5();
        int[] arrEx6 = new int[]{1, 2, 3};
        System.out.println(Lesson2.ex6(arrEx6));
//        Lesson2.ex7();

        // Урок 3. Практика
        System.out.println("___________________________" +
                "\nУрок 3");
        Lesson3.gameRandomNum();


        // доделать
        // Урок 4. Крестики-нолики
//        System.out.println("___________________________" +
//                "\nУрок 4");


        // Урок 5. Введение в ООП
        System.out.println("___________________________" +
                "\nУрок 5");

        Employee.older40();

        // Урок 6. Продвинутое ООП
        System.out.println("___________________________" +
                "\nУрок 6");

        Cat cat = new Cat("Барсик");
        cat.run(150);
        cat.swim(15);

        Dog dog = new Dog("Бобик");
        dog.run(350);
        dog.swim(9);

        // Урок 7. Практика ООП
        System.out.println("___________________________" +
                "\nУрок 7");
        Cat[] catsNeedFood = new Cat[5];
        Plate plate = new Plate(55);

        plate.info();
        for (int i = 0; i < catsNeedFood.length; i++) {
            catsNeedFood[i] = new Cat("Барсик " + i, (int) (Math.random() * 10));
            catsNeedFood[i].eat(plate);
            if (catsNeedFood[i].isSatiety()) System.out.println("Кот " + i + "сыт");
            else System.out.println("Коту " + i + "не хватило еды в миске");
        }
    }

    public static void mainModule2() {
//            module2.lesson1.Lesson1.ex1();

        String[][] arrEx2 = new String[4][4];
        for(int i = 0; i < arrEx2[0].length; i++){
            for(int j = 0; j < arrEx2[0].length; j++){
                arrEx2[i][j] = "7";
            }

        }
        arrEx2[1][1] = "word";

        for (int i = 0; i < arrEx2.length; i++) {
            for (int j = 0; j < arrEx2[i].length; j++) {
                System.out.print(arrEx2[i][j] + " ");
            }
            System.out.println();
        }
        try

    {
        module2.lesson2.Lesson2.ex1(arrEx2);
    } catch(MyArraySizeException |
    MyArrayDataException e)

    {
        throw new RuntimeException(e);
    }
}
}