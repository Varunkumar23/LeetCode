class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        result.add(ans);
        for(int i=1;i<numRows;i++){
            ans=new ArrayList<>();
            ans.add(1);
            for(int j=1;j<i;j++){
                int val=result.get(i-1).get(j-1)+result.get(i-1).get(j);
                ans.add(val);
            }
            ans.add(1);
            result.add(ans);
        }
        return result;

        
    }
}