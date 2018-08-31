package me.zly.mideum._94;

import me.zly.definition.TreeNode;

import java.util.LinkedList;
import java.util.List;

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

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new LinkedList<>();

        if (root != null) inorderTraversal(root, list);

        return list;

    }

    void inorderTraversal(TreeNode root, List<Integer> list) {


        if (root.left != null) inorderTraversal(root.left, list);

        list.add(root.val);

        if (root.right != null) inorderTraversal(root.right, list);

    }

}
