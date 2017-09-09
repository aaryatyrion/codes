import java.io.*;
import java.util.*;

public class LinearSearch {

	/*
		Linear search algorithm based on Iteration, 
		assuming that the arr is not null.
	*/
	public static int linearSearchIterative(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++ ) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	/*
		Linear search algorithm based on Recursion, 
		assuming that the arr is not null.
	*/
	public static int linearSearchRecursive (int[] arr, int key, int indexToSearch) {
		// terminating condition
		if (indexToSearch >= arr.length) {
			return -1;
		}

		// Processing 
		if (arr[indexToSearch] == key) {
			return indexToSearch;
		}
		
		// this method calling itself (Recursion)
		return linearSearchRecursive(arr, key, indexToSearch + 1);
		
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

		int indexInterative = linearSearchIterative(arr, key);
		int indexRecursive = linearSearchRecursive(arr, key, 0); // passing starting index 0, as the third argument

		System.out.println("Index found by Iterative Linear Search is : " + indexInterative);
		System.out.println("Index found by Recursive Linear Search is : " + indexRecursive);

		sc.close();

	}
}