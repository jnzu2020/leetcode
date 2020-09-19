import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _0021_Merge_Two_Sorted_Lists {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if(l2 == null) {
            return l1;
        }

        List<Integer> list = new ArrayList<>();
        ListNode current = l1;
        while (current.next != null) {
            list.add(current.val);
            current = current.next;
        }
        list.add(current.val);

        current = l2;
        while (current.next != null) {
            list.add(current.val);
            current = current.next;
        }
        list.add(current.val);
        Collections.sort(list);

        ListNode result = new ListNode(list.get(list.size() - 1));

        for (int i = list.size() - 2 ; i >= 0 ; i--) {
            result = new ListNode(list.get(i), result);
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode listNode3 = new ListNode(4);
        ListNode listNode2 = new ListNode(2, listNode3);
        ListNode listNode1 = new ListNode(1, listNode2);

        ListNode listNode6 = new ListNode(4);
        ListNode listNode5 = new ListNode(3, listNode6);
        ListNode listNode4 = new ListNode(1, listNode5);

        System.out.println(mergeTwoLists(listNode1, listNode4));

        ListNode listNode7 = null;
        ListNode listNode8 = null;
        System.out.println(mergeTwoLists(listNode7, listNode8));
    }
}

/**
 * Definition for singly-linked list.
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
