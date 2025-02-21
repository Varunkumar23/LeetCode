class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int count=0;
        int remwater=capacity;
        for(int i=0;i<plants.length;i++){
                if(remwater>=plants[i]){
                    remwater-=plants[i];
                    count++;
                }else{
                    count+=i*2;
                    remwater = capacity;
                    remwater-=plants[i];
                    count++;

                }
        }
        return count;
        
    }
}