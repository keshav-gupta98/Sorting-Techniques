import java.util.*;
class BubbleSort
{
    public static void main(String[] args) {
        int arr[] = {9,5,-1,2,-4,0,7};
        for(int i = 0 ; i  < arr.length ; i++)
        {
            boolean flag = true;
            for(int j = 0 ; j < arr.length - 1 ; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    swap (arr,j,j+1);
                    flag = false;
                }
            }
            if(flag == true)
            break;
        }
        for(int i = 0  ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void swap(int arr[] , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}