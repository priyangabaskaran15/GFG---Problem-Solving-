class Solution {
    // function should calculate and return the
    // average of all the non negative integers
    // from the arraylist provided in the
    // parameter
    public static double posAverage(ArrayList<Integer> list) {
        int sum = 0;
        int count = 0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=0){
            sum+=list.get(i);
            count++;
            }
        }
        double res = (double) sum/count;
        return res;
    }
}