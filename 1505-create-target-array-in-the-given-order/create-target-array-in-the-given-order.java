class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> target = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            target.add(index[i],nums[i]); 
        }
        
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = target.get(i);
        }
        
        return ans;
    }
}
