package homework170712;

import mytestframework.Asserts;

public class MyStackTest {

    public static void main(String[] args) {

        MyStack stack = new MyStack(0);
        MyStack stack1 = new MyStack();

        Asserts.assertEquals(stack.push("one"), false);
        Asserts.assertEquals(stack1.push("one"), true);

        Asserts.assertEquals(stack1.pop(), "one");
        Asserts.assertNotEquals(stack1.pop(), "one");

    }


}

