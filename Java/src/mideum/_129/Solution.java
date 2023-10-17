package mideum._129;


import definition.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

    public int sumNumbers(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> integerQueue = new LinkedList<>();

        if (root == null) {
            return 0;
        }

        queue.add(root);

        while ( !queue.isEmpty() ) {

            TreeNode node = queue.poll();

            int baseVal = node.val * 10;

            if (node.left != null) {
                node.left.val = node.left.val + baseVal;
                queue.add(node.left);
            }
            if (node.right != null) {
                node.right.val = node.right.val + baseVal;
                queue.add(node.right);
            }
            if ( node.left == null && node.right == null ) {
                integerQueue.add(node.val);
            }

        }

        return integerQueue.stream().reduce(0, Integer::sum);
    }

}
