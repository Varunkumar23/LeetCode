class Solution {
    public String restoreString(String s, int[] indices) {
        char[] arr=s.toCharArray();
        char[] ans=new char[arr.length];

        for(int i=0;i<indices.length;i++){
            ans[indices[i]]=arr[i];
        }   
        return new String(ans);      
    }
}