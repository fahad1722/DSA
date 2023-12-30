class Solution {
    public boolean makeEqual(String[] words) {
        int n = words.length;
        HashMap<Character, Integer> map = new HashMap();
        for(String s : words) {
            for(char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        for(int i : map.values()) {
            if(i % n != 0) {
                return false;
            }
        }
        return true;
    }
}