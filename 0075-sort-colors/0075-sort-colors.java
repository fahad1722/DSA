class Solution {
    public void merge(int arr[], int low, int mid, int high) {
        int p1 = low;
        int p2 = mid + 1;
        int k = 0;
        int temp[] = new int[high - low + 1];
        while (p1 <= mid && p2 <= high) {
            if (arr[p1] < arr[p2]) {
                temp[k++] = arr[p1++];
            } 
            else {
                temp[k++] = arr[p2++];
            }
        }
        while (p1 <= mid) {
            temp[k++] = arr[p1++];
        }
        while (p2 <= high) {
            temp[k++] = arr[p2++];
        }
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public void mergeSort(int arr[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }
    public void sortColors(int[] arr) {
        int n = arr.length;
        mergeSort(arr, 0, n - 1);
    }
}