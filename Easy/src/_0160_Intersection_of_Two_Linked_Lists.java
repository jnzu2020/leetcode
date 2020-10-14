public class _0160_Intersection_of_Two_Linked_Lists {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode current_1 = headA;
        ListNode current_2 = headB;
        while (current_1 != current_2) {
            current_1 = current_1.next;
            current_2 = current_2.next;

            if (current_1 == current_2) {
                return current_1;
            }

            if (current_1 == null) {
                current_1 = headB;
            }

            if (current_2 == null) {
                current_2 = headA;
            }
        }
        return current_1;
    }

    public static void main(String[] args) {
        ListNode listNode1_A_1 = new ListNode(4);
        ListNode listNode1_A_2 = new ListNode(1);
        ListNode listNode1_B_1 = new ListNode(5);
        ListNode listNode1_B_2 = new ListNode(6);
        ListNode listNode1_B_3 = new ListNode(1);
        ListNode listNode1_1 = new ListNode(8);
        ListNode listNode1_2 = new ListNode(4);
        ListNode listNode1_3 = new ListNode(5);
        listNode1_A_1.next = listNode1_A_2;
        listNode1_A_2.next = listNode1_1;
        listNode1_B_1.next = listNode1_B_2;
        listNode1_B_2.next = listNode1_B_3;
        listNode1_B_3.next = listNode1_1;
        listNode1_1.next = listNode1_2;
        listNode1_2.next = listNode1_3;
        System.out.println(getIntersectionNode(listNode1_A_1, listNode1_B_1));

        ListNode listNode2_A_1 = new ListNode(1);
        ListNode listNode2_A_2 = new ListNode(9);
        ListNode listNode2_A_3 = new ListNode(1);
        ListNode listNode2_B = new ListNode(3);
        ListNode listNode2_1 = new ListNode(2);
        ListNode listNode2_2 = new ListNode(4);
        listNode2_A_1.next = listNode2_A_2;
        listNode2_A_2.next = listNode2_A_3;
        listNode2_A_3.next = listNode2_1;
        listNode2_B.next = listNode2_1;
        listNode2_1.next = listNode2_2;
        System.out.println(getIntersectionNode(listNode2_A_1, listNode2_B));

        ListNode listNode3_A_1 = new ListNode(2);
        ListNode listNode3_A_2 = new ListNode(6);
        ListNode listNode3_A_3 = new ListNode(4);
        ListNode listNode3_B_1 = new ListNode(1);
        ListNode listNode3_B_2 = new ListNode(5);
        listNode3_A_1.next = listNode3_A_2;
        listNode3_A_2.next = listNode3_A_3;
        listNode3_B_1.next = listNode3_B_2;
        System.out.println(getIntersectionNode(listNode3_A_1, listNode3_B_1));
    }
}
