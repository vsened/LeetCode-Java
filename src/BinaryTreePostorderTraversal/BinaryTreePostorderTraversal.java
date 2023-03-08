package BinaryTreePostorderTraversal;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
/**
 * Binary Tree Postorder Traversal
 * <p>
 * Given the root of a binary tree, return the postorder traversal of its nodes' values.
 */
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        var result = new ArrayList<Integer>();
        postorder(root, result);
        return result;
    }
    private void postorder(TreeNode node, ArrayList<Integer> list){
        if (node == null)
            return;
        postorder(node.left, list);
        postorder(node.right, list);
        list.add(node.val);
    }
}
