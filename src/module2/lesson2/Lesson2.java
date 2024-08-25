package module2.lesson2;

public class Lesson2 {
    public static void ex1(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (!(array.length == 4) || !(array[0].length == 4)) throw new MyArraySizeException();
        else{
            int sum = 0;
            for(int i = 0; i < array.length; i++){
                for(int j = 0; j < array[i].length; j++){
//                    if(Integer.parseInt(array[i][j]))
                    for(int k = 0; i < array[i][j].length(); k++) {
                        if(!Character.isDigit(array[i][j].charAt(k))) {
                            throw new MyArrayDataException("В строке " + i + " и столбце " + j + " лежит не число");
                        }
                    }
                   sum += Integer.parseInt(array[i][j]);
                }
                System.out.println("Сумма чисел в массиве: " + sum);
            }
        }
    }
}
