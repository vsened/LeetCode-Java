package BinaryTreeInorderTraversal;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;
/** <b>Binary Tree Inorder Traversal </b>
 * <p>
 * Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        var result = new ArrayList<Integer>();
        helper(root, result);
        return result;
    }

    private static void helper(TreeNode node, List<Integer> list) {
        if (node == null) {
            return;
        }
        helper(node.left, list);
        list.add(node.val);
        helper(node.right, list);
    }
}
