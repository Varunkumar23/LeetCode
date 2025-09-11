class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                list.add(ch);
            }

        }
            Collections.sort(list);
            int idx=0;
            StringBuilder sb=new StringBuilder(s);
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
                    sb.setCharAt(i,list.get(idx));
                    idx++;
                }else{
                    
                }
            }

            return sb.toString();
        
    }
}