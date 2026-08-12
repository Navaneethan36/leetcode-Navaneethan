// Last updated: 8/12/2026, 11:17:03 AM
class Solution {
    public int lengthOfLastWord(String s) {
       int c=0;
       int i=s.length()-1;
       while(i>=0&&s.charAt(i)==' ')
       {
        i--;
       } 
       while(i>=0&&s.charAt(i)!=' ')
    {
        c++;
        i--;
    }
    return c;
    }

}