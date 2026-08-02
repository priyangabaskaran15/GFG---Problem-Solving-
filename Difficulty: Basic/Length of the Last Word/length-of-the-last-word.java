class Solution {
    public int lastWordLen(String s) {
        // code here
        String arr[] = s.split(" ");
        String res = arr[arr.length-1];
        return res.length();
    }
}