// Last updated: 8/12/2026, 11:14:55 AM
class Solution {
    public int numberOfSteps(int num) {
        int steps = 0;
        
        while (num > 0) {
            if (num % 2 == 0) {
                // If even, divide by 2
                num /= 2;
            } else {
                // If odd, subtract 1
                num -= 1;
            }
            steps++;
        }
        
        return steps;
    }
}