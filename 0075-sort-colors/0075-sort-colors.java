class Solution {
    public static void countingSort(int[] arr, int n) {

        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        int[] cnt = new int[max + 1];

        for (int i = 0; i < n; i++) {
            cnt[arr[i]]++;
        }

        for (int i = 1; i <= max; i++) {
            cnt[i] += cnt[i - 1];
        }
        
        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            result[cnt[arr[i]] - 1] = arr[i];
            cnt[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = result[i];
        }
    }
    
    public void sortColors(int[] arr) {
        int n = arr.length;
        countingSort(arr, n);
    }
}
