class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int p1 = 0, p2 = 0;
        while(p1<s.length()){
            while(p2 < t.length() && t.charAt(p2) != s.charAt(p1)) p2++;
            if(p2 < t.length()) {
                p1++;
                p2++;
            }
            else {
                return false;
            }
        }
        return p1==s.length();
    }
}