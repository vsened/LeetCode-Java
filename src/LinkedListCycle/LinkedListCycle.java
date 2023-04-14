package LinkedListCycle;
import ListNode.ListNode;

/** <b>Linked List Cycle</b>
 * <p>
 * Given head, the head of a linked list, determine if the linked list has a cycle in it.
 *</p>
 * There is a cycle in a linked list if there is some node in the list that can be reached
 * again by continuously following the next pointer. Internally, pos is used to denote the
 * index of the node that tail's next pointer is connected to. Note that pos is not passed
 * as a parameter.
 * <p>
 * Return true if there is a cycle in the linked list. Otherwise, return false.
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        var slow = head;
        var fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
