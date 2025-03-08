class Solution {
    public int minimumRecolors(String blocks, int k) {
        int x=0;
        int y=x+k;
        int mindiff=Integer.MAX_VALUE;
        while(y<=blocks.length()){
                int count=0;
            for(int i=x;i<y;i++){
                if(blocks.charAt(i)=='W'){
                    count++;
                }
            }
                    mindiff=Math.min(count,mindiff);
            x++;
            y++;
        }
        return mindiff;
    }
}