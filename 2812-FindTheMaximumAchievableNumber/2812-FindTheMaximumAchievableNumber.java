// Last updated: 8/12/2026, 11:14:05 AM
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        // The maximum value is reached by increasing num t times 
        // and decreasing x t times to meet in the middle.
        // Therefore, x = num + 2 * t.
        return num + (2 * t);
    }
}