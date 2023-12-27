class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int res[] = new int[n * m];
        HashMap<Integer, List<Integer>> map = new HashMap();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
               if(map.containsKey(i + j)) {
                   List<Integer> list = map.get(i + j);
                   list.add(mat[i][j]);
                   map.put((i + j), list);
               }
                else {
                    List<Integer> list = new ArrayList();
                    list.add(mat[i][j]);
                    map.put((i + j), list);
                }
            }
        }
        int i = 0;
        for(Map.Entry<Integer, List<Integer>> mp : map.entrySet()) {
            List<Integer> temp = mp.getValue();
            if(mp.getKey() % 2 == 0) {
                Collections.reverse(temp);
            }
            for(int num : temp) {
                res[i++] = num;
            }
        }
        return res;
    }
}