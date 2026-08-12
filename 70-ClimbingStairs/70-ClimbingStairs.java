// Last updated: 8/12/2026, 11:17:00 AM
class Solution {
    public int climbStairs(int n) {
        // Base cases
        if (n <= 2) return n;
        
        // Use two variables to store the results of the previous two steps
        // This is like calculating Fibonacci: 1, 2, 3, 5, 8...
        int first = 1;  // Ways to reach step 1
        int second = 2; // Ways to reach step 2
        
        for (int i = 3; i <= n; i++) {
            int current = first + second;
            first = second;
            second = current;
        }
        
        return second;
    }
}