package SearchingAlgos;
import java.util.Scanner;
//Recursive approach in binary search//

public class BinarySearch {
	//Method defination //
	int binarySearch(int arr[], int start, int len, int x)
    {
        if (len >= start) {
            int mid = start + (len - start) / 2;
 
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
 
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, start, mid - 1, x);
 
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, len, x);
        }
 
        // We reach here when element is not present
        // in array
        return -1;
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch bs = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x value"); //enter the needed value //
        int x = sc.nextInt(); 
        System.out.println("Enter the size");
        int size =sc.nextInt();
        int arr[] = new int[size]; //Enter the array size//
        System.out.println("Enter the array value");
        for(int i = 0;i<arr.length;i++)
        {
        	arr[i] = sc.nextInt();
        }
        int n = arr.length;
        int result = bs.binarySearch(arr, 0, n - 1, x); // Method calling //
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                               + result);
    }
}

