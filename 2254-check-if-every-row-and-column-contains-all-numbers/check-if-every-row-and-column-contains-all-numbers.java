class Solution {
    public boolean checkValid(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            HashSet<Integer> row=new HashSet<>();
            HashSet<Integer> col=new HashSet<>();
            for(int j=0;j<n;j++){
                if(!row.add(matrix[i][j])){
                    return false;
                }
                if(!col.add(matrix[j][i])){
                    return false;
                }
            }
        }
        return true;
    }
}