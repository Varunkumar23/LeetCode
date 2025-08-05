class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        int count=0;
        for(int i=0;i<n;i++){
            boolean placed=false;
            for(int j=0;j<n;j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=0;
                    placed=true;
                    break;
                
                }
            }
                if(!placed){
                    count++;
                }
        }
        return count;
    }
}