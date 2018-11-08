//
// Created by zly on 11/8/2018.
//

// There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
// Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
// You may assume nums1 and nums2 cannot be both empty.
//
//
//
// Example 1:
//
// nums1 = [1, 3]
// nums2 = [2]
//
// The median is 2.0
// Example 2:
//
// nums1 = [1, 2]
// nums2 = [3, 4]
//
// The median is (2 + 3)/2 = 2.5

#include <vector>
using namespace std;

class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        int m = nums1.size();
        int n = nums2.size();
        int size = m + n;
        int array[size];
        int i = 0;
        int j = 0;
        int k = 0;

        while (j < m && k < n) {
            if (nums1[j] < nums2[k]) array[i] = nums1[j ++];
            else array[i] = nums2[k ++];
            i ++;
        }

        while (j < m) array[i ++] = nums1[j ++];


        while (k < n) array[i ++] = nums2[k ++];

        if (size % 2 == 1) return array[size / 2];
        else return (double)(array[size / 2 - 1] + array[size / 2]) / 2;

    }
};