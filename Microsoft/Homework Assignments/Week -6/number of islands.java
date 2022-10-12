class Solution {
    public int numIslands(char[][] grid) {
        int nr=grid.length;
        int nc=grid[0].length;
        int islandCount=0;
        for(int i=0;i<nr;i++){
            for(int j=0;j<nc;j++){
                if(grid[i][j]=='1'){
                    islandCount++;
                    dfs(grid,i,j);
                }
            }
        }
        return islandCount;
    }
    public void dfs(char grid[][],int i,int j){
        int nr=grid.length;
        int nc=grid[0].length;
        if(i<0 || j<0 || i>=nr || j>=nc || grid[i][j]=='0' ){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
}