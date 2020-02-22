import java.util.*;
class HeapSort
{
    public static void main(String[] args) {
		int arr[] = { 1, 17, 5, 4, 10, 13, 6, 9, 8, 15, 3 };
		heapSort(arr);
		for(int i = 0 ; i< arr.length ; i++)
		System.out.print(arr[i] + " ");
	}
	public static void heapSort(int arr[])
	{
	    int start = arr.length/2 - 1;
	    for(int i = start ; i >= 0 ; i--)
	    {
	        heapify(arr,i,arr.length);
	    }
	    for(int i = arr.length - 1 ; i >= 0 ; i--)
	    {
	        swap(arr,0,i);
	        heapify(arr,0,i);
	    }
	}
	public static void heapify(int arr[] , int i , int n)
	{
	    int l = i*2 + 1;
	    int r = i*2 + 2;
	    int largest = i;
	    if( l < n && arr[l] > arr[largest])
	    largest = l;
	    if( r < n && arr[r] > arr[largest])
	    largest = r;
	    if(largest!=i)
	    {
	        swap(arr,largest,i);
	        heapify(arr,largest,n);
	    }
	}
	public static void swap(int arr[] ,int i , int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
}