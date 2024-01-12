class Solution {
    public boolean halvesAreAlike(String s) {
        int cnt1 = 0, cnt2 = 0;
        int n = s.length();
        s = s.toLowerCase();
        for (int i = 0; i < n / 2; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt1++;
            }
        }
        for (int i = n / 2; i < n; i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cnt2++;
            }
        }
        return cnt1 == cnt2;
    }
}