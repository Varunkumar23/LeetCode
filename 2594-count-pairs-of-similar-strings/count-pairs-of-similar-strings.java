class Solution {
    public int similarPairs(String[] words) {
        int n=words.length;
        int count=0;
        List<Set<Character>> result=new ArrayList();
        for(String word : words){
            Set<Character> chars=new HashSet<>();
            for (char c : word.toCharArray()) {
                chars.add(c);
            }
            result.add(chars);
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(result.get(i).equals(result.get(j))){
                    count++;
                }

            }
        }
        return count;
    }
}