package ReverseLinkedList;

import ListNode.ListNode;
/** <b>Reverse Linked List</b>
 * <p>
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 * </p>
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        var current = head;
        while (current != null) {
            var tempNode = current.next;
            current.next = prev;
            prev = current;
            current = tempNode;
        }
        return prev;
    }
}