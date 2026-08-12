// Last updated: 8/12/2026, 11:14:45 AM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = numBottles;
        int emptyBottles = numBottles;

        while (emptyBottles >= numExchange) {
            // How many new full bottles we get
            int newBottles = emptyBottles / numExchange;
            
            // Add to total count
            totalDrunk += newBottles;
            
            // New empty bottles = the ones we just drank + the leftovers
            emptyBottles = newBottles + (emptyBottles % numExchange);
        }

        return totalDrunk;
    }
}