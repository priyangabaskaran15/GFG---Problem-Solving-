class Solution {
    public int reverseDigits(int n) {
        // Code here
        int rev = 0;
        while(n>0){
            int mod = n % 10;
            if(mod!=0){
                rev = rev*10+mod;
            }
            n/=10;
        }
        return rev;
    }
}