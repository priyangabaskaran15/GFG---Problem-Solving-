class Solution {
    public ArrayList<Integer> uniqueSorted(int arr[]) {
        // code here
        HashSet<Integer>set = new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        ArrayList<Integer>list = new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}