class Solution {
    
    public int[] plusOne(int[] digits) {
        int N = digits.length;
        for(int i = N - 1; i >= 0; i--) {
            digits[i]++;
            if(digits[i] <= 9) {
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[N + 1];
        digits[0] = 1;
        return digits;
    }
}