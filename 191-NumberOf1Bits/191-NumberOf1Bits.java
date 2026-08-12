// Last updated: 8/12/2026, 11:16:24 AM
class Solution {
    public int hammingWeight(int n) {
      int c=0;
      while(n!=0){
           n=n&n-1;
           c++;
      }  
    return c;
    }

}