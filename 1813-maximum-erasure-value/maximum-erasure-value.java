class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int j=0;
        int maxsum=Integer.MIN_VALUE;
        int sum=0;

        HashSet<Integer> set=new HashSet<>();
        while(j<nums.length){
            if(!set.contains(nums[j])){
                set.add(nums[j]);
                sum+=nums[j];
                maxsum = Math.max(maxsum, sum);
                j++;
            }else{
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
        }
        
        return maxsum;
    }
}