// Last updated: 8/12/2026, 11:14:04 AM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int totalUsed = 0;
        
        // As long as we have 5 liters, we can trigger an injection
        while (mainTank >= 5) {
            mainTank -= 5;
            totalUsed += 5;
            
            // Check if there is fuel in the additional tank to transfer
            if (additionalTank >= 1) {
                additionalTank--;
                mainTank += 1;
            }
        }
        
        // Add the remaining fuel that didn't reach a full 5-liter threshold
        totalUsed += mainTank;
        
        return totalUsed * 10;
    }
}