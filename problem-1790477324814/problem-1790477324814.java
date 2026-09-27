// Last updated: 9/27/2026, 8:18:44 AM
1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3       TreeMap<Integer,Integer> map= new TreeMap<>();
4        for(int x:nums)
5            map.put(x,map.getOrDefault(x,0)+1);
6        int[] ans = new int[nums.length];
7        int k=0;
8
9        while(!map.isEmpty()){
10            ArrayList<Integer>key=new ArrayList<>(map.keySet());
11
12            for(int x:key ){
13                ans[k++]=x;
14
15            if(map.get(x)==1)
16            map.remove(x);
17                else
18            map.put(x,map.get(x)-1);
19            }
20        }
21        return ans;
22    }
23}