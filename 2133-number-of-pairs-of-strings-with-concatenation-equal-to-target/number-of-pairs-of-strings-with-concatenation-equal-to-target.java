class Solution {
    public int numOfPairs(String[] nums, String target) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                String ans=nums[i]+nums[j];
            if(i!=j && ans.equals(target)){
                count++;
            }
            }
        }
        return count;
    }
}