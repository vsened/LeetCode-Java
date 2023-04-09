package MinimumDepthOfBinaryTree;

import TreeNode.TreeNode;

import java.util.*;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        var queue = new ArrayDeque<TreeNode>();
        var count = 1;
        queue.offer(root);
        while (!queue.isEmpty()) {
            var level = queue.size();
            for (int i = 0; i < level; i++) {
                var node = queue.poll();
                if (node.right != null) {
                    queue.offer(node.right);
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.left == null && node.right == null) {
                    return count;
                }
            }
            count++;
        }
        return count;
    }

    public int minDepth2(TreeNode root) {
        if(root == null) return 0;

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if(root.left == null && root.right == null ) return 1;
        if(root.left == null) return 1 + rightDepth;
        if(root.right == null) return 1 + leftDepth;

        return Math.min(leftDepth,rightDepth) + 1;
    }
}
