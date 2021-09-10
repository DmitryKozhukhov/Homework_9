package Homework_9;

public class MyArrayDataException extends Exception{
    private int i;
    private int j;

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    public MyArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;

    }

    public MyArrayDataException(String message) {
        super(message);
    }

    public MyArrayDataException(String message, Throwable cause) {
        super(message, cause);
    }


}
