package homework170712;

import mytestframework.Asserts;

public class MyStackTest {

    public static void main(String[] args) {

        MyStack stack = new MyStack(0);
        MyStack stack1 = new MyStack();
        stack.push("zero");
        stack1.push("zero");

        Asserts.assertEquals(stack.push("one"), false);
        Asserts.assertEquals(stack1.push("one"), true);

        Asserts.assertEquals(stack1.pop(), "one");
        Asserts.assertNotEquals(stack1.pop(), "one");

        Asserts.assertEquals(stack.size(), 0);
        Asserts.assertEquals(stack1.size(), 0);

        Asserts.assertEquals(stack.tos(), "zero");
        Asserts.assertEquals(stack1.tos(), "zero");

    }


}

