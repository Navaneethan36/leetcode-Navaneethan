// Last updated: 10/7/2026, 9:06:08 PM
1class Solution {
2    public String reverseWords(String s) {
3       String[] words = s.split(" ");
4       String ans = " ";
5       for(String w:words){
6        ans +=  new StringBuilder(w).reverse() +" ";
7       } 
8       return ans.trim();
9    }
10}