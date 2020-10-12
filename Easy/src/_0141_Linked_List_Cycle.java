import java.util.HashMap;
import java.util.Map;

public class _0141_Linked_List_Cycle {
    public static boolean hasCycle(ListNode head) {
        // 1. Solution, but slower
//        if (head == null) {
//            return false;
//        }
//        Map<ListNode, Integer> listNodeMaps = new HashMap<>();
//        int pos = 0;
//        listNodeMaps.put(head, pos);
//        while (head.next != null) {
//            if (listNodeMaps.get(head.next) != null) {
//                listNodeMaps.put(head.next, ++pos);
//            } else {
//                return true;
//            }
//        }
//        return false;

        // 2. Solution, faster
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fastPointer = head;
        ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode listNode1_1 = new ListNode(3);
        ListNode listNode1_2 = new ListNode(2);
        ListNode listNode1_3 = new ListNode(0);
        ListNode listNode1_4 = new ListNode(-4);
        listNode1_1.next = listNode1_2;
        listNode1_2.next = listNode1_3;
        listNode1_3.next = listNode1_4;
        listNode1_4.next = listNode1_2;
        System.out.println(hasCycle(listNode1_1));

        ListNode listNode2_1 = new ListNode(1);
        ListNode listNode2_2 = new ListNode(2);
        listNode2_1.next = listNode2_2;
        listNode2_2.next = listNode2_1;
        System.out.println(hasCycle(listNode2_1));

        ListNode listNode3_1 = new ListNode(1);
        System.out.println(hasCycle(listNode3_1));
    }
}
