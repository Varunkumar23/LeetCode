class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int max=0;
        int ans=0;
        for(int num : map.values()){
            max=Math.max(max,num);
        }
        for(int freq : map.values()){
            if(freq==max){
                ans+=freq;
            }
        }
        return ans;
    }
}