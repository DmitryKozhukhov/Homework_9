package Homework_9;

public class Main {

    /**
     * 1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
     * При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
     * <p>
     * 2. Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
     * Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
     * должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
     * <p>
     * 3. В методе main() вызвать полученный метод, обработать возможные исключения
     * MyArraySizeException и MyArrayDataException и вывести результат расчета.
     */

    public static void main(String[] args) throws MyArrayDataException, MyArraySizeException {
        String[][] myArray = new String[][]{
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "1"},
                {"1", "2", "3", "2"}
        };

        try {
            int Summa =  checkMyArraySize(myArray);
            System.out.println("Сумма всех элементов массива: " + Summa);

        }catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
            System.out.println("Введенный массив не 4х4");


        }catch (MyArrayDataException e) {

            System.out.printf("Элемент массива %sx%s преобразование не удалось", e.getI(), e.getJ());
        }
    }

    public static int checkMyArraySize(String[][] a) throws MyArraySizeException, MyArrayDataException {
        int Summa = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a.length != 4 || a[i].length != 4) {
                    throw new MyArraySizeException("Неподходящий массив!!!");
                }

                try {
                    Summa += Integer.parseInt(a[i][j]);
                } catch(NumberFormatException e){
                    System.out.println(e.getMessage());
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return Summa;
    }
}
