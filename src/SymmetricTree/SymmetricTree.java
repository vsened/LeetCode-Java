package SymmetricTree;

import TreeNode.TreeNode;

import java.util.ArrayDeque;


public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null || root.right == null)
            return root.left == root.right;
        var queue = new ArrayDeque<TreeNode>();
        queue.push(root.left);
        queue.push(root.right);
        while (queue.size() > 0){
            var left = queue.pop();
            var right = queue.pop();
            if (left.val != right.val)
                return false;
            if (left.left != null && right.right != null){
                if (left.left.val == right.right.val){
                    queue.push(left.left);
                    queue.push(right.right);
                }
                else
                    return false;
            }
            else if (left.left != null && right.right == null
                    || left.left == null && right.right != null)
                return false;
            if (left.right != null && right.left != null){
                if (left.right.val == right.left.val){
                    queue.push(left.right);
                    queue.push(right.left);
                }
                else
                    return false;
            }
            else if (left.right == null && right.left != null
                    || left.right != null && right.left == null)
                return false;
        }
        return true;
    }
}
