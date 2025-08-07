class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        findSubsets(nums,result,new ArrayList<>(),0);
        return result;

        
        
    }
    public void findSubsets(int[] nums,List<List<Integer>> result,List<Integer> temp,int i){
        if(i==nums.length){
            result.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        findSubsets(nums,result,temp,i+1);
        temp.remove(temp.size()-1);
        findSubsets(nums,result,temp,i+1);
    }
}