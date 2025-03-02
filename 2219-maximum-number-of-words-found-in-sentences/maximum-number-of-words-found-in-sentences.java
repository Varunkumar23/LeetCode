class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        int Maxcount=Integer.MIN_VALUE;

        for(int i=0;i<sentences.length;i++){
               count=sentences[i].split("\\s+").length;
               Maxcount=Math.max(count,Maxcount);         
        }
        return Maxcount;
    }
}