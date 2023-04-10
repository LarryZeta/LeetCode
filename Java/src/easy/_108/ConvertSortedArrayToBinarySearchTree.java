package easy._108;

import definition.TreeNode;

/**
 * @author Larry
 *
 * Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
 *
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * Example:
 *
 * Given the sorted array: [-10,-3,0,5,9],
 *
 * One possible answer is: [0,-3,9,-10,null,5], which represents the following height balanced BST:
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 */

public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {

        if (nums == null || nums.length == 0) return null;

        else return sortedArrayToBST(nums, 0, nums.length - 1);

    }

    TreeNode sortedArrayToBST(int[] nums, int begin, int end) {

        if (begin > end) return null;

        else {

            int mid = begin + (end - begin) / 2;
            TreeNode root = new TreeNode(nums[mid]);
            root.left = sortedArrayToBST(nums, begin, mid - 1);
            root.right = sortedArrayToBST(nums, mid + 1, end);
            return root;

        }

    }

}
