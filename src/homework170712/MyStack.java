package homework170712;

import java.util.Arrays;

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

    public String pop() {
        if (size <= 0) {
            return null;
        }
        String result = array[--size];
        array[size] = null;
        return result;
    }

    public int size() {
        return size;
    }

    public String tos() {
        return size <= 0 ? null : array[size - 1];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOfRange(array, 0, size));
    }



}
