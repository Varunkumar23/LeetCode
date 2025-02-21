class Solution {
    public int maxArea(int[] height) {
int maxwater=0;
        int x=0;
        int y=height.length-1;

        while(x<y){
            int w=y-x;
            int ht=Math.min(height[x],height[y]);
            int currwater=w*ht;
            maxwater=Math.max(maxwater,currwater);

            if(height[x]<height[y]){
                x++;
            }else{
                y--;
            }

        }
        return maxwater;


        
    }
}