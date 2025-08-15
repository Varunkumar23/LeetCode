class Solution {
    public String largestGoodInteger(String num) {
        String ans="";
        for(int i=0;i<=num.length()-3;i++){
            String sub=num.substring(i,i+3);

            if(sub.charAt(0)==sub.charAt(1) && sub.charAt(1)==sub.charAt(2)){
                if(ans.equals("") || sub.compareTo(ans)>0){
                    ans=sub;
                }
            }
        }
        return ans;
        
    }
}