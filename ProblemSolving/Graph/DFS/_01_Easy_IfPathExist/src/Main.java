class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        HashMap<Integer,List<Integer>> adj = new HashMap();
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        for(int[] item : edges) {
            int u = item[0];
            int v = item[1];
            if((u==source && v==destination) || (v==source && u==destination)) return true;

            // Adding Adjencency List
            if(!adj.containsKey(u))  adj.put(u,new ArrayList<>());
            List<Integer> listu = adj.get(u);
            listu.add(v);

            if(!adj.containsKey(v)) adj.put(v,new ArrayList<>());
            List<Integer> listv = adj.get(v);
            listv.add(u);
        }

        return dfs(adj,source,destination,visited);
    }

    public boolean dfs(HashMap<Integer,List<Integer>> adj,int source, int destination, int[] visited){
        if(source==destination) return true;

        if(visited[source]==1) return false;

        visited[source]=1;
        for(Integer node: adj.get(source)){

            if(dfs(adj,node,destination,visited)==true) return true;

        }
        return false;
    }
}