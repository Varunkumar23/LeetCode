class Solution {
    public int[] closestPrimes(int left, int right) {
        int[] primes = new int[right + 1];
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 2; i <= right; i++) {
            primes[i] = 1;
        }

        for (int i = 2; i * i <= right; i++) {
            if (primes[i] == 1) {
                for (int j = i * i; j <= right; j += i) {
                    primes[j] = 0;
                }
            }
        }
        for(int k=left;k<=right;k++){
        if(primes[k]==1){
        list.add(k);
        }
        }
        if(list.size()<2) {
            return new int[]{-1, -1};
        }
        int[] ans = {-1,-1};
        int mindiff = Integer.MAX_VALUE;
        int prev=-1;
        for (int i=1;i<list.size();i++) {
        int diff=list.get(i)-list.get(i-1);
        if (diff<mindiff) {
        mindiff=diff;
        ans[0]=list.get(i-1);
        ans[1]=list.get(i);
        }
        }
        // for(int i=left;i<=right;i++){
        //     if(primes[i]==1){
        //         int diff=primes[i+1]
        //     }
        // }


        return ans;

    }
}