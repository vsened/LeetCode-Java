package MiddleOfTheLinkedList;

import ListNode.ListNode;

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
