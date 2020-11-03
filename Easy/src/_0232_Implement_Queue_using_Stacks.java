import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Stack;

public class _0232_Implement_Queue_using_Stacks {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1); // queue is: [1]
        System.out.println(myQueue);
        myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
        System.out.println(myQueue);
        System.out.println(myQueue.peek()); // return 1
        System.out.println(myQueue.pop()); // return 1, queue is [2]
        System.out.println(myQueue);
        System.out.println(myQueue.empty()); // return false
    }
}

class MyQueue {
    Stack<Integer> stack;
    Stack<Integer> temp;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!stack.empty()) {
            temp.push(stack.pop());
        }
        stack.push(x);
        while (!temp.empty()) {
            stack.push(temp.pop());
        }
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (!stack.empty()) {
            return stack.pop();
        }
        return -1;
    }

    /** Get the front element. */
    public int peek() {
        if (!stack.empty()) {
            return stack.peek();
        }
        return -1;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.empty();
    }

    @Override
    public String toString() {
        String output = stack.toString();
        output= output.substring(1);
        output= output.substring(0, output.length() - 1);
        String[] outputs = output.split(", ");
        Collections.reverse(Arrays.asList(outputs));
        return Arrays.toString(outputs);
    }
}
