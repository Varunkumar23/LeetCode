class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }

        for (var entry : map.entrySet()) {
        int key = entry.getKey();
        int value = entry.getValue();
    
    if (value==1 && !map.containsKey(key-1) && !map.containsKey(key+1)) {
        list.add(key);
    }
}
return list;   
    }
}