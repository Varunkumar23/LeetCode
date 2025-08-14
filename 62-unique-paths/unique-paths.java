class Solution {
    public int uniquePaths(int m, int n) {
        int[][] visited=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                visited[i][j]=-1;
            }
        }
        return countWays(0,0,m,n,visited);

        
    }
    public int countWays(int i,int j,int m,int n,int[][] visited){
        if(i==m-1 && j==n-1){
            return 1;
        }else if(i>=m || j>=n){
            return 0;
        }
        if(visited[i][j]!=-1){
            return visited[i][j];
        }
        int w1=countWays(i+1,j,m,n,visited);
        int w2=countWays(i,j+1,m,n,visited);
        visited[i][j] = w1 + w2;
        return visited[i][j];
    }
}