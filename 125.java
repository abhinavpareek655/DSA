class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch: s.toCharArray()){
            int asci = (int)ch;
            if(asci > 96 && asci < 123) sb.append(ch);
            else if(asci > 64 && asci < 91) sb.append((char)(ch+32));
            else if(asci > 47 && asci < 58) sb.append(ch);
        }
        String formatedStr = sb.toString();
        System.out.println(formatedStr);
        int n = formatedStr.length();
        for(int i=0;i<n/2;i++){
            if(formatedStr.charAt(i)!=formatedStr.charAt(n-i-1)) return false;
        }
        return true;
    }
}