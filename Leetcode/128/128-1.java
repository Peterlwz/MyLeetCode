/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.
*/

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest = 1;
        int currentLongest = 1;

        if (nums == null || nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {


           if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            } else if (i > 0 && nums[i] == nums[i - 1] + 1) {
                currentLongest ++;
            } else {
                currentLongest = 1;
            }
            longest = Math.max(longest, currentLongest);
        }
        return longest;
    }
}