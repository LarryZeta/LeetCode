package easy._543;

import definition.TreeNode;

public class Solution {

    public int diameterOfBinaryTree(TreeNode root) {
        if ( root == null ) {
            return 0;
        }

        depth(root);

        int diameter = 0;
        if (root.left != null) {
            diameter = diameter + root.left.val + 1;
        }
        if (root.right != null) {
            diameter = diameter + root.right.val + 1;
        }

        int subDiameter = Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right));
        diameter = Math.max(subDiameter, diameter);

        return diameter;
    }

    public int depth(TreeNode node) {

        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            node.val = 0;
            return 0;
        }

        node.val = 1 + Math.max(depth(node.left), depth(node.right));
        return node.val;

    }

}
