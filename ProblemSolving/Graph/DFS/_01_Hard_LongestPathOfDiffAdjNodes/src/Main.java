class Solution {
    private int result=0;
    public int longestPath(int[] parent, String s) {
        int n=parent.length;
        if(n==1) return 1;
        HashMap<Integer,List<Integer>> adjList = new HashMap();

        for(int i=1;i<n;i++){
            int u=i;
            int v=parent[i];

            if(!adjList.containsKey(u)){
                adjList.put(u,new ArrayList<>());
            }
            List<Integer> listu = adjList.get(u);
            listu.add(v);

            if(!adjList.containsKey(v)){
                adjList.put(v,new ArrayList<>());
            }
            List<Integer> listv = adjList.get(v);
            listv.add(u);
        }

        dfs(adjList,0,-1,s);
        return result;
    }

    public int dfs(HashMap<Integer,List<Integer>> adjList , int current , int parent, String s){
        int longest=0;
        int second_longest=0;

        for (int child : adjList.get(current)) {
            if (child == parent) {
                continue;
            }
            int child_longest_length =  dfs(adjList,child,current,s);

            if (s.charAt(child) == s.charAt(current)) continue;
            if(child_longest_length>second_longest){
                second_longest =child_longest_length;

            }
            if(second_longest>longest){
                int temp = longest;
                longest = second_longest;
                second_longest = temp;
            }



        }
        int betterMax = Math.max(longest,second_longest)+1;
        int onlyRootMax = 1;
        int subTreeIsMax = longest + second_longest +1;

        result = Math.max(Math.max(betterMax,Math.max(result,onlyRootMax)),subTreeIsMax);

        return Math.max(betterMax,onlyRootMax);
    }
}