package mideum._230;

import definition.TreeNode;

import java.util.LinkedList;

public class Solution {

    public int kthSmallest(TreeNode root, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        dfs(root, list);
        return list.get(k - 1);
    }

    void dfs(TreeNode node, LinkedList<Integer> list) {
        if (node == null) {
            return;
        }
        dfs(node.left, list);
        list.add(node.val);
        dfs(node.right, list);
    }

}
