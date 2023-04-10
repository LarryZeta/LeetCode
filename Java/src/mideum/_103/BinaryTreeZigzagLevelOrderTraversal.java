package mideum._103;

import definition.TreeNode;
import mideum._102.BinaryTreeLevelOrderTraversal;

import java.util.Collections;
import java.util.List;

/**
 * @author Larry
 *
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its zigzag level order traversal as:
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> lists = new BinaryTreeLevelOrderTraversal().levelOrder(root);

        for (int i = 1; i < lists.size(); i = i + 2) Collections.reverse(lists.get(i));

        return lists;

    }

}
