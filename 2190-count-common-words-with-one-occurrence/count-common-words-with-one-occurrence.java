class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        int count=0;
        for(int i=0;i<words1.length;i++){
            String x=words1[i];
            if(map1.containsKey(x)){
                map1.put(x,map1.get(x)+1);
            }else{
                map1.put(x,1);
            }
        }
        for(int i=0;i<words2.length;i++){
            String y=words2[i];
            if(map2.containsKey(y)){
                map2.put(y,map2.get(y)+1);
            }else{
                map2.put(y,1);
            }
        }

        for(String z : map1.keySet()){
            if(map2.containsKey(z) && (map1.get(z)==1 && map2.get(z)==1)){
                count++;
            }
        }

        return count;
    }
}