// Last updated: 8/12/2026, 11:15:48 AM
class Solution {
    public int bulbSwitch(int n) {
        // The number of bulbs that stay on is equal to 
        // the number of perfect squares up to n.
        return (int) Math.sqrt(n);
    }
}