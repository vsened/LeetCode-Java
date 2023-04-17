package MergeTwoBinaryTrees;

import TreeNode.TreeNode;
/** <b>Merge Two Binary Trees</b>
 * <p>
 * You are given two binary trees root1 and root2.
 * </p>
 * Imagine that when you put one of them to cover the other, some nodes of the two trees
 * are overlapped while the others are not. You need to merge the two trees into a new
 * binary tree. The merge rule is that if two nodes overlap, then sum node values up as
 * the new value of the merged node. Otherwise, the NOT null node will be used as the node
 * of the new tree.
 * <p>
 * Return the merged tree.
 * </p>
 * Note: The merging process must start from the root nodes of both trees.
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        return helper(root1, root2);
    }

    private TreeNode helper(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return null;
        TreeNode node = new TreeNode();
        if (node1 != null) node.val += node1.val;
        if (node2 != null) node.val += node2.val;
        node.left = helper(
                node1!= null ? node1.left : null,
                node2!= null ? node2.left : null
        );
        node.right = helper(
                node1 != null ? node1.right : null,
                node2 != null ? node2.right : null
        );
        return node;
    }
}
