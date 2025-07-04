class Solution 
{
    public int heightChecker(int[] heights) 
    {
        int arr[]=heights.clone();
        quicksort(arr,0,arr.length-1);
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=heights[i])
            temp++;
        }
        return temp;
    }
    public static void quicksort(int arr[],int lowIndex, int highIndex)
    {
        if(lowIndex >= highIndex)
        return;

        int pivot=arr[highIndex];

        int leftPointer=lowIndex;
        int rightPointer=highIndex-1;

        while(leftPointer < rightPointer)
        {
            while(leftPointer < rightPointer && arr[leftPointer] <= pivot)
            {
                leftPointer++;
            }
            while(leftPointer < rightPointer && arr[rightPointer] >= pivot)
            {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }
        if(arr[leftPointer] > arr[highIndex])
        {
            swap(arr, leftPointer, highIndex);
        }
        else
        {
            leftPointer=highIndex;
        }

        quicksort(arr,lowIndex, leftPointer -1);
        quicksort(arr, leftPointer +1, highIndex);
    }
    public static void swap(int [] arr, int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}