package mideum._46;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Larry
 *
 * Given a collection of distinct integers, return all possible permutations.
 *
 * Example:
 *        Input: [1,2,3]
 *        Output:
 *        [
 *          [1,2,3],
 *          [1,3,2],
 *          [2,1,3],
 *          [2,3,1],
 *          [3,1,2],
 *          [3,2,1]
 *        ]
 */

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> lists = new LinkedList<>();

        if (nums == null) {
            return lists;
        }

        List<Integer> list = new LinkedList<>();
        list.add(nums[0]);
        lists.add(list);

        if (nums.length == 1) {
            return lists;
        }

        for (int i = 1; i < nums.length; i ++) {
            lists = addN(lists, nums[i]);
        }

        return lists;

    }


    public List<List<Integer>> addN(List<List<Integer>> lists, int n) {

        List<List<Integer>> listList = new LinkedList<>();

        for (List<Integer> list : lists) {
            int size = list.size();
            for (int i = 0 ; i <= size; i ++ ) {
                List<Integer> integerList = new LinkedList<>(list);
                integerList.add(i, n);
                listList.add(integerList);
            }
        }

        return listList;
    }

    public static void main(String[] args) {

        new Permutations().permute(new int[]{1, 2, 3});

    }

}
