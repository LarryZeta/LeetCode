package me.zly.easy._107;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import me.zly.definition.TreeNode;


/**
 * @author zly
 *
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 *
 * For example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its bottom-up level order traversal as:
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 */

public class BinaryTreeLevelOrderTraversal_II {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null) return new LinkedList<>();

        Stack<List<Integer>> stack = new Stack<>();
        List<Integer> integers = new LinkedList<>();
        integers.add(root.val);

        List<TreeNode> treeNodes;
        // the next level TreeNode List
        List<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            stack.push(integers);
            treeNodes = nodes;
            integers = new LinkedList<>();
            nodes = new LinkedList<>();
            while (!treeNodes.isEmpty()) {
                TreeNode treeNode = ((LinkedList<TreeNode>) treeNodes).pop();
                if (treeNode.left != null) {
                    nodes.add(treeNode.left);
                    integers.add(treeNode.left.val);
                }
                if (treeNode.right != null) {
                    nodes.add(treeNode.right);
                    integers.add(treeNode.right.val);
                }
            }
        }

        List<List<Integer>> lists = new LinkedList<>();
        while (!stack.isEmpty()) {
            lists.add(stack.pop());
        }

        return lists;

    }

}
