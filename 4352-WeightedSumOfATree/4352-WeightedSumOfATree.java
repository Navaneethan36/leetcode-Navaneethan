// Last updated: 8/12/2026, 11:13:49 AM
class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        ArrayList<Integer>[] tree = new ArrayList[n];

        for(int i=0;i<n;i++)
            tree[i] = new ArrayList<>();
        for(int i=1;i<n;i++)
            tree[parent[i]].add(i);

        int[] depth = new int[n];
        int height = 1;

        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        depth[0]=1;

        while(!q.isEmpty()){
            int u = q.poll();

            for(int v:tree[u]){
                depth[v]=depth[u]+1;
                height=Math.max(height,depth[v]);
                q.add(v);
            }
        }
        long ans = 0;
        for(int i=0;i<n;i++)
            ans += (long)nums[i]*(height-depth[i]+1);

        return ans;
            
            }
        }
    
