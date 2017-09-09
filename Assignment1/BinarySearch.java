import java.io.*;
import java.util.*;

public class BinarySearch {

	/*
	 	"start" is the stating index and "end" is the last index 
		of the array arr.
	*/
	public static int binarySearchRecursive(int[] arr, int key, int start, int end) {
		if (start > end) {
			return -1;
		}

		int mid = end - (end - start)/2; 

		/*
			if arr[mid] is equal to key, we got our element,
			search is over. Return the index i.e. mid
		*/
		if (key == arr[mid] ) {
			return mid;
		}

		/*  
			if key to find is less than the mid element, 
		   	we need to search only from start to mid-1, 
		   	as the array is sorted and elements after 
		   	arr[mid] we definitely be greater than key.

		*/
		else if(key < arr[mid]) {
			return binarySearchRecursive(arr, key, start, mid - 1);
		}

		/*
			if key to find is greater than the mid element, 
		   	we need to search only from mid + 1 to end, 
		   	as the array is sorted and elements before 
		   	arr[mid] we definitely be lesser than key.
		*/
		else {
			return binarySearchRecursive(arr, key, mid + 1, end);
		}
	}


	public static int binarySearchIterative(int[] arr, int key) {
		int start = 0; //first index
		int end = arr.length - 1; // last index

		while(start <= end) {
			int mid = end - (end - start)/2;

			/* 
				if mid element is equal ot key,
				then return mid.
			*/
			if (key == arr[mid]) {
				return mid;
			}

			/*
				if key is less than mid element, 
				it means, we need to search till the 
				index "mid - 1", coz all other elements 
				would be greater than key, as the array is 
				sorted. 
			*/
			else if (key < arr[mid]) {
				end = mid -1;
			}

			/*
				if key is greater than mid element, 
				it means, we need to search from the 
				index "mid + 1", coz all other elements 
				would be lesser than key, as the array is 
				sorted. 
			*/

			else {
				start = mid + 1; 
			}
		}

		/* 
			if didn't find key in above loop, then 
			is sure that key doesn't exist in the array.
		*/
		return -1;
	}



	public static void main(String[] args) {
		System.out.println("Enter the size of Array");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		/*
			n cannot be less than 0, 
			it the user thas given a negative value for n, 
			we will terminate the program. 
		*/
		if (n < 0) {
			System.out.println("Size of array cannot be negative");
			return;
		}


		/*
			taking input from user 
			and storing it into array arr.
		*/
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}


		System.out.println("Enter element to search");
		int key = sc.nextInt();		

		int indexInterative = binarySearchIterative(arr, key);

		// We need starting index(0) and last index of array (arr.length - 1) 
		// for recursive binary seach algorithm.
		int indexRecursive = binarySearchRecursive(arr, key, 0, arr.length - 1); 

		System.out.println("Index found by Iterative Binary Search is : " + indexInterative);
		System.out.println("Index found by Recursive Binary Search is : " + indexRecursive);

		sc.close();
	}
}