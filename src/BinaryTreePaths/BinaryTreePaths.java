package BinaryTreePaths;

import TreeNode.TreeNode;
import java.util.ArrayList;
import java.util.List;
/** <b>Binary Tree Paths</b>
 * <p>
 * Given the root of a binary tree, return all root-to-leaf paths in any order.
 * <p>
 * A leaf is a node with no children.
 */
public class BinaryTreePaths {
    ArrayList<String> paths = new ArrayList<String>();

    public List<String> binaryTreePaths(TreeNode root) {
        getPaths(root);
        return paths;
    }

    private void getPaths(TreeNode root) {
        if (root == null) return;
        checkPath(root, "");
    }

    private void checkPath(TreeNode node, String path) {
        if (node.right == null && node.left == null) {
            paths.add(path + node.val);
        }
        if (node.left != null) {
            checkPath(node.left, path + node.val + "->");
        }
        if (node.right != null) {
            checkPath(node.right,  path + node.val + "->");
        }
    }
}
