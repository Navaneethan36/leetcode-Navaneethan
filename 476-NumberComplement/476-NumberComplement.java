// Last updated: 8/12/2026, 11:15:24 AM
class Solution {
    public int findComplement(int num) {
        int m= 0;
        int temp = num;
        while(temp>0){
          m=(m<<1)|1;
          temp>>=1;
        }
     return num^m;
    }
}