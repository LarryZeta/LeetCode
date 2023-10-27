package mideum.LCR._152;

import definition.TreeNode;

import java.util.Arrays;

class Solution {
    public boolean verifyTreeOrder(int[] postorder) {

        if (postorder == null || postorder.length == 0) {
            return true;
        }

        int[] inOder = Arrays.copyOf(postorder, postorder.length);
        Arrays.sort(inOder);

        try {
            buildTree(inOder, postorder);
        } catch (RuntimeException e) {
            return false;
        }

        return true;
    }

    public TreeNode buildTree(int[] inorder, int[] postOrder) {

        if (inorder.length != postOrder.length) {
            throw new RuntimeException();
        }

        if (inorder.length == 0 || postOrder.length == 0) {
            return null;
        }

        TreeNode node = new TreeNode(postOrder[postOrder.length - 1]);

        int inorderRootIndex = -1;

        for (int i = 0; i < inorder.length; i ++) {
            if (inorder[i] == node.val) {
                inorderRootIndex = i;
            }
        }

        if (inorderRootIndex == -1) {
            throw new RuntimeException();
        }

        if ( inorderRootIndex > 0 ) {
            int[] inorderLeft = Arrays.copyOfRange(inorder, 0, inorderRootIndex);
            int[] postOrderLeft = Arrays.copyOfRange(postOrder, 0, inorderRootIndex);
            node.left = buildTree(inorderLeft, postOrderLeft);
        }

        if ( inorderRootIndex <  inorder.length - 1) {
            int[] inorderRight = Arrays.copyOfRange(inorder, inorderRootIndex + 1, inorder.length);
            int[] postOrderRight = Arrays.copyOfRange(postOrder, inorderRootIndex, postOrder.length - 1);

            node.right = buildTree(inorderRight, postOrderRight);
        }

        return node;
    }

}
