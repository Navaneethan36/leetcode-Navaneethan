// Last updated: 9/6/2026, 8:31:43 AM
1class Solution {
2    public int countRotations(String s, int k) {
3        int n = s.length();
4        int ans = 0;
5
6        for(int r=0;r<n;r++){
7            int score = 0;
8
9        for(int i=0;i<n-1;i++){
10            char a = s.charAt((r+i)%n);
11            char b = s.charAt((r+i+1)%n);
12
13            if(a==b){
14                score++;
15            }
16        }    
17            if(score == k){
18                ans++;
19            }
20        }
21        return ans;
22    }
23}