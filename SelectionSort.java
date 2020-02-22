import java.util.*;
class SelectionSort
{
    public static void main(String[] args) {
        int arr[] = {9,5,-1,2,-4,0,7};
        for(int i = 0; i< arr.length -1 ; i++)
        {
            int min = i;
            for(int j = i+1 ; j < arr.length ; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            swap(arr,min,i);
        }
        for(int i = 0  ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int arr[] ,int min , int i)
    {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}