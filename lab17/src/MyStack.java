/**
 * Week 13-14 Handout, Stacks, Question 1 Skeleton Code
 *
 * @author J. Collins, colli206@purdue.edu
 *
 */

import java.util.Arrays;

public class MyStack {
    private String[] strings;
    private int size;

    public MyStack() {
        this.strings = new String[10];
        this.size = 0;
    }

    public void push (String str) {
        if (size == strings.length) {
            strings = Arrays.copyOf(strings, strings.length*2);
        }
        strings[size++] = str;
    }

    public String pop() {
        MyStack.
        strings[size--];
        return
    }
    

    public String top() {
		return strings;
    }

    public boolean isEmpty() {
		if (size == 0) {
		    return true;
        }
		else {
		    return false;
        }
    }

    public void printStack() {

    }


    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("Hello");
        stack.push("My");
        stack.push("Name");
        stack.push("Is");
        stack.push("John");

        stack.printStack();

        System.out.println("Top: " + stack.top());


        //Tests for pop() implementation.
        System.out.println("Popping: " + stack.pop());
        stack.printStack();
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        System.out.println("Popping: " + stack.pop());
        stack.printStack();

    }

}