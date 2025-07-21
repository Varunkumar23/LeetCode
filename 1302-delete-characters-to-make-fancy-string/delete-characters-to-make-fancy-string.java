class Solution {
    public String makeFancyString(String s) {
        int count=1;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0 || s.charAt(i)!=s.charAt(i-1)){
                count=1;
            }else{
                count++;
            }
            if(count<=2){
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}