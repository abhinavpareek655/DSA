class Solution {
    public String countAndSay(int n) {
        if(n<2) return "1";
        String res = "1";
        for(int i=1;i<n;i++){
            res = rle(res);
        }
        return res;
    }
    public String rle(String input){
        char ch = input.charAt(0);
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(i<input.length()){
            int runLen = 0;
            ch = input.charAt(i);
            while(i<input.length() && input.charAt(i)==ch){
                i++;
                runLen++;
            }
            res.append(runLen);
            res.append(ch);
        }
        return res.toString();
    }
}