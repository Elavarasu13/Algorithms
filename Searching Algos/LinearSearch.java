package SearchingAlgos;

import java.util.Scanner;


public class LinearSearch
{
	public static void main(String args[])
	{
		LinearSearch ls =  new LinearSearch();
		Scanner sc =  new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size  = sc.nextInt();
		int arr[] =  new int[size];
		System.out.println("Enter the values of an array");
		for(int i= 0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
	   System.out.println("Enter the needed value");
	   int a = sc.nextInt();
	   
	   int result  =  ls.linearSearch(arr,a);
	   if (result == -1)
           System.out.println("Element not present");
       else
           System.out.println("Element found at index "
                              + result);
	}

	private int linearSearch(int[] arr, int a)
	{
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i] == a)
				return i;
		}
		
		return -1;
	}
 
	

}
