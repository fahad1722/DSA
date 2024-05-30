class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
      Arrays.sort(nums);
      List<List<Integer>> res = new ArrayList();
      HashSet<List<Integer>> set = new HashSet();
      int n = nums.length;
    
      for(int i = 0; i < n; i++) {
        for(int j = i + 1; j < n; j++) {
          int p1 = j + 1;
          int p2 = n - 1;
          while(p1 < p2) {
            long sum = (long)nums[i] + nums[j] + nums[p1] + nums[p2];
            if(sum == target) {
              List<Integer> temp = new ArrayList<>();
              temp.add(nums[i]);
              temp.add(nums[j]);
              temp.add(nums[p1]);
              temp.add(nums[p2]);
              res.add(temp);
              p1++;
              p2--;
            }
            else if(sum < target) {
              p1++;
            }
            else {
              p2--;
            }
          }
        }
      }
      set.addAll(res);
      return new ArrayList(set);
    }
}