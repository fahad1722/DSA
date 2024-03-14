class Solution {
  public int max(List<Integer> a){
        int n = a.size();
        int dp[] = new int[n + 1];
        dp[0] = a.get(0);
        dp[1] = Math.max(a.get(0), a.get(1));
        for(int i = 2; i < n; i++){
          int include = dp[i-2] + a.get(i);
          int exclude = dp[i-1];
          dp[i] = Math.max(include, exclude);
        }
      return dp[n - 1];
    }
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        
        List<Integer> first = new ArrayList();
        List<Integer> second = new ArrayList();
        for(int i = 0; i < nums.length; i++){
          if(i != nums.length - 1) first.add(nums[i]);
          if(i != 0) second.add(nums[i]);
        }
        return Math.max(max(first), max(second));
    }
}