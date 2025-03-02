class Solution {
    public String reversePrefix(String word, char ch) {
        int x=0;
        int y=word.indexOf(ch);
        if(y==-1){
            return word;
        }

        char[] arr = word.toCharArray(); 
        while(x<y){
            char temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;
            x++;
            y--;
        }
        return new String(arr);
    }
}