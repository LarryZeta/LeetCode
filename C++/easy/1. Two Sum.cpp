//
// Created by zly on 7/26/2018.
//

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 *        Given nums = [2, 7, 11, 15], target = 9,
 *
 *        Because nums[0] + nums[1] = 2 + 7 = 9,
 *        return [0, 1].
 */

#include <vector>
using namespace std;

class Solution {
public:
	vector<int> twoSum(vector<int>& nums, int target)
	{
		vector<int> r;
		for (int i = 0; i < nums.size() - 1; i++)
		{
			for (int j = i + 1; j < nums.size(); j++)
			{
				if (nums.at(i) + nums.at(j) == target)
				{
					r.push_back(i);
					r.push_back(j);
					return r;
				}
			}
		}
		return r;
	}
};