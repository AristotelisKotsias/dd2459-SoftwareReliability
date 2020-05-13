import java.lang.IllegalArgumentException;
import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {

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
    System.out.println(Arrays.toString(A));
    System.out.println(key);
    return membership(A, key);
  }

  public static void main(String[] args) {
    Random random = new Random();
    int[] a = new int[20];
    int key;

    for (int i = 0; i < 20; i++) {
      a[i] = random.nextInt(50);
    }

    key = random.nextInt(20);
    System.out.println(membershipUnsorted(a,key));

  /*
    Test-case 1: (sorted, 1)       [0-wise]
    System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},1));

    Test-case 2: (sorted, 10)      [1-wise]
    System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},10));

    Test-case 3: (sorted, 20)      [1-wise]
    System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},20));

    Test-case 4: (backwards, 1)    [1-wise]
    Test-case 5: (half-sorted, 1)  [1-wise]

    Test-case 6: (backwards, 10)   [2-wise]
    Test-case 7: (backwards, 20)   [2-wise]
    Test-case 8: (half-sorted, 10) [2-wise]
    Test-case 9: (half-sorted, 20) [2-wise]
   */

  }
}
