class Solution {
    public void sortColors(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			// Swap the minimum element with the first element of the unsorted sub-array
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
    }
}