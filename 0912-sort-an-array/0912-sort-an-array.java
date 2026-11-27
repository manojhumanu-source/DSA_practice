
import java.util.Random;

class Solution {

    Random random = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    void quickSort(int[] arr, int low, int high) {

        while (low < high) {

            if (high - low < 16) {
                insertionSort(arr, low, high);
                return;
            }

            int pivotIndex = low + random.nextInt(high - low + 1);
            int pivot = arr[pivotIndex];

            int lt = low;
            int i = low;
            int gt = high;

            while (i <= gt) {

                if (arr[i] < pivot) {
                    swap(arr, lt++, i++);
                }
                else if (arr[i] > pivot) {
                    swap(arr, i, gt--);
                }
                else {
                    i++;
                }
            }

            // Process smaller partition first
            if (lt - low < high - gt) {
                quickSort(arr, low, lt - 1);
                low = gt + 1;
            } else {
                quickSort(arr, gt + 1, high);
                high = lt - 1;
            }
        }
    }

    void insertionSort(int[] arr, int low, int high) {

        for (int i = low + 1; i <= high; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= low && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
