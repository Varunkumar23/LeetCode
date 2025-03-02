class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();

        for(char x : word1.toCharArray()){
            if(map1.containsKey(x)){
                map1.put(x,map1.get(x)+1);
            }else{
                map1.put(x,1);
            }
        }
        for(char y : word2.toCharArray()){
            if(map2.containsKey(y)){
                map2.put(y,map2.get(y)+1);
            }else{
                map2.put(y,1);
            }
        }

        for (char y : map1.keySet()) { 
            if (map2.containsKey(y) && Math.abs(map1.get(y) - map2.get(y))>=4) {
                return false;
            } else if (!map2.containsKey(y) && map1.get(y)>=4) { 
                return false;
            }
        }

        for (char y : map2.keySet()) { 
            if (!map1.containsKey(y) && map2.get(y)>=4) {
                return false;
            }
        }

return true;
        
    }
}