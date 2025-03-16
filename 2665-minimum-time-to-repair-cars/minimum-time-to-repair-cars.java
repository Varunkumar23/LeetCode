class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low=1;
        long high=(long) 1e14;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            long repair=0;
            for(int r : ranks){
            repair+=(long) Math.sqrt(mid/r);

            }
            if(repair>=cars){
                high=mid-1;
                ans=mid;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
}