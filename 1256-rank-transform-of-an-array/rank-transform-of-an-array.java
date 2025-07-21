class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
            int ans=1;
        for(int i=0;i<n;i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i],ans);
            ans=ans+1;
            }
        }
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=map.get(arr[i]);
        }
        return result;
    }
}