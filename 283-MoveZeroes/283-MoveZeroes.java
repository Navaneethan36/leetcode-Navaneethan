// Last updated: 8/12/2026, 11:15:52 AM
class Solution {
    public int[] moveZeroes(int[] nums) {
      int n = nums.length;
      int ind = 0;
      for(int i=0;i<n;i++){
         if(nums[i]!=0){
            nums[ind]=nums[i];
            ind++;
         }
       }
       while(ind<n){
        nums[ind]=0;
        ind++;
       }
      return nums;
    }
}