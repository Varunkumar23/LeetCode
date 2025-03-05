class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int minvalue=Integer.MAX_VALUE;
        int maxvalue=Integer.MIN_VALUE;

        for(int num : nums){
            minvalue=Math.min(minvalue,num);
            maxvalue=Math.max(maxvalue,num);
        }
        int min=minvalue+k;
        int max=maxvalue-k;

        return Math.max(0,max-min);
        
    }
}