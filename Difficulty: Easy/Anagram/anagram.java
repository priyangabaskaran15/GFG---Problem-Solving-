class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        String a[] = s1.split("");
        String b[] = s2.split("");
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            return true;
        }
        else{
            return false;
        }
    }
}
