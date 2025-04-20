class Solution {
    public int numRabbits(int[] answers) {
        Arrays.sort(answers);
        int result = 0;
        int n = answers.length;
        int i = 0;
        while(i<n){
            if(answers[i]==0){
                result++;
                i++;
                continue;
            }
            if(i+answers[i] < n  && answers[i + answers[i]] == answers[i]){
                result += (answers[i]+1);
                i = answers[i]+i+1;
            }else{
                result += (answers[i]+1);
                int j = i;
                while(j<n && answers[j]==answers[i]){
                    j++;
                }
                i=j;
            }
        }
        return result;
    }
}