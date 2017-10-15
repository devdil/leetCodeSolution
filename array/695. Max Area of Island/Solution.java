class Solution {
    public  int maxAreaOfIsland(int[][] grid) {
		int maximum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == 1) {
					maximum = Math.max(maximum, exploreIsland(i, j, grid, grid.length, grid[0].length));
				}
			}
		}
		return maximum;
	}

	public static int exploreIsland(int row, int column,int[][] grid, int totalRows, int totalColumns) {
		  
		  if (row < 0 || column > totalColumns-1 || row > totalRows-1 || column < 0) {
			  return 0;
		  }
		  
		  if (grid[row][column] == 0   || grid[row][column] == -1) 
			  return 0;
		  
		  if(grid[row][column] == 1 ) {
			  grid[row][column] = -1;
		  }
		  
		  
		  return 1+exploreIsland(row,column+1,grid,totalRows,totalColumns)+
		  exploreIsland(row,column-1,grid,totalRows,totalColumns) +
		  exploreIsland(row+1,column,grid,totalRows,totalColumns) +
		  exploreIsland(row-1,column,grid,totalRows,totalColumns);
		  
		  
			  
	  }
}
