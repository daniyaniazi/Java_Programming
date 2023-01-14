class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int n=s1.length();
        int m = baseStr.length();

        HashMap<Character,List<Character>> adjList = new HashMap();

        for(int i=0;i<n;i++){
            char u=s1.charAt(i);
            char v=s2.charAt(i);

            if(!adjList.containsKey(u)){
                adjList.put(u,new ArrayList<>());
            }
            List<Character> listu = adjList.get(u);
            listu.add(v);

            if(!adjList.containsKey(v)){
                adjList.put(v,new ArrayList<>());
            }
            List<Character> listv = adjList.get(v);
            listv.add(u);
        }

        String resStr="";

        for(int i=0;i<m;i++){
            char ch = baseStr.charAt(i);
            int[] visited = new int[26];
            char minChar = dfs(adjList,ch,visited);

            resStr=resStr+minChar;
        }

        return resStr;
    }


    public char dfs(HashMap<Character,List<Character>> adjList ,char current_ch, int[] visited){

        visited[current_ch-'a'] = 1;
        char minChar = current_ch;
        if( adjList.get(current_ch) !=null){
            for(char ch: adjList.get(current_ch)){
                if(visited[ch-'a'] ==0 ){
                    // System.out.println(Math.min(minChar,dfs(adjList,ch,visited)));
                    minChar = (char)  Math.min(minChar,dfs(adjList,ch,visited));
                }
            }
        }
        return minChar;
    }
}