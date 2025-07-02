class Solution {
    public int[] transformArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0)
                nums[i] = 0;
            else
                nums[i] = 1;
        }
        quicksort(nums, 0, nums.length - 1);
        return nums;

    }

    public static void quicksort(int arr[], int lowIndex, int highIndex) {
        if (lowIndex >= highIndex)
            return;

        int pivot = arr[highIndex];

        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);

        }
        if (arr[leftPointer] > arr[highIndex]) {
            swap(arr, leftPointer, highIndex);
        } else {
            leftPointer = highIndex;
        }

        quicksort(arr, lowIndex, leftPointer - 1);
        quicksort(arr, leftPointer + 1, highIndex);

    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}