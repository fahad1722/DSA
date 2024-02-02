class Solution {
    public void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] cnt = new int[10];
        int[] output = new int[n];

        for (int i = 0; i < n; i++) {
            cnt[(arr[i] / exp) % 10]++;
        }
        
        for (int i = 1; i < 10; i++) {
            cnt[i] += cnt[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            output[cnt[(arr[i] / exp) % 10] - 1] = arr[i];
            cnt[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
     public void radixSort(int[] arr, int n) {
         
        int max = Integer.MIN_VALUE;
         
        for(int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    public void sortColors(int[] arr) {
        int n = arr.length;
        radixSort(arr, n);
    }
}
