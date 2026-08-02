class Solution {
    static String conRevstr(String s1, String s2) {
        // code here
        String res = s1+s2;
        String rev = "";
        for(int i=res.length()-1;i>=0;i--){
            rev += res.charAt(i);
        }
        return rev;
    }
}