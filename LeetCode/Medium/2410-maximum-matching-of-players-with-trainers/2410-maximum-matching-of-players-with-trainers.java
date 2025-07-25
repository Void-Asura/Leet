class Solution 
{
    public int matchPlayersAndTrainers(int[] players, int[] trainers) 
    {
        //quicksort(players,0,players.length-1);
        //quicksort(trainers,0,trainers.length-1);
        Arrays.sort(players);
        Arrays.sort(trainers);

        int i=0,count=0,j=0;
        while(i<players.length && j<trainers.length)
        {
            if(players[i]<=trainers[j])
            {
                i++;
                j++;
                count++;
            }
            else
            {
                j++;
            }
        }
        return count;
    }

/*
    public static void quicksort(int arr[],int lowIndex , int highIndex)
    {
        if(lowIndex >= highIndex)
        return;

        int pivot=arr[highIndex];
        int leftPointer=lowIndex;
        int rightPointer=highIndex-1;

        while(leftPointer < rightPointer)
        {
            while(leftPointer < rightPointer && arr[leftPointer]<=pivot)
            {
                leftPointer++;
            }
            while(leftPointer < rightPointer && arr[rightPointer]>=pivot)
            {
                rightPointer--;
            }
            swap(arr,leftPointer,rightPointer);
        }
        if(arr[leftPointer]>arr[highIndex])
        {
            swap(arr,leftPointer,highIndex);
        }
        else
        {
            leftPointer=highIndex;
        }
        quicksort(arr,lowIndex,leftPointer-1);
        quicksort(arr,leftPointer+1,highIndex);
    }
    public static void swap(int []arr, int index1, int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
*/
}