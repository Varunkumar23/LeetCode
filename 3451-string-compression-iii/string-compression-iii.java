class Solution {
    public String compressedString(String word) {
    StringBuilder comp=new StringBuilder();
    int i=0;
    while(i<word.length()){
        int count=0;
        char ch=word.charAt(i);
        while(i<word.length() && word.charAt(i)==ch && count<9){
            i++;
            count++;
        }
        comp.append(count).append(ch);
    }   
    return comp.toString();     
    }

}