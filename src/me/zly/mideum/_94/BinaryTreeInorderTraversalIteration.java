package me.zly.mideum._94;

import java.util.List;
import java.util.LinkedList;
import java.util.Stack;

import me.zly.definition.TreeNode;

/**
 * @author zly
 *
 * Given a binary tree, return the inorder traversal of its nodes' values.
 *
 * Example:
 *
 * Input: [1,null,2,3]
 *    1
 *     \
 *      2
 *     /
 *    3
 *
 * Output: [1,3,2]
 * Follow up: Recursive solution is trivial, could you do it iteratively?
 */

public class BinaryTreeInorderTraversalIteration {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new LinkedList<>();

        if (root == null) return list;

        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            if (!stack.isEmpty()) {
                root = stack.pop();
                list.add(root.val);
                root = root.right;
            }

        }

        return list;

    }

}
