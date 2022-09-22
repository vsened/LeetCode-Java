package BinaryTreePostorderTraversal;

import TreeNode.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
