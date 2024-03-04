public class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n = tokens.length;
        Arrays.sort(tokens);
        int l = 0;
        int r = n - 1;
        int max = 0;
        int score = 0;
        while(l <= r && l < n && r >= 0){
            if(score == 0 && power < tokens[l]){
                break;
            }
            if(tokens[l] <= power){
                score++;
                max = Math.max(score, max);
                power -= tokens[l];
                l++;
            }
            if (l < n && r >= 0 && score > 0 && power < tokens[l] ){
                power += tokens[r];
                r--;
                score--;

            }

        }


        return max;
    }

}