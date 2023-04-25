package mideum._236;

import definition.TreeNode;

import java.util.Stack;

/**
 * pdd 2023-04-23
 */
class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        Stack<TreeNode> pStack = new Stack<>();
        Stack<TreeNode> qStack = new Stack<>();

        findNode(root, p, pStack);
        findNode(root, q, qStack);

        while (pStack.size() != qStack.size()) {
            if (pStack.size() > qStack.size()) {
                pStack.pop();
            } else {
                qStack.pop();
            }
        }

        while (pStack.peek() != qStack.peek()) {
            pStack.pop();
            qStack.pop();
        }

        return pStack.pop();
    }

    public boolean findNode(TreeNode root, TreeNode n, Stack<TreeNode> stack) {

        stack.push(root);

        if (root == n) {
            return true;
        }
        if (root == null) {
            return false;
        }

        boolean find = findNode(root.left, n, stack);
        if (find) {
            return find;
        }
        stack.pop();

        find = findNode(root.right, n, stack);
        if (!find) {
            stack.pop();
        }
        return find;
    }

    //[3,5,1,6,2,0,8,null,null,7,4]

    public static void main(String[] args) {
//        TreeNode root = new TreeNode(3);
//        TreeNode n1 = new TreeNode(5);
//        root.left = n1;
//        TreeNode n2 = new TreeNode(1);
//        root.right = n2;
//        root.left.left = new TreeNode(6);
//        root.left.right = new TreeNode(2);
//        root.right.left = new TreeNode(0);
//        root.right.right = new TreeNode(8);
//
//        root.left.right.left = new TreeNode(7);
//        root.left.right.right = new TreeNode(4);

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        root.right = n2;
        TreeNode n1 = new TreeNode(4);
        root.left.right = n1;


        TreeNode s = new Solution().lowestCommonAncestor(root, n1, n2);
        System.out.println(s.val);
    }

}