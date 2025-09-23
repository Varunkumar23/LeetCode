class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int revint=0;
        while(x>0){
        int digit=x%10;
        revint=revint*10+digit;
        x/=10;
        }
        if(revint==n){
            return true;
        }
        return false;
    }
}