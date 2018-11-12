//
// Created by zly on 11/12/2018.
//

// Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
//
// Example:
//
// Input:  [1,2,3,4]
// Output: [24,12,8,6]
// Note: Please solve it without division and in O(n).
//
// Follow up:
// Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)

#include <vector>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {

        int sequence[nums.size()];
        int reverse[nums.size()];
        sequence[0] = nums[0];
        reverse[nums.size() - 1] = nums[nums.size() - 1];

        for (int i = 1; i < sizeof(sequence) / sizeof(sequence[0]); i ++) sequence[i] = sequence[i - 1] * nums[i];
        for (int i = sizeof(reverse) / sizeof(reverse[0]) - 2; i >= 0; i --) reverse[i] = reverse[i + 1] * nums[i];

        vector<int> output;
        output.push_back(reverse[1]);
        for (int i = 1; i < nums.size() - 1; i ++) output.push_back(sequence[i - 1] * reverse[i + 1]);
        output.push_back(sequence[nums.size() - 2]);

        return output;

    }
};