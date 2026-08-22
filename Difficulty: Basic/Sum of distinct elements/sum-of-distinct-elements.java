class Solution {
    int findSum(int[] arr) {
        // code here
        int sum = 0;
        HashSet<Integer>set = new HashSet<>();
        for(int i:arr){
            if(set.add(i)){
                 sum += i;
            }
           
        }
        return sum;
    }
}