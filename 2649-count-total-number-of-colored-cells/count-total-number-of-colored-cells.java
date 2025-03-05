class Solution {
    public long coloredCells(int n) {
        long ans=1;
        for(int i=1;i<n;i++){
            ans=ans+i*4;
        }
        return ans;
    }
}