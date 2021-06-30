package lesson02.homework;

public class Main {
    public static String[][] myArray = {
            {"1", "2", "3", "4"},
            {"5", "6", "7", "8"},
            {"9", "10", "11", "12"},
            {"13", "14", "15", "16"}
    };

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        System.out.println("Сумма всех элементов массива равна " + getSum(myArray));
    }

    public static boolean checkArraySize(String[][] array) throws MyArraySizeException {
        if (array.length == 4) {
            for (String[] subArr : array) {
                if (subArr.length != 4) {
                    throw new MyArraySizeException("Вы можете подать только массив размером 4х4");
                }
            }
            return true;
        } else {
            throw new MyArraySizeException("Вы можете подать только массив размером 4х4");
        }
    }

    public static int getSum(String[][] array) throws MyArrayDataException, MyArraySizeException {
        int sum = 0;
        if (checkArraySize(array)) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    try {
                        sum += Integer.parseInt(array[i][j]);
                    } catch (NumberFormatException exception) {
                        throw new MyArrayDataException("Ошибка преобразования данных в ячейке с координатами: [" + i + "; " + j + "]");
                    }
                }
            }
        }
        return sum;
    }
}
