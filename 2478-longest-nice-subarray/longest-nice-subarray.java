class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left=0;
        int right=0;
        int bit=0;
        int ans=0;
        while(right<nums.length){
            while(left<right && (bit & nums[right])!=0){
                bit^=nums[left];
                left++;
            }
            bit=bit | nums[right];
            ans=Math.max(ans,right-left+1);
            right++;
        }
        return ans;
        
    }
}