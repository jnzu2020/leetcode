import java.util.LinkedList;
import java.util.Queue;

public class _0225_Implement_Stack_using_Queues {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.empty()); // return False
    }
}

class MyStack {
    private Queue<Integer> queue;
    private Queue<Integer> temp;
    private int top;
    /** Initialize your data structure here. */
    public MyStack() {
        queue = new LinkedList<>();
        temp = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.add(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        while (queue.size() > 1) {
            top = queue.remove();
            temp.add(top);
        }
        int topElement = queue.remove();
        Queue<Integer> changeTemp;
        changeTemp = temp;
        temp = queue;
        queue = changeTemp;
        return topElement;
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
