class Solution {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        String point = "0,0";
        HashSet<String> set = new HashSet();
        set.add(point);
        
        for(char c : path.toCharArray()) {
            if(c == 'N') y++;
            if(c == 'S') y--;
            if(c == 'E') x++;
            if(c == 'W') x--;
            
            String temp = x + "," + y;
            if(set.contains(temp)) {
                return true;
            }
            set.add(temp);
        }
        return false;
    }
}