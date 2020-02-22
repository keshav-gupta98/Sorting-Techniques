class QuickSort
{
    public static void main(String[] args) {
        int arr[] = {9,5,-1,2,-4,0,7};
        Quick_Sort(arr,0,arr.length - 1);
        for(int i = 0  ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Quick_Sort(int arr[] , int start , int end)
    {
        if(start < end)
        {
            int pIndex = partition(arr,start,end);
            Quick_Sort(arr, start, pIndex - 1);
            Quick_Sort(arr, pIndex + 1, end);
        }
    }

    public static int partition(int arr[] , int start , int end)
    {
        int pivot = arr[end];
        int pIndex = start;
        for(int i = start ; i < end ; i++)
        {
            if(arr[i] <= pivot)
            {
                swap(arr,i,pIndex);
                pIndex = pIndex + 1;
            }
        }
        swap(arr,pIndex,end);
        return pIndex;
    }

    public static void swap(int arr[] , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}