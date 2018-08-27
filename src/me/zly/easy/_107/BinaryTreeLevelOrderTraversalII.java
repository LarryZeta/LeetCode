package me.zly.easy._107;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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

public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        if (root == null) return new LinkedList<>();

        Stack<List<Integer>> stack = new Stack<>();
        List<Integer> integers = new LinkedList<>();
        integers.add(root.val);

        Queue<TreeNode> treeNodeQueue;
        Queue<TreeNode> nextNodeQueue = new LinkedList<>();
        nextNodeQueue.add(root);

        while (!nextNodeQueue.isEmpty()) {
            stack.push(integers);
            treeNodeQueue = nextNodeQueue;
            integers = new LinkedList<>();
            nextNodeQueue = new LinkedList<>();
            while (!treeNodeQueue.isEmpty()) {
                TreeNode treeNode = ((LinkedList<TreeNode>) treeNodeQueue).pop();
                if (treeNode.left != null) {
                    nextNodeQueue.add(treeNode.left);
                    integers.add(treeNode.left.val);
                }
                if (treeNode.right != null) {
                    nextNodeQueue.add(treeNode.right);
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
