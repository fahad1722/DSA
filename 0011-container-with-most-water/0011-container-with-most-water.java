class Solution {
    public int maxArea(int[] height) {
      int max = Integer.MIN_VALUE;
      int low = 0, high = height.length - 1;
      while(low < high) {
        int l = Math.min(height[low], height[high]);
        int b = high - low;
        int area = l * b;
        max = Math.max(max, area);
        if(height[low] < height[high]) {
          low++;
        }
        else {
          high--;
        }
      }
      return max;
    }
}