class Solution {
    public int reverse(int x) {
        int temp=x;
        if(temp < 0) {
            x = -x;
        }
        long rev = 0;
        
        while( x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10; 
       }
      if(rev > Integer.MAX_VALUE) {
            return 0;
      }
      if(temp < 0) {
        rev = -rev;
      }
        return (int)(rev);
    }
}