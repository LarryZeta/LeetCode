package easy._637;

import definition.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> queueNext = new LinkedList<>();

        List<Double> averageList = new LinkedList<>();

        queue.offer(root);
        averageList.add((double) root.val);

        while ( !queue.isEmpty() ) {

            TreeNode node = queue.poll();
            if (node.left != null) {
                queueNext.offer(node.left);
            }
            if (node.right != null) {
                queueNext.offer(node.right);
            }
            if ( queue.isEmpty() && !queueNext.isEmpty() ) {
                long sum = 0;
                for (TreeNode node1 : queueNext) {
                    sum = sum + node1.val;
                }
                averageList.add((double) sum / queueNext.size());

                queue = queueNext;
                queueNext = new LinkedList<>();
            }

        }

        return averageList;

    }

}
