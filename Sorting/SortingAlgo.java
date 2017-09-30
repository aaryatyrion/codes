import java.io.*;
import java.util.*;

public class SortingAlgo {

	public static void mergeSort(int[] arr, int start, int end) {
		if (start < end) {
			int mid = start + (end - start)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid + 1, end);
			
			System.out.println(Arrays.toString(arr));
			System.out.println("Merging index : " + "[" + start + "] " + " [" + mid + "] " + " [" + end + "] " );
			merge(arr, start, mid, end);
			System.out.println(Arrays.toString(arr) + "\n\n");
		}
	}

	public static void merge(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;

		int[] arr1 = new int[n1];
		int[] arr2 = new int[n2];

		for (int i = 0; i < n1 ; i++ ) {
			arr1[i] = arr[start + i];
		}
		// System.out.println(Arrays.toString(arr1));

		for (int i = 0; i < n2 ; i++ ) {
			arr2[i] = arr[mid + 1 + i];
		}
		// System.out.println(Arrays.toString(arr2));

		int i = 0;
		int j = 0;
		int k = start; 

		while (i < n1 && j < n2) {
			if (arr1[i] <= arr2[j]) {
				arr[k++] = arr1[i++];
			}
			else {
				arr[k++] = arr2[j++];
			}
		}

		if (i < n1) {
			while (i < n1) {
				arr[k++] = arr1[i++];
			}
		}
		else if (j < n2) {
			while (j < n2) {
				arr[k++] = arr2[j++];
			}
		}

 	}


 	public static void quickSort(int[] arr, int start, int end) {
 		if (start < end) {
 			int p = partition(arr, start, end, arr[end]);
 			quickSort(arr, start, p-1);
 			quickSort(arr, p+1, end);
 		}
 	}

 	public static int partition(int[] arr, int start, int end, int key) {
 		int low = start;
 		int mid = start;
 		int high = end;

 		while (mid <= high) {
 			if (arr[mid] < key) {
 				swap(arr, low, mid);
 				low++;
 				mid++;
 			}
 			else if (arr[mid] == key) {
 				mid++;
 			}
 			else {
 				swap(arr, mid, high);
 				high--;
 			}
 		}
 		return mid-1;
 	}

 	public static void swap (int[] arr, int i, int j) {
 		int temp = arr[i];
 		arr[i] = arr[j];
 		arr[j] = temp;
 	}

}