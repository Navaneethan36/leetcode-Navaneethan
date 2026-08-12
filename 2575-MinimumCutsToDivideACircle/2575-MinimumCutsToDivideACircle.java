// Last updated: 8/12/2026, 11:14:27 AM
class Solution {
    public int numberOfCuts(int n) {
        if (n == 1)
            return 0;
        else if (n % 2 == 0)
            return n / 2;
        else
            return n;

    }
}