import java.util.*;
class ShellSort
{
    public static void main(String[] args) {
        int arr[] = {23,29,15,19,31,7,9,5,2};
        int n = arr.length;
        Shell_Sort(arr,n);
        for(int i = 0  ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Shell_Sort(int arr[] ,int n)
    {
        for(int gap = n/2 ; gap >= 1; gap= gap/2)
        {
            int i= 0;
            int j = i + gap;
            while( j <= n-1)
            {
                if(arr[i]> arr[j])
                {
                    swap(i,j,arr);
                    int k = i;
                    while(k - gap >= 0 && arr[k] < arr[k-gap])
                    {
                        swap(k,k-gap,arr);
                        k = k - gap;
                    }
                }
                i++;
                j++;
            }
        }
    }
    public static void swap(int i , int j , int arr[])
    {
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}