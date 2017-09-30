import java.io.*;
import java.util.*;


public class SelectionSort {
  
  
  public static int getIndexOfMinElement(int[] arr, int startIndex) {
    int minIndex = startIndex;
    for(int i = startIndex + 1; i < arr.length; i++) {
      if (arr[i] < arr[minIndex]) {
        minIndex = i; 
      }
    }
    return minIndex;
  }
  
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
  
  public static void selectionSortIterative(int[] arr) { 
    for (int i = 0; i < arr.length - 1; i++) {
      int minIndex = getIndexOfMinElement(arr, i); 
      swap(arr, i, minIndex);
    }
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
    

    selectionSortIterative(arr);
    
    for (int num : arr) {
      System.out.println(" "+num); 
    }
    
    sc.close();
  }
}
