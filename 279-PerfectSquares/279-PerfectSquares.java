// Last updated: 8/12/2026, 11:15:55 AM
import java.util.Arrays;

class Solution {
    public int numSquares(int n) {
        // dp[i] will store the least number of perfect squares that sum to i
        int[] dp = new int[n + 1];
        
        // Initialize the array with a large value (n is the maximum possible, using all 1s)
        Arrays.fill(dp, n);
        
        // Base case: 0 requires 0 squares
        dp[0] = 0;
        
        // Iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Try every perfect square j*j that is less than or equal to i
            for (int j = 1; j * j <= i; j++) {
                int square = j * j;
                // The minimum squares for i is 1 (the current square) 
                // plus the minimum squares required for the remaining value (i - square)
                dp[i] = Math.min(dp[i], dp[i - square] + 1);
            }
        }
        
        return dp[n];
    }
}
