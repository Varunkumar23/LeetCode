class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set=new HashSet<>();
        int n=candyType.length/2;
        int x=0;
        for(int i=0;i<candyType.length;i++){
                set.add(candyType[i]);
        }
        if(set.size()==n){
            return n;
        }

return Math.min(set.size(),n);
        
    }
}