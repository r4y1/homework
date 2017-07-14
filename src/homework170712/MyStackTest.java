package homework170712;

import mytestframework.Asserts;

public class MyStackTest {

    public static void main(String[] args) {

        MyStack stack = new MyStack(0);
        MyStack stack1 = new MyStack();

        Asserts.assertEquals(stack.push("one"), false);
        Asserts.assertEquals(stack1.push("one"), true);

    }


}

