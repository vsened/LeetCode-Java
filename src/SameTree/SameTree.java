package SameTree;

import TreeNode.TreeNode;

import java.util.ArrayDeque;

/** <b>Same Tree</b>
 * <p>
 * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
 * </p>
 * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null)
            || (p != null && q == null)) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        var queue = new ArrayDeque<TreeNode>();
        queue.addLast(p);
        queue.addLast(q);
        while (!queue.isEmpty()) {
            var first = queue.pollFirst();
            var second = queue.pollFirst();
            if (first != null && second != null) {
                if (first.val != second.val) {
                    return false;
                }
                if (first.left != null && second.left != null) {
                    queue.addLast(first.left);
                    queue.addLast(second.left);
                } else if ((first.left == null && second.left != null)
                        || (first.left != null && second.left == null)) {
                    return false;
                }
                if (first.right != null && second.right != null) {
                    queue.addLast(first.right);
                    queue.addLast(second.right);
                } else if ((first.right == null && second.right != null)
                        || (first.right != null && second.right == null)) {
                    return false;
                }
            }
        }
        return true;
    }
}
