package MiddleOfTheLinkedList;

import ListNode.ListNode;
/**
 * Middle of the Linked List.
 * <p>
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        var slow = head;
        while (head != null && head.next != null){
            slow = slow.next;
            head = head.next.next;
        }
        return slow;
    }
}
