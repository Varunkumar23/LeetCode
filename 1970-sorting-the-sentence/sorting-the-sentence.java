class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        String[] ans=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            char x=arr[i].charAt(arr[i].length()-1);
            String j=Character.toString(x);
            arr[i]=arr[i].replace(j,"");
            int y=(int)x;
            ans[y-49]=arr[i];
            System.out.println(y);
        }
        String k="";
        for(int i=0;i<ans.length;i++){
            k+=ans[i];
            k+=" ";
        }
        return k.trim();
    }
}