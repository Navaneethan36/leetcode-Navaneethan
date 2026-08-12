// Last updated: 8/12/2026, 11:14:07 AM
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        
        // Iterate through all numbers from 1 to n
        for (int i = 1; i <= n; i++) {
            // Use the modulo operator to check for divisibility
            // If i is divisible by 3, 5, or 7, add it to the sum
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        
        return sum;
    }
}