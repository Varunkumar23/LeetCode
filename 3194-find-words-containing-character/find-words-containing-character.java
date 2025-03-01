class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
            char s=words[i].charAt(j);
            if(s==x){
                list.add(i);
                break;
            }
            }
        }
       return list; 
    }
}