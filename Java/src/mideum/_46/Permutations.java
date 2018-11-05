package mideum._46;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zly
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

// TODO
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> lists = new ArrayList<>();
        Node tree = new Node(0);

        for (int i = 0; i < nums.length; i++) {
            tree.childs.add(new Node(nums[i]));
            for (int j = i; j < nums.length; j++) {

            }
        }

        return null;
    }
}

class Node {
    int val;
    ArrayList<Node> childs;
    Node(int x) {this.val = x;}
}