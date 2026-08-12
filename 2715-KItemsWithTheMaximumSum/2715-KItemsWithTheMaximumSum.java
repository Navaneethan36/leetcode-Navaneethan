// Last updated: 8/12/2026, 11:14:12 AM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int sum = 0;

        // Take as many 1s as possible
        int takeOnes = Math.min(k, numOnes);
        sum += takeOnes;
        k -= takeOnes;

        // Take zeros if still needed (no change to sum)
        int takeZeros = Math.min(k, numZeros);
        k -= takeZeros;

        // Remaining picks must be -1s
        sum -= k;

        return sum;
    }
}
