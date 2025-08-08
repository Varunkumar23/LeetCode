class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        findSubsets(nums,result,new ArrayList<>(),0);
        return result;

        
        
    }
    public void findSubsets(int[] nums,List<List<Integer>> result,List<Integer> temp,int i){
        // if(i==nums.length){
            result.add(new ArrayList<>(temp));
        //     return;
        // }
        for(int j=i;j<nums.length;j++){
        temp.add(nums[j]);
        findSubsets(nums,result,temp,j+1);
        temp.remove(temp.size()-1);
        // findSubsets(nums,result,temp,i+1);
        }
    }
}