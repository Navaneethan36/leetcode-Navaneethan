// Last updated: 8/12/2026, 11:14:21 AM
class Solution {
    public int passThePillow(int n, int time) {
      if(n==1)
      return 1;
      int cycle = 2*(n-1);
      int t=time%cycle;
      if(t<n){
         return t+1;
      }else{
        return 2*n-t-1;
      }  

    }
}