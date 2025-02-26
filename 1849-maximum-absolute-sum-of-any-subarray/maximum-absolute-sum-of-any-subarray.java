class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int minsum=Integer.MAX_VALUE;
        int cs1=0;
        int cs2=0;
        for(int i=0;i<nums.length;i++){
            cs1+=nums[i];
            if(cs1<0){
                cs1=0;
            }
            maxsum=Math.max(maxsum,cs1);
        }
        for(int i=0;i<nums.length;i++){
            cs2+=nums[i];
            if(cs2>0){
                cs2=0;
            }
            minsum=Math.min(minsum,cs2);
        }

        return Math.max(maxsum, Math.abs(minsum));
    }
}