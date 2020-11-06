public class _0237_Delete_Node_in_a_Linked_List {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode listNode1_4 = new ListNode(9);
        ListNode listNode1_3 = new ListNode(1, listNode1_4);
        ListNode listNode1_2 = new ListNode(5, listNode1_3);
        ListNode listNode1_1 = new ListNode(4, listNode1_2);
//        deleteNode(listNode1_2);
        deleteNode(listNode1_3);
        System.out.println(listNode1_1);

        ListNode listNode3_4 = new ListNode(4);
        ListNode listNode3_3 = new ListNode(3, listNode3_4);
        ListNode listNode3_2 = new ListNode(2, listNode3_3);
        ListNode listNode3_1 = new ListNode(1, listNode3_2);
        deleteNode(listNode3_3);
        System.out.println(listNode3_1);

        ListNode listNode4_2 = new ListNode(1);
        ListNode listNode4_1 = new ListNode(0, listNode4_2);
        deleteNode(listNode4_1);
        System.out.println(listNode4_1);

        ListNode listNode5_3 = new ListNode(-99);
        ListNode listNode5_2 = new ListNode(5, listNode5_3);
        ListNode listNode5_1 = new ListNode(-3, listNode5_2);
        deleteNode(listNode5_1);
        System.out.println(listNode5_1);
    }
}
