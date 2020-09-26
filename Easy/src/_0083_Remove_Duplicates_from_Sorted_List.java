public class _0083_Remove_Duplicates_from_Sorted_List {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode current = head;
            while(current.next != null) {
                if (current.val == current.next.val) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
            return head;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        ListNode listNode1_3 = new ListNode(2);
        ListNode listNode1_2 = new ListNode(1, listNode1_3);
        ListNode listNode1_1 = new ListNode(1, listNode1_2);
        System.out.println(deleteDuplicates(listNode1_1));


        ListNode listNode2_5 = new ListNode(3);
        ListNode listNode2_4 = new ListNode(3, listNode2_5);
        ListNode listNode2_3 = new ListNode(2, listNode2_4);
        ListNode listNode2_2 = new ListNode(1, listNode2_3);
        ListNode listNode2_1 = new ListNode(1, listNode2_2);
        System.out.println(deleteDuplicates(listNode2_1));
    }
}
