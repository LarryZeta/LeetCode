package mideum._106;

import definition.TreeNode;

import java.util.Arrays;


public class Solution {

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        if (inorder.length == 0 || postorder.length == 0) {
            return null;
        }

        if (inorder.length != postorder.length) {
            return null;
        }

        int rootVal = postorder[postorder.length - 1];
        TreeNode node = new TreeNode(rootVal);

        int inOrderRootIndex = -1;
        for (int i = 0; i < inorder.length; i ++) {
            if (inorder[i] == rootVal) {
                inOrderRootIndex = i;
            }
        }

        if (inOrderRootIndex > 0) {
            int[] inOrderLeft = Arrays.copyOfRange(inorder, 0, inOrderRootIndex);
            int[] postorderLeft = Arrays.copyOfRange(postorder, 0, inOrderRootIndex);
            node.left = buildTree(inOrderLeft, postorderLeft);
        }

        if (inOrderRootIndex < inorder.length - 1) {
            int[] inOrderRight = Arrays.copyOfRange(inorder, inOrderRootIndex + 1, inorder.length);
            int[] postorderRight = Arrays.copyOfRange(postorder, inOrderRootIndex, postorder.length - 1);
            node.right = buildTree(inOrderRight, postorderRight);
        }

        return node;

    }



}
