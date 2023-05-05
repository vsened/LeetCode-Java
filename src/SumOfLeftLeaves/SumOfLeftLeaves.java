package SumOfLeftLeaves;
import TreeNode.TreeNode;

import java.util.ArrayDeque;

/** <b>Sum of Left Leaves</b>
 * <p>
 * Given the root of a binary tree, return the sum of all left leaves.
 * </p>
 * A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        var queue = new ArrayDeque<TreeNode>();
        queue.addLast(root);
        var sum = 0;
        while (!queue.isEmpty()) {
            var node = queue.removeFirst();
            if (node.left != null) {
                if (node.left.left == null && node.left.right == null) {
                    sum += node.left.val;
                } else {
                    queue.addLast(node.left);
                }
                if (node.right != null) {
                    queue.addLast(node.right);
                }
            }
        }
        return sum;
    }
}
