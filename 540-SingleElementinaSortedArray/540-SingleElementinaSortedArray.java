// Last updated: 9/29/2026, 9:47:29 PM
1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3       int l = 0,r=nums.length-1;
4      
5      while(l<r){
6       int m=(l+r)/2;
7       if(m%2==1)
8       m--;
9
10       if(nums[m] == nums[m+1])
11       l = m+2;
12       else
13       r=m;
14    }
15    return nums[l];
16}
17}