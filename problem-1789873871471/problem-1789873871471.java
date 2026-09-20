// Last updated: 9/20/2026, 8:41:11 AM
1class Solution {
2    public long countIntersectingIntervals(int[][] intervals) {
3        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
4        PriorityQueue<Integer> pq = new PriorityQueue<>();
5        long count = 0;
6        for(int[] in : intervals){
7            while(!pq.isEmpty()&& pq.peek()<in[0]){
8                pq.poll();
9            }
10            count += pq.size();
11            pq.offer(in[1]);
12        }
13        return count;
14    }
15}