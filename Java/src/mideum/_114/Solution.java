package mideum._114;

import definition.TreeNode;

public class Solution {

    public void flatten(TreeNode root) {

        if (root == null) {
            return;
        }

        if (root.left != null) {
            TreeNode right = root.right;
            TreeNode left = root.left;

            root.right = left;
            while ( left.right != null) {
                left = left.right;
            }
            left.right = right;
            root.left = null;
        }

        if (root.right != null) {
            flatten(root.right);
        }

    }

}
