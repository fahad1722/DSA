class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }
        
        StringBuilder sb[] = new StringBuilder[numRows];
        
        for(int i = 0; i < numRows; i++) {
            sb[i] = new StringBuilder();
        }
        
        boolean flag = false;
        int i = 0;
        for(char c : s.toCharArray()) {
            sb[i].append(c);
            if(i == 0 || i == numRows - 1) {
                flag = !flag;
            }
            i += flag ? 1 : -1;
        }
        
        StringBuilder res = new StringBuilder();
        for(StringBuilder temp : sb) {
            res.append(temp);
        }
        return res.toString();
    }
}