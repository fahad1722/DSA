class Solution {
    public static void backtrack(int[] nums, int idx, List<List<Integer>> result) {
        if (idx == nums.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : nums) {
                permutation.add(num);
            }
            result.add(permutation);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums, idx, i);
            backtrack(nums, idx + 1, result);
            swap(nums, idx, i); 
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, result);
        return result;
    }
}