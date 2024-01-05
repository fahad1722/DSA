class Solution {
    public int romanToInt(String s) {
      HashMap<Character, Integer> map = new HashMap();
      map.put('I', 1);
      map.put('V', 5);
      map.put('X', 10);
      map.put('L', 50);
      map.put('C', 100);
      map.put('D', 500);
      map.put('M', 1000);
      int n = s.length();
      int res = 0;
      for(int i = 0; i < n; i++) {
        int p1 = map.get(s.charAt(i));
        int p2 = (i + 1 < n) ? map.get(s.charAt(i + 1)) : 0;
        if(p1 < p2) {
          res -= p1;
        }
        else {
          res += p1;
        }
      }
    return res;
    }
}