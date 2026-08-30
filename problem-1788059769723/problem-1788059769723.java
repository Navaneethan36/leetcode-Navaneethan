// Last updated: 8/30/2026, 8:46:09 AM
1class Solution {
2    public int countSpecialIntegers(int[] nums) {
3        Set<Integer>seen = new HashSet<>();
4        Set<Integer>invalid = new HashSet<>();
5    
6                
7
8                    for(int i=0;i<nums.length;i++){
9                        if(i==0||nums[i] != nums[i-1]){
10
11                    if(seen.contains(nums[i])){
12                        invalid.add(nums[i]);
13                    }  else{
14                        seen.add(nums[i]);
15                    }
16                    }
17                    }
18                    return seen.size()-invalid.size();
19                }
20}