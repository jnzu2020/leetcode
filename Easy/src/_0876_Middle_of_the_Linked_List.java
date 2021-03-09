public class _0876_Middle_of_the_Linked_List {
    public static ListNode middleNode(ListNode head) {
        ListNode[] nodeArray = new ListNode[100];
        int index = 0;
        ListNode current = head;
        while (current != null) {
            nodeArray[index] = current;
            current = current.next;
            index++;
        }
        return nodeArray[index / 2];
    }

    public static void main(String[] args) {
        ListNode node1_4 = new ListNode(4, new ListNode(5));
        ListNode node1_3 = new ListNode(3, node1_4);
        ListNode node1_2 = new ListNode(2, node1_3);
        ListNode node1_head = new ListNode(1, node1_2);
        System.out.println(middleNode(node1_head));

        ListNode node2_5 = new ListNode(5, new ListNode(6));
        ListNode node2_4 = new ListNode(4, node2_5);
        ListNode node2_3 = new ListNode(3, node2_4);
        ListNode node2_2 = new ListNode(2, node2_3);
        ListNode node2_head = new ListNode(1, node2_2);
        System.out.println(middleNode(node2_head));
    }
}
