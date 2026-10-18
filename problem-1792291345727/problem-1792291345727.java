// Last updated: 10/18/2026, 8:12:25 AM
1class Solution {
2    public int minDeletions(int[] nums) {
3      int count = 0;
4        int last = nums[0];
5        for(int i=1; i<nums.length;i++){
6            if(nums[i] == nums[i-1]){
7                count ++;
8            }else{
9                last = nums[i];
10            }
11        }
12        return count;
13    }
14}