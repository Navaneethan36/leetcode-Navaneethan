// Last updated: 8/12/2026, 11:14:50 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];
        res[0] = nums[0];
        for(int i=1;i<n;i++){
           res[i]=res[i-1]+nums[i];
           //nums[i]=nums[i]+nums[i-1];   //Without using new array
        }
        return res;   
    }
}