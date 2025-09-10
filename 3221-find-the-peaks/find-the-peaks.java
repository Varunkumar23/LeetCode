class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=mountain.length;
        int i=1;
        while(i<n-1){
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]){
                list.add(i);
            }
            i++;
        }
        return list;
        
    }
}