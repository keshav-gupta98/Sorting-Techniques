import java.util.*;
class MergeSort
{
    public static void main(String[] args) {
        int arr[] = {9,5,-1,2,-4,0,7};
        Merge_Sort(arr);
        for(int i = 0  ; i < arr.length ; i++)
        {
            System.out.print(arr[i] + " ");
        }
	}
	public static void Merge_Sort(int arr[])
	{
	    if(arr.length<2)
	    {
	        return;
	    }
	    int mid = arr.length/2;
	    int left[] = new int[mid];
	    int right[] = new int[arr.length - mid];
	    for(int i = 0 ; i < mid ; i++)
	    left[i] = arr[i];
	    for(int i = 0 ; i < arr.length - mid ; i++)
	    right[i] = arr[mid + i];
	    Merge_Sort(left);
	    Merge_Sort(right);
	    Merge(left,right,arr);
	}
	public static void Merge(int left[], int right[] , int arr[])
	{
	    int n1 = left.length;
	    int n2 = right.length;
	    int i = 0;
	    int j =0;
	    int k = 0;
	    while( i < n1 && j < n2)
	    {
	        if(left[i] < right[j])
	        {
	            arr[k] = left[i];
	            i++;
	            k++;
	        }
	        else{
	            arr[k] = right[j];
	            k++;
	            j++;
	        }
	    }
	    while( i < n1)
	    {
	        arr[k] = left[i];
	        i++;
	        k++;
	    }
	    while( j < n2)
	    {
	        arr[k] = right[j];
	        j++;
	        k++;
	    }
	}
}