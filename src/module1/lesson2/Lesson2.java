package module1.lesson2;

public class Lesson2 {
    public static void ex1() {
        System.out.println("Задание 1");
        int[] array = new int[]{1, 0, 1, 0, 1, 1, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0)
                array[i] = 1;
            else array[i] = 0;
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
    }

    public static void ex2() {
        System.out.println("Задание 2");
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++) {
            array[i] = j;
            j += 3;
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
    }

    public static void ex3() {
        System.out.println("Задание 3");
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else System.out.print(array[i]);
        }
    }

    public static void ex4() {
        System.out.println("Задание 4");
        int[][] array = new int[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        for (int i = 0; i < array[0].length; i++) {
            array[i][i] = 1;

        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(" " + array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void ex5() {
        int[] array = new int[]{3, 1, 1, -10, 100};
        int min = array[0];
        int max = array[0];
        for (int i = 0, j = array.length; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println("Минимальное значение: " + min +
                "\nМаксимальное значение: " + max);
    }

    public static boolean ex6(int[] array) {
        boolean checkBalance = false;

        for (int i = 0; i < array.length; i++) {
            int left = 0;
            int right = 0;

            for (int j = 0; j < i; j++) {
                left += array[j];
            }
            for (int k = i; k < array.length; k++) {
                right += array[k];
            }
            if (left == right) checkBalance = true;
        }
        return checkBalance;
    }

    public static void ex7(int[] array, int n) {
    }

}
