import java.util.ArrayList;
import java.util.List;

public class _0234_Palindrome_Linked_List {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        for (int i = 0 , j = list.size() - 1 ; i <= j ; i++ , j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2));
        System.out.println(isPalindrome(listNode1));

        ListNode listNode2_3 = new ListNode(2, new ListNode(1));
        ListNode listNode2_2 = new ListNode(2, listNode2_3);
        ListNode listNode2_1 = new ListNode(1, listNode2_2);
        System.out.println(isPalindrome(listNode2_1));

        ListNode listNode3 = new ListNode(-129, new ListNode(-129));
        System.out.println(isPalindrome(listNode3));
    }
}
