class Solution {
    public void traverseIsland(char grid[][], int i, int j, int visited[][]) {
		if(visited[i][j] != 1) {
			visited[i][j] = 1;
			if(i-1>=0 && grid[i-1][j] == '1') {
			traverseIsland(grid, i-1, j, visited); 
			}
			if(j-1>=0 && grid[i][j-1] == '1') {
			traverseIsland(grid, i, j-1, visited); 
			}
			if(i+1<grid.length && grid[i+1][j] == '1') {
			traverseIsland(grid, i+1, j, visited); 
			}
			if(j+1<grid[0].length && grid[i][j+1] == '1') {
			traverseIsland(grid, i, j+1, visited); 
			}

		}
	}
    public int numIslands(char[][] grid) {
        int res = 0;
		int visited[][] = new int[grid.length][grid[0].length];
		for(int i=0; i<grid.length; i++) {
			for(int j=0; j<grid[0].length; j++) {
				if(grid[i][j]=='1' && visited[i][j] !=1) {
					traverseIsland(grid, i, j, visited);
                    // for(int ii=0; ii<grid.length; ii++) {
			        //     for(int jj=0; jj<grid[0].length; jj++) {
                    //         System.out.print(visited[ii][jj] + " ");
                    //     }
                    //     System.out.println();
                    // }
                    // System.out.println("---------");
                    res++;	
				}
			}
		}
		return res;
    }
}
