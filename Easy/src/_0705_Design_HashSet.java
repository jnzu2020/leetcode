import java.util.ArrayList;
import java.util.List;

public class _0705_Design_HashSet {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(1);
        System.out.println(myHashSet);
        myHashSet.add(2);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(1));
        System.out.println(myHashSet.contains(3));
        myHashSet.add(2);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(2));
        myHashSet.remove(2);
        System.out.println(myHashSet);
        System.out.println(myHashSet.contains(2));
    }
}

class MyHashSet {
    List<Integer> list;
    /** Initialize your data structure here. */
    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        if (list.contains(key)) {
            list.remove((Integer) key);
        }
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return list.contains(key);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
