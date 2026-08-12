// Last updated: 8/12/2026, 11:17:07 AM
import java.util.HashSet;
import java.util.Set;

public class Solution {
    private int count = 0;
    private final Set<Integer> occupiedCols = new HashSet<>();
    private final Set<Integer> occupiedDiag1 = new HashSet<>(); 
    private final Set<Integer> occupiedDiag2 = new HashSet<>(); 

    public int totalNQueens(int n) {
        backtrack(0, n);
        return count;
    }

    private void backtrack(int row, int n) {
        if (row == n) {
            count++;
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row + col;
            int d2 = row - col;

            if (occupiedCols.contains(col) || 
                occupiedDiag1.contains(d1) || 
                occupiedDiag2.contains(d2)) {
                continue; 
            }

            occupiedCols.add(col);
            occupiedDiag1.add(d1);
            occupiedDiag2.add(d2);

            backtrack(row + 1, n);

            occupiedCols.remove(col);
            occupiedDiag1.remove(d1);
            occupiedDiag2.remove(d2);
        }
    }
}