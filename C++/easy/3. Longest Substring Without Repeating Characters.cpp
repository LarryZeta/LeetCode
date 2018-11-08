// Given a string, find the length of the longest substring without repeating characters.
//
// Examples:
//
//        Given "abcabcbb", the answer is "abc", which the length is 3.
//
//        Given "bbbbb", the answer is "b", with the length of 1.
//
//        Given "pwwkew", the answer is "wke", with the length of 3.
//
// Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
#include <string>
#include <set>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {

        int size = s.size();

        set<char> char_set;

        int ans = 0, i = 0, j = 0;

        while (i < size && j < size) {
            if (char_set.count(s[j]) == 0) {
                char_set.insert(s[j ++]);
                ans = max(ans, j - i);
            } else char_set.erase(s[i ++]);
        }

        return ans;

    }
};