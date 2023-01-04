class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int nisland = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    nisland++;
                    bfs(visited, i, j, grid);
                }
            }
        }
        return nisland;
    }
    public void bfs(boolean[][] visited, int start_i, int start_j, char[][] grid) {
        //[i,j] for representation of each point
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.offer(Arrays.asList(start_i, start_j));
        visited[start_i][start_j] = true;

        while (!queue.isEmpty()) {
            List<Integer> cur = queue.poll();
            int i = cur.get(0);
            int j = cur.get(1);
            //bottom neighbor
            if (isValidNeighbor(grid, i + 1, j, visited)) {
                queue.offer(Arrays.asList(i + 1, j));
                visited[i + 1][j] = true;
            }
            //top neighbor
            if (isValidNeighbor(grid, i - 1, j, visited)) {
                queue.offer(Arrays.asList(i - 1, j));
                visited[i - 1][j] = true;
            }
            //right neighbot
            if (isValidNeighbor(grid, i, j + 1, visited)) {
                queue.offer(Arrays.asList(i, j + 1));
                visited[i][j + 1] = true;
            }
            //left neighbor
            if (isValidNeighbor(grid, i, j - 1, visited)) {
                queue.offer(Arrays.asList(i, j - 1));
                visited[i][j - 1] = true;
            }
        }
    }
    //a valid neighbor must:1.inside of bound;2.not visited;3. == '1'
    public boolean isValidNeighbor(char[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] == true || grid[i][j] == '0')
        {
            return false;
        }
        return true;
    }
}