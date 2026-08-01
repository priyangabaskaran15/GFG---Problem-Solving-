class Solution {
    public static boolean areAnagrams(String s1, String s2) {
        // code here
        String s11[] = s1.split("");
        String s22[] = s2.split("");
        Arrays.sort(s11);
        Arrays.sort(s22);
        if(Arrays.equals(s11,s22)){
            return true;
        }
        else{
            return false;
        }
    }
}