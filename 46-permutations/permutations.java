class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutations(nums, result, new ArrayList<>());
        return result;
        
    }
    public void permutations(int[] nums,List<List<Integer>> result,List<Integer> temp){
        if(temp.size()==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(temp.contains(x)) continue;
            temp.add(x);
            permutations(nums,result,temp);
            temp.remove(temp.size()-1);


        }

    }

}