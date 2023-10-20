package mideum._105;

import definition.TreeNode;

import java.util.Arrays;

public class Solution {

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 || inorder.length == 0) {
            return null;
        }

        TreeNode node = new TreeNode(preorder[0]);

        int inorderRootIndex = -1;

        for (int i = 0; i < inorder.length; i ++) {
            if (inorder[i] == node.val) {
                inorderRootIndex = i;
            }
        }

        if (inorderRootIndex == -1) {
            return null;
        }

        if ( inorderRootIndex > 0 ) {
            int[] preorderLeft = Arrays.copyOfRange(preorder, 1, inorderRootIndex + 1);
            int[] inorderLeft = Arrays.copyOfRange(inorder, 0, inorderRootIndex);
            node.left = buildTree(preorderLeft, inorderLeft);
        }

        if ( inorderRootIndex <  inorder.length - 1) {
            int[] preorderRight = Arrays.copyOfRange(preorder, inorderRootIndex + 1, inorder.length);
            int[] inorderRight = Arrays.copyOfRange(inorder, inorderRootIndex + 1, inorder.length);
            node.right = buildTree(preorderRight, inorderRight);

        }

        return node;
    }

}
