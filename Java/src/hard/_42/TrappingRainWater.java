package hard._42;

/**
 * @author zly
 *
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 *
 *
 * The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped. 
 * Thanks Marcos for contributing this image!
 *
 * Example:
 *
 * Input: [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 */

public class TrappingRainWater {

    public int trap(int[] height) {

		if (height.length == 0) return 0;

		int heighest = 0;
		int heighestloc = 0;
		
		for (int i = 0; i < height.length; i ++) { 
			if (height[i] > heighest) {
				heighest = height[i]; 
				heighestloc = i; 
			}
        }
		
		int side = 0;
		int res = 0;
		
		for (int i = 0; i < heighestloc; i ++) {
			if (side < height[i]) side = height[i];
			else res = res + (side - height[i]);
		}
		
		side = 0;
		for (int i = height.length - 1; i > heighestloc; i --) {
			if (side < height[i]) side = height[i];
			else res = res + (side - height[i]);
		}
		
		return res;

    }

}
