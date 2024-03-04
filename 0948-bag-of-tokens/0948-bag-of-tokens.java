class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int N = tokens.length;
        int cnt = 0;
        Arrays.sort(tokens);
        int p1 = 0, p2 = N - 1;
        int ans = 0;
        while(p1 <= p2) {
            if(tokens[p1] <= power) {
                power -= tokens[p1];
                cnt++;
                p1++;
            }
            else if(cnt > 0) {
                power += tokens[p2];
                cnt--;
                p2--;
            }
            else{
                p1++;
                p2--;
            }
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
}