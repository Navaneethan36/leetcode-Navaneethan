// Last updated: 9/28/2026, 8:45:03 PM
1class Solution {
2    public int[] countBits(int n) {
3       int ans[] = new int[n+1];
4
5       for(int i=1; i<=n; i++){
6        ans[i]=ans[i >> 1]+(i & 1);
7       }
8       return ans;
9    }
10}