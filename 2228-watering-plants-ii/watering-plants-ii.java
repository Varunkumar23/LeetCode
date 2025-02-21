class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int x=0;
        int y=plants.length-1;
        int count=0;
        int rem1=capacityA;
        int rem2=capacityB;

            while(x<y){
                if(rem1<plants[x]){
                    rem1=capacityA;
                    count++;
                   
                }
                rem1-=plants[x];

                if(rem2<plants[y]){
                    rem2=capacityB;
                    count++;

                }
                rem2-=plants[y];

                
            x++;
            y--;
                }
            if (x == y){
                if (Math.max(rem1, rem2) < plants[x]) {
                count++;
            }
            }
        
        return count;
    }
}
    
