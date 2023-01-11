class Solution {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {

        HashMap<Integer,List<Integer>> adj = new HashMap();

        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];

            if(!adj.containsKey(u)){
                adj.put(u,new ArrayList<>());
            }
            List<Integer> listu = adj.get(u);
            listu.add(v);

            if(!adj.containsKey(v)){
                adj.put(v,new ArrayList<>());
            }
            List<Integer> listv = adj.get(v);
            listv.add(u);

        }
        return dfs(adj,0,-1,hasApple);

    }
    public int dfs(HashMap<Integer,List<Integer>> adj,int current, int parent, List<Boolean>  hasApple){
        int time=0;

        for(int child:adj.get(current)){
            if(parent==child) continue;

            int childTime = dfs(adj,child,current,hasApple);
            if(childTime>0|| hasApple.get(child)){
                time =time+  childTime +2;
            }
        }
        return time;
    }
}