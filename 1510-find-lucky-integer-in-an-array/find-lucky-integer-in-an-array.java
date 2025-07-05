class Solution {
    public int findLucky(int[] arr) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int n=arr.length;
       for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
       }
       int ans=-1;
       for(Integer key:map.keySet()){
        if(key==map.get(key)){
            ans=Math.max(ans,key);
        }
       } 
       return ans;
    }
}