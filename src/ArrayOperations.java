
public class ArrayOperations {

  public void sort(int arr[])
  {
    int n = arr.length;

    if (n == 0) {
      //throw new IllegalArgumentException("Array must not be empty"); // Commented this out as mutation
    }

    for (int i = 0; i < n-1; i++)
    {
      int min_idx = i;
      for (int j = i+1; j < n; j++) 
        if (arr[j] < arr[min_idx]) 
          min_idx = j;

      int temp = arr[min_idx];
      arr[min_idx] = arr[i];
      arr[i] = temp;
    }
  }

  public int binarySearch(int arr[], int l, int r, int x)
  {
    if (r >= l) {
      int mid = l + (r - l) / 2;

      if (arr[mid] == x)
        return mid;

      if (arr[mid] > x)
        return binarySearch(arr, l, mid - 1, x);

      return binarySearch(arr, mid + 1, r, x);
    }
    return -1;
  }

  public boolean membership(int[] A, int key) {
    int index = binarySearch(A, 0, A.length-1, key);
    if (index >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean membershipUnsorted(int[] A, int key) {
    sort(A);
    //System.out.println(Arrays.toString(A));
    //System.out.println(key);
    return membership(A, key);
  }

  public void sortWrong(int arr[])
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

  public int binarySearchWrong(int arr[], int l, int r, int x)
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

  public boolean membershipWrong(int[] A, int key) {
    int index = binarySearchWrong(A, 0, A.length-1, key);
    if (index >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean membershipUnsortedWrong(int[] A, int key) {
    sortWrong(A);
    //System.out.println(Arrays.toString(A));
    //System.out.println(key);
    return membership(A, key);
  }

}
