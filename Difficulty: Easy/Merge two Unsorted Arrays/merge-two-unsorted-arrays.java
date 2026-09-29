class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        // code here
        int newarr[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            newarr[i] = a[i];
        }
        for(int i=0;i<b.length;i++){
            newarr[a.length+i] = b[i];
        }
        Arrays.sort(newarr);
        return newarr;
    }
}