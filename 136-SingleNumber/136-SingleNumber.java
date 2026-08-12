// Last updated: 8/12/2026, 11:16:48 AM
class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
        }
        return x;
        
    }
}