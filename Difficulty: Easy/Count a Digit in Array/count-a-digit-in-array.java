class Solution {
    public static int countDigitK(int k, int arr[]) {
        // code here
        int count = 0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
                int mod = arr[i] % 10;
                if(mod == k){
                    count +=1;
                }
                arr[i] /= 10;
            }
        }
        return count;
        
    }
}