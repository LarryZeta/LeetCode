package me.zly.Easy._26;

public class RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {

        if (nums == null|| nums.length == 0) {
            return 0;
        }

        int l = 1;
        int value = nums[0];
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] != value) {
                value = nums[i];
                nums[l] = nums[i];
                ++ l;
            }
        }

        return l;

    }

}
