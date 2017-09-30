import java.io.*;
import java.util.*;

public class TestSorting {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println("Enter array elements");
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(arr));
		SortingAlgo.quickSort(arr, 0, n-1);
		System.out.println(Arrays.toString(arr));
		/*System.out.println(SortingAlgo.partition(arr, 0, n-1, arr[n-1]));
		System.out.println(Arrays.toString(arr));*/
	}
}