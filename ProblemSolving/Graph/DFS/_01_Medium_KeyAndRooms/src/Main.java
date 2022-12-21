class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        int[] visited = new int[n];
        Arrays.fill(visited,-1);
        dfs(rooms,0,visited);
        for (int i=0;i<visited.length;i++){
            if(visited[i] ==-1) return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms,int room,int[] visited){
        System.out.println("ROOM NO"+room);
        visited[room] = 1;
        for(Integer key: rooms.get(room)){
            if(visited[key]==-1){
                dfs(rooms,key,visited);
            }
        }
    }
}