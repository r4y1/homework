package homework170712;

public class MyStack {


    private static final int DEFAULT_MAX_SIZE = 10;
    private String[] array;
    private int size;

    public MyStack() {
        this(DEFAULT_MAX_SIZE);
    }

    public MyStack(int maxSize) {
        array = new String[maxSize];
        size = 0;
    }

    public boolean push(String str) {
        if (size >= array.length) {
            return false;
        }
        array[size] = str;
        size++;
        return true;
    }



}
