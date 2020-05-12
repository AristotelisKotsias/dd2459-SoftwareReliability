import java.lang.IllegalArgumentException;
import java.util.Arrays;

public class ArrayOperations {
  public static void main(String[] args) {
    int[] a = new int[]{0, 132, 1024, 402, 1, 1};
    sort(a);
    System.out.println(Arrays.toString(a));

    System.out.println(binarySearch(a, 0, a.length - 1, 132));
  }

  public static void sort(int arr[])
  {
    int n = arr.length;

    if (n == 0) {
      //throw new IllegalArgumentException("Array must not be empty"); // Commented this out as mutation
    }

    // One by one move boundary of unsorted subarray
    for (int i = 0; i < n-1; i++)
    {
      // Find the minimum element in unsorted array
      int min_idx = i;
      for (int j = i+1; j < n; j++) // Changed to ".. j < n-1" in mutation
        if (arr[j] < arr[min_idx]) // Changed to >= in mutation
          min_idx = j;

      // Swap the found minimum element with the first
      // element
      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  public static int binarySearch(int arr[], int l, int r, int x)
  {
    if (r >= l) {
      int mid = l + (r - l) / 2;

      // If the element is present at the
      // middle itself
      if (arr[mid] == x)
        return mid;

      // If element is smaller than mid, then
      // it can only be present in left subarray
      if (arr[mid] > x)
        return binarySearch(arr, l, mid - 1, x);

      // Else the element can only be present
      // in right subarray
      return binarySearch(arr, mid + 1, r, x);
    }

    // We reach here when element is not present
    // in array
    return -1;
  }

  public static boolean membership(int[] A, int key) {
    int index = binarySearch(A, 0, A.length-1, key);
    if (index >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public static boolean membershipUnsorted(int[] A, int key) {
    sort(A);
    return membership(A, key);
  }
}
