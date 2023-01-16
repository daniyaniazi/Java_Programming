// Problem  : https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
class Solution {
    // Function to detect cycle in an undirected graph.
    int[] visited;
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        visited= new int[V];
        for(int i=0;i<V;i++){
            if(visited[i]!=1 && DFS(adj, i,-1,visited))
                return true;
        }
        return false;
    }

    public boolean DFS(ArrayList<ArrayList<Integer>> adj , int node ,int parent,int[] visited){
        visited[node]= 1;
        for( int v : adj.get(node)){
            if(v== parent) continue;
            if(visited[v]==1) return  true;
            if(DFS(adj, v,node,visited)==true) return true;
        }
        return false;

    }
}