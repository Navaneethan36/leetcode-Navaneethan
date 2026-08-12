// Last updated: 8/12/2026, 11:15:58 AM
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0,a,ans;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum=sum+nums[i];
        }
        a=n*(n+1)/2;
        ans=a-sum;
        return ans;
    }
}