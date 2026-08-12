// Last updated: 8/12/2026, 11:16:10 AM
class Solution {
    public boolean isPowerOfTwo(int n) {
       if(n<1)
        return false;
       while(n%2==0){
        n=n/2;
       } 
       if(n==1)
         return true;
       else
         return false;    
    }
}