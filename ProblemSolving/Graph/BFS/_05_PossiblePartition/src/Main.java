class Solution {
    public boolean possibleBipartition(int n, int[][] dislikes) {
        if(n==1) return true;
        HashMap<Integer,List<Integer>> adjecencyHatelList = new HashMap();

        for(int[] item : dislikes) {
            int u = item[0];
            int v = item[1];
            // Adding Adjencency List
            if(!adjecencyHatelList.containsKey(u)){
                adjecencyHatelList.put(u,new ArrayList<>());
            }
            List<Integer> listu = adjecencyHatelList.get(u);
            listu.add(v);

            if(!adjecencyHatelList.containsKey(v)){
                adjecencyHatelList.put(v,new ArrayList<>());
            }
            List<Integer> listv = adjecencyHatelList.get(v);
            listv.add(u);

        }
        for(List<Integer> item : adjecencyHatelList.values()) System.out.println(item);


        int[] colors = new int[n+1];
        Arrays.fill(colors,-1);

        for(int i = 1 ; i<=n ; i++){
            if(colors[i]==-1){
                // NOT TRAVERESED
                if(bfsCheck(adjecencyHatelList,i,colors)==false){
                    return false;
                }
            }
        }

        return true;
    }

    public boolean bfsCheck(HashMap<Integer,List<Integer>> adjList , int node , int[] colors){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(node);
        colors[node]=1;

        while(queue.peek() != null){
            int front = queue.remove();
            if(adjList.get(front) == null){
                continue;
            }
            for(int hateNode: adjList.get(front)){
                if(colors[hateNode] == colors[front] ){
                    return false;
                }
                if(colors[hateNode] == -1){
                    queue.add(hateNode);
                    colors[hateNode] = 1 - colors[front];
                }
            }
        }
        return true;
    }
}