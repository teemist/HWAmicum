import module1.lessons.*;
import module1.lessons.lesson1.Lesson1;
import module1.lessons.lesson2.Lesson2;
import module1.lessons.lesson3.Lesson3;
import module1.lessons.lesson5.Employee;
import module1.lessons.lesson4.Lesson4;
import module1.lessons.lesson6.Cat;
import module1.lessons.lesson6.Dog;
import module1.lessons.lesson7.Plate;

public class Main {
    public static void main(String[] args) {
//        System.out.println("------------Урок 1");
//        System.out.println("Задание 3: " + Lesson1.method(2, 2, 2, 2));
//        System.out.println("Задание 4: " + Lesson1.isInRange(2, 9));
//        System.out.println("Задание 5: ");
//        Lesson1.isPositive(3);
//        System.out.println("Задание 6:");
//        Lesson1.isPositiveReverse(-3);
//        System.out.println("Задание 7:");
//        Lesson1.printName("Artem");
//        System.out.println("Задание 8: " + Lesson1.isLeap(2020));
//
//
//        System.out.println("----------Урок 2");
//        Lesson2.ex1();
//        Lesson2.ex2();
//        Lesson2.ex3();
//        Lesson2.ex4();
//        Lesson2.ex5();
//        int[] arrayEx6 = new int[]{3, 5, 8};
//        System.out.println(Lesson2.ex6(arrayEx6));
//        int[] arrayEx7 = new int[]{3, 7, 2, 9};
//        Lesson2.ex7(arrayEx7, 3); // не закончено
//
//        System.out.println("----------Урок 3");
//        Lesson3.gameRandomNum();
//
//
//        System.out.println();

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


        // доделать
        // Урок 2. Основные конструкции
        System.out.println("___________________________" +
                "\nУрок 2");
        Lesson2.ex1();
        Lesson2.ex2();
        Lesson2.ex3();
        Lesson2.ex4();
        Lesson2.ex5();
        int[] arrEx6 = new int[] { 1, 2, 3};
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
}