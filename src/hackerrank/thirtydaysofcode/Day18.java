package hackerrank.thirtydaysofcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Day18 {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    void pushCharacter(char ch) {
        stack.push(ch);
    }

    void enqueueCharacter(char ch) {
        queue.add(ch);
    }

    char popCharacter(){
        return stack.pop();
    }

    char dequeueCharacter() {
        return queue.remove();
    }

}
