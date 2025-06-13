class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxsum=0;
        for(int i=0;i<nums.length-1;i++){
            int sum=Math.abs(nums[i]-nums[i+1]);
            maxsum=Math.max(sum,maxsum);

        }
        int edgesum=Math.abs(nums[nums.length-1]-nums[0]);

        return Math.max(maxsum,edgesum);
        
    }
}