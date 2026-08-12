// Last updated: 8/12/2026, 11:14:09 AM
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime+delayedTime)%24;
    }
}