package hard._2449;

import java.util.Arrays;

public class MinimumNumberOfOperationsToMakeArraysSimilar {

    public long makeSimilar(int[] nums, int[] target) {

        for( int i = 0; i < nums.length; i ++ ){
            if( (nums[i] & 1) == 1 ) {
                nums[i] = -nums[i];
            }
            if( (target[i] & 1) == 1) {
                target[i] = -target[i];
            }
        }

        Arrays.sort(nums);
        Arrays.sort(target);

        long sum = 0;

        for( int i = 0; i < nums.length; i ++) {
            sum += Math.abs( nums[i] - target[i] );
        }

        return sum / 4;
    }

}
