public class _0203_Remove_Linked_List_Elements {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode pre = null;
        ListNode current = head;

        while(current != null) {
            if (current.val == val) {
                if (current == head) {
                    head = head.next;
                    current = head;
                } else {
                    pre.next = current.next;
                    current = current.next;
                }
            } else {
                pre = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(6);
        ListNode listNode4 = new ListNode(6);
        ListNode listNode5 = new ListNode(4);
        ListNode listNode6 = new ListNode(5);
        ListNode listNode7 = new ListNode(6);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        System.out.println(removeElements(listNode1, 6));

    }
}
