// Last updated: 8/12/2026, 11:14:26 AM
class Solution {
    public int commonFactors(int a, int b) {
        int g = gcd(a, b);
        int count = 0;
        
        // Count divisors of the GCD up to its square root
        for (int i = 1; i * i <= g; i++) {
            if (g % i == 0) {
                count++; // i is a factor
                if (i * i != g) {
                    count++; // g/i is also a distinct factor
                }
            }
        }
        
        return count;
    }

    // Helper method to find GCD using Euclidean Algorithm
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}