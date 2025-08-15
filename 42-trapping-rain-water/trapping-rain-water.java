class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=0;
        int imax=0;
        int jmax=0;

        while(i<j){
            imax=Math.max(imax,height[i]);
            jmax=Math.max(jmax,height[j]);

            if(imax<jmax){
                ans+=imax-height[i];
                i++;
            }else{
                ans+=jmax-height[j];
                j--;
            }
        }
        return ans;
    }
}