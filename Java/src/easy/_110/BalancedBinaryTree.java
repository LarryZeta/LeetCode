package easy._110;

import definition.TreeNode;

/**
 * @author Larry
 *
 * Given a binary tree, determine if it is height-balanced.
 *
 * For this problem, a height-balanced binary tree is defined as:
 *
 * a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example 1:
 *
 * Given the following tree [3,9,20,null,null,15,7]:
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * Return true.
 *
 * Example 2:
 *
 * Given the following tree [1,2,2,3,3,null,null,4,4]:
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * Return false.
 */

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {

        if (root == null) return true;

        else if (Math.abs(getDepth(root.left) - getDepth(root.right)) > 1) return false;

        else return isBalanced(root.left) && isBalanced(root.right);

    }

    int getDepth(TreeNode root) {

        if (root == null) return 0;

        else return  1 + Math.max(getDepth(root.left), getDepth(root.right));

    }

}
