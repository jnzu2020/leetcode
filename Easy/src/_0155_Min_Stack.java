import java.util.ArrayList;
import java.util.List;

public class _0155_Min_Stack {
    List<Integer> list;
    public _0155_Min_Stack() {
        list = new ArrayList<>();
    }

    public void push(int x) {
        list.add(x);
    }

    public void pop() {
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }
    }

    public int top() {
        return !list.isEmpty() ? list.get(list.size() - 1) : Integer.MIN_VALUE;
    }

    public int getMin() {
        if (!list.isEmpty()) {
            int min = list.get(0);
            for (int i : list) {
                min = Integer.min(min, i);
            }
            return min;
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        _0155_Min_Stack minStack = new _0155_Min_Stack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
