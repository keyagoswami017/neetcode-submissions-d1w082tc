class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] visited = new boolean[n][m];
        for( int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(Character.compare(grid[i][j],'1') == 0 && !visited[i][j]){
                    bfs(grid,i,j,n,m,visited);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void bfs(char[][] grid, int i, int j, int n, int m, boolean[][] visited){
        Queue<int[]> q = new LinkedList<>();
        int[] delRow = {0,0,1,-1};
        int[] delCol = {1,-1,0,0};
        // Use them if diagonal is also needed
        // int[] delRow = {-1,-1,-1,0,0,1,1,1};
        // int[] delCol = {-1,0,1,-1,1,-1,0,1};
        visited[i][j] = true;
        q.add(new int[]{i,j});
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];

            for(int k = 0; k < 4 ; k++){
                int nRow = row + delRow[k];
                int nCol = col + delCol[k];

                if(nRow >= 0 && nRow < n &&
                   nCol >= 0 && nCol < m &&
                   Character.compare(grid[nRow][nCol],'1') == 0 &&
                   !visited[nRow][nCol]){
                        visited[nRow][nCol] = true;
                        q.add(new int[]{nRow, nCol});
                   }
            }
        }
        
    }
}
