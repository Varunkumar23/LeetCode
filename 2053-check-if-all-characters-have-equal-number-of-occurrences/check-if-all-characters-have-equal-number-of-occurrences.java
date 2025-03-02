class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(char x : s.toCharArray()){
            if(map.containsKey(x)){
                map.put(x,map.get(x)+1);
            }else{
                map.put(x,1);
            }
        }

        int count=map.get(s.charAt(0));
        for(int num : map.values()){
if(num!=count){
    return false;

}
        }    

        return true;
    }
}