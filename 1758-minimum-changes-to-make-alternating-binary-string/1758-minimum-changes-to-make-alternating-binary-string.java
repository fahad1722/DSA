class Solution {
    public int minOperations(String s) {
        int p1 = 0, p2 = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(i % 2 == 0) {
                if(c == '1') p2++;
                else p1++;
            }
            else {
                if(c == '1') p1++;
                else p2++;
            }
        }
        return Math.min(p1, p2);
    }
}