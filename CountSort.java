import java.util.*;
class CountSort
{
    public static void main(String[] args) {
        int arr[] = {2,1,1,0,2,5,4,0,2,8,7,7,9,2,0,1,9};
        Count_sort(arr,arr.length);
        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void Count_sort(int arr[],int n)
    {
        int max = MaxInArray(arr,n);
        int count[] = new int[max+1];
        int out[] = new int[n];
        for(int i= 0 ; i < n ; i++)
        {
            count[arr[i]]++;
        }
        for(int i = 1 ; i <= max ; i++)
        {
            count[i] = count[i] + count[i - 1];
        }
        for(int i = n-1 ; i >= 0 ; i--)
        {
            count[arr[i]] = count[arr[i]] - 1;
            out[count[arr[i]]] = arr[i];
        }
        for(int i= 0 ; i < n ; i++)
        {
            arr[i] = out[i];
        }
    }
    public static int MaxInArray(int arr[] , int n)
    {
        int max = arr[0];
        for(int i = 1 ; i < n ; i++)
        {
            if(arr[i] > max)
            max = arr[i];
        }
        return max;
    }
}