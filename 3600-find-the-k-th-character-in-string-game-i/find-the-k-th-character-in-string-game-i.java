class Solution {
    public char kthCharacter(int k) {
        String res="a";
        while(res.length()<k){
            StringBuilder next=new StringBuilder();
            for(int i=0;i<res.length();i++){
                char c=res.charAt(i);
                char nextchar=(char)((c-'a'+1)%26+'a');
                next.append(nextchar);
            }
            res+=next.toString();

        }
        return res.charAt(k-1);
    }
}