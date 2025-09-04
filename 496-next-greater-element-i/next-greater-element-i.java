class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=nums2.length-1;i>=0;i--){
        while(!s.isEmpty() && nums2[s.peek()]<=nums2[i]){
            s.pop();
        }
        if(s.isEmpty()){
            map.put(nums2[i],-1);
        }else{
            map.put(nums2[i],nums2[s.peek()]);
        }
        s.push(i);
        }
        int[] ans=new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            ans[i]=map.get(nums1[i]);
        }
        return ans;
    }
}