class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        HashSet<Integer> set=new HashSet<>();
        int[] ans=new int[2];
        int n=grid[0].length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int num=grid[i][j];
                if(map.containsKey(num)){
                    map.put(num,map.get(num)+1);
                }else{
                    map.put(num,1);
                }
            }
        }
        for(int i=1;i<=n*n;i++){
            set.add(i);
        }
        for(var entry : map.entrySet()) {
            if (entry.getValue()>1) {
                ans[0]=entry.getKey();
                set.remove(entry.getKey());

            }else{
                set.remove(entry.getKey());
            }
        }
        System.out.println(set);
        ans[1] = set.iterator().next();
        return ans;
    }
}




        