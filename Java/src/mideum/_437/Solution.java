package mideum._437;

import definition.TreeNode;


public class Solution {

    public int pathSum(TreeNode root, int targetSum) {

        if (root == null) {
            return 0;
        }

        int sum = rootSum(root, targetSum);

        sum = sum + pathSum(root.left, targetSum);
        sum = sum + pathSum(root.right, targetSum);

        return sum;
    }

    int rootSum(TreeNode root, long targetSum) {

        if (root == null) {
            return 0;
        }

        int sum = 0;

        if (root.val == targetSum) {
            sum = sum + 1;
        }

        sum = sum + rootSum(root.left, targetSum - root.val);
        sum = sum + rootSum(root.right, targetSum - root.val);

        return sum;

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1000000000,1000000000,null,294967296,null,1000000000,null,1000000000,null,1000000000);
        System.out.println(new Solution().pathSum(root, 0));
    }


}
