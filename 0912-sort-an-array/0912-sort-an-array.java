
class Solution {

    public int[] sortArray(int[] nums) {

        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    void quickSort(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = arr[low + (high - low) / 2];

        int lt = low;
        int i = low;
        int gt = high;

        while (i <= gt) {

            if (arr[i] < pivot) {

                swap(arr, lt, i);
                lt++;
                i++;

            } else if (arr[i] > pivot) {

                swap(arr, i, gt);
                gt--;

            } else {
                i++;
            }
        }

        quickSort(arr, low, lt - 1);
        quickSort(arr, gt + 1, high);
    }

    void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
