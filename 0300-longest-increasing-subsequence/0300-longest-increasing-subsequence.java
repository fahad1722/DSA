class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list = new ArrayList<>();
        list.add(Integer.MIN_VALUE);
        for (int ele : nums) {
            int index = Collections.binarySearch(list, ele);
            if (index < 0) {
                index = -(index + 1);
            }
            if (index == list.size()) {
                list.add(ele);
            } else {
                list.set(index, ele);
            }
        }
        return list.size() - 1;
    }
}