class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      int n = matrix.length;
      int m = matrix[0].length;
      int startRow = 0, endRow = n - 1, startCol = 0, endCol = m - 1;
      int direction = 0;
      List<Integer> ans = new ArrayList();
      while(startRow <= endRow && startCol <= endCol) {
        if(direction == 0) {
          for(int i = startCol; i <= endCol; i++) {
            ans.add(matrix[startRow][i]);
          }
          startRow++;
        }
        else if(direction == 1) {
          for(int i = startRow; i <= endRow; i++) {
            ans.add(matrix[i][endCol]);
          }
          endCol--;
        }
        else if(direction == 2) {
          for(int i = endCol; i >= startCol; i--) {
            ans.add(matrix[endRow][i]);
          }
          endRow--;
        }
        else if(direction == 3) {
          for(int i = endRow; i >= startRow; i--) {
            ans.add(matrix[i][startCol]);
          }
          startCol++;
        }
        direction = (direction + 1) % 4;
      }
      return ans;
    }
}
