class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int count=0;
        String[] arr=text.split(" ");
        for(int i=0;i<arr.length;i++){
            for(char c:brokenLetters.toCharArray()){
                if(arr[i].indexOf(c)!=-1){
                    count++;
                    break;
                }
            }
        }
        return arr.length-count;
    }
}