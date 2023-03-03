package RemoveLinkedListElements;

import ListNode.ListNode;

/**
 * Remove Linked List Elements.
 * Given the head of a linked list and an integer val,
 * remove all the nodes of the linked list that has
 * Node.val == val, and return the new head.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        var current = newHead;
        while (current.next != null){
            if (current.next.val == val){
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return newHead.next;
    }
}


