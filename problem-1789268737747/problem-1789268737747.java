// Last updated: 9/13/2026, 8:35:37 AM
1class Solution {
2    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
3       
4
5        for(int i=0;i<n;i++){
6            int[] temp = new int[n];
7            int k = rowShift[i]%n;
8
9        for(int j=0;j<n;j++){
10            temp[j]=grid[i][(j+k)%n];
11        }
12            grid[i] = temp;
13        }
14        for(int j=0;j<n;j++){
15            int[] temp = new int[n];
16            int k = colShift[j]%n;
17
18        for(int i=0;i<n;i++){
19            temp[i] = grid[(i+k)%n][j];
20        }
21            for(int i=0;i<n;i++){
22                grid[i][j]=temp[i];
23            }
24        }    
25            return grid;
26        }    
27     }
28    
29