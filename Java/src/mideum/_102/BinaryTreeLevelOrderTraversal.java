package mideum._102;

import definition.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Larry
 *
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 *
 * For example:
 * Given binary tree [3,9,20,null,null,15,7],
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its level order traversal as:
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) return new LinkedList<>();

        List<List<Integer>> lists = new LinkedList<>();
        List<Integer> integers = new LinkedList<>();
        integers.add(root.val);

        List<TreeNode> treeNodes;
        // the next level TreeNode List
        List<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            lists.add(integers);
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

        return lists;

    }

}
