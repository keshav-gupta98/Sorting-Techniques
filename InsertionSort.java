import java.util.*;
class InsertionSort
{
    public static void main(String[] args) {
        int arr[] = {9,5,-1,2,-4,0,7};
        for(int i = 1; i < arr.length ; i++)
        {
            int value = arr[i];
            int hole = i;
            while(hole > 0 && arr[hole - 1] > value)
            {
                arr[hole] = arr[hole - 1];
                hole = hole - 1;
            }
            arr[hole] = value;
        }
        for(int i = 0  ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}