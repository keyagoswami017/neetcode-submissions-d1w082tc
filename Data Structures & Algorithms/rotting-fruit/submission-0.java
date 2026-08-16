class Solution {
    public int orangesRotting(int[][] grid) {
        int unit = 0;
        int n = grid.length;
        int m = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){
                if(grid[i][j] == 2)
                    q.add(new int[] {i,j,0});
            }
        }

        int[] delRow = {0,0,-1,1};
        int[] delCol = {1,-1,0,0};

        while(!q.isEmpty()){
            int[] curr = q.poll();
            int row = curr[0];
            int col = curr[1];
            int count = curr[2];

            unit = Math.max(unit,count);

            for(int i = 0;i < 4; i ++){
                int nRow = row + delRow[i];
                int nCol = col + delCol[i];

                if(nRow >= 0 && nRow < n &&
                   nCol >=0 && nCol < m && grid[nRow][nCol] == 1){
                        grid[nRow][nCol] = 2;
                        q.add(new int[]{nRow, nCol, count + 1});
                   }
                    
            }
        }

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m; j++){
                if(grid[i][j] == 1)
                    return -1;
            }
        }
        return unit;

    }
}
