package RemoveLinkedListElements;

import ListNode.ListNode;

public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        var current = newHead;
        while (current.next != null){
            if (current.next.val == val){
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }
        return newHead.next;
    }
}


