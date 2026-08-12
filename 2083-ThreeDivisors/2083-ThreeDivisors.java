// Last updated: 8/12/2026, 11:14:41 AM
class Solution {
    public boolean isThree(int n) {
        if (n < 4) return false;
        
        int root = (int) Math.sqrt(n);
        
        // If not a perfect square, it can't have exactly 3 divisors
        if (root * root != n) return false;
        
        // Check if the root is prime
        return isPrime(root);
    }
    
    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}