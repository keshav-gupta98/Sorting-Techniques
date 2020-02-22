import java.util.*;
class RadixSort
{
    public static void main(String[] args) {
        int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
        int n = arr.length;
        Radix_Sort(arr,n);
        for(int i = 0  ; i < n ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void Radix_Sort(int arr[], int n)
    {
        int max = MaxInArray(arr,n);
        for(int i = 1 ; max/i > 0; i=i*10)
        {
            CountSort(arr,n,i);
        }
    }
    public static void CountSort(int arr[], int n , int d)
    {
        int count[] = new int[10];
        int out[] = new int[n];
        for(int i = 0 ; i < n ; i++)
        {
            count[(arr[i]/d)%10]++;
        }
        for(int i= 1 ; i < 10 ; i++)
        count[i] = count[i] + count[i-1];
        for(int i = n-1 ; i>=0 ; i--)
        {
            count[(arr[i]/d)%10]--;
            out[count[(arr[i]/d)%10]] = arr[i];
        }
        for(int i= 0; i< n ; i++)
        {
            arr[i] = out[i];
        }
    }
    public static int MaxInArray(int arr[] , int n)
    {
        int max = arr[0];
        for(int i= 1 ; i < n ; i++)
        {
            if(max < arr[i])
            max = arr[i];
        }
        return max;
    }
}