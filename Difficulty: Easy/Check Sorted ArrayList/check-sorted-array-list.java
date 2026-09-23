class Solution {
    public static boolean isSorted(ArrayList<Integer> arr) {
        // code here
        boolean asc = true;
        boolean des = true;
        
        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                asc = false;
            }
            if(arr.get(i)<arr.get(i+1)){
                des = false;
            }
        }
        return asc||des;
        
    }
}