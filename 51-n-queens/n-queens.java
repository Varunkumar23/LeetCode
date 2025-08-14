class Solution {
    public List<List<String>> solveNQueens(int n) {
         List<List<String>> result=new ArrayList<>();
         char[][] board=new char[n][n];
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';        
                }
         }
         backtrack(result,board,0);
         return result;
        
        
    }

    public void backtrack(List<List<String>> result,char[][] board,int row){
        if(row==board.length){
        List<String> ans = new ArrayList<>();
        for(char[] r : board){
          ans.add(new String(r)); 
        }
        result.add(ans);
        return;

        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                backtrack(result,board,row+1);
                board[row][j]='.';

            }
        }
    }

    public boolean isSafe(char[][] board,int row,int col){
        //vertical
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //left Diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;

    }
}