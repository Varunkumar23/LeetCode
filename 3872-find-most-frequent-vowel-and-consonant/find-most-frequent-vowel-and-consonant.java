class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vow=new HashMap<>();
        HashMap<Character,Integer> con=new HashMap<>();
        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                if(vow.containsKey(ch)){
                    vow.put(ch,vow.get(ch)+1);
                }else{
                    vow.put(ch,1);
                }
                }else{
                  if(con.containsKey(ch)){
                    con.put(ch,con.get(ch)+1);
                }else{
                    con.put(ch,1);
                }  
                }
            
        }

        int vmax=0;
        int cmax=0;
        for(Integer val:vow.values()){
            vmax=Math.max(vmax,val);
        }
        for(Integer val:con.values()){
            cmax=Math.max(cmax,val);
        }
        return vmax+cmax;

    }
}