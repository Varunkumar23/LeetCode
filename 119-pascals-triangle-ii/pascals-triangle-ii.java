class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        result.add(ans);
        for(int i=1;i<=rowIndex;i++){
            ans=new ArrayList<>();
            ans.add(1);
            for(int j=1;j<i;j++){
                int val=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                ans.add(val);
            }
            ans.add(1);
            result.add(ans);
        }
        return result.get(rowIndex);

        
    }
}