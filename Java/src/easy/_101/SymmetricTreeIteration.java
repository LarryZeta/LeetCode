package easy._101;

import definition.TreeNode;

import java.util.Stack;

/**
 * @author zly
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 *
 * For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * But the following [1,2,2,null,3,null,3] is not:
 *     1
 *    / \
 *   2   2
 *    \   \
 *     3    3
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 */

public class SymmetricTreeIteration {

    public boolean isSymmetric(TreeNode root) {

        if (root != null) return isSymmetric(root.left, root.right);
        else return true;

    }

    boolean isSymmetric(TreeNode p, TreeNode q) {

        Stack<TreeNode> pstack = new Stack<>();
        Stack<TreeNode> qstack = new Stack<>();

        while (p != null && q != null || p == null && q == null) {

            if (p == null) {
                if (pstack.isEmpty() && qstack.isEmpty()) return true;
                else if (!pstack.isEmpty() && !qstack.isEmpty()) {
                    p = pstack.pop().right;
                    q = qstack.pop().left;
                }
                else return false;
            }
            else if (p.val == q.val) {
                pstack.push(p);
                qstack.push(q);
                p = p.left;
                q = q.right;
            } else  return false;

        }

        return false;

    }

}
