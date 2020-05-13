import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayOperations ap = new ArrayOperations();
        Random random = new Random();
        int size = 20;
        int[] a = new int[size];
        int[] halfSorted = new int[size];
        int[] reversed = new int[size];
        int key = random.nextInt(size);;
        int key1 = 1;
        int key2 = 10;
        int key3 = 20;
    
/*         //Random Testing
        for (int i = 0; i < 20; i++) {
          a[i] = random.nextInt(50);
        }
    
        System.out.println(ap.membershipUnsortedWrong(a, key));
        System.out.println(ap.membershipUnsorted(a,key)); */
    

        /*
        Pair-wise Testing
        key1 and sorted are the defaults
        key2 and backwards are typical #1
        key3 and half-sorted are typical #3
        
        */

        for (int i = 0; i < reversed.length; i++) {
          a[i] = i;
          halfSorted[i] = i;
          reversed[reversed.length-1-i] = i;
        }
        
        shuffleArray(halfSorted);
        Arrays.sort (halfSorted, 0, a.length/2); 
        
        /* System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(reversed));
        System.out.println(Arrays.toString(halfSorted)); */
      
        //Test-case 1: (sorted, 1)       [0-wise]
        System.out.println(ap.membershipUnsorted(a,key1));
        System.out.println(ap.membershipUnsortedWrong(a,key1));
        System.out.println("1");

        //Test-case 2: (sorted, 10)      [1-wise]
        System.out.println(ap.membershipUnsorted(a,key2));
        System.out.println(ap.membershipUnsortedWrong(a,key2));
        System.out.println("2");
    
        //Test-case 3: (sorted, 20)      [1-wise]
        System.out.println(ap.membershipUnsorted(a,key3));
        System.out.println(ap.membershipUnsortedWrong(a,key3));
        System.out.println("3");
    
        //Test-case 4: (backwards, 1)    [1-wise]
        System.out.println(ap.membershipUnsorted(reversed,key1));
        System.out.println(ap.membershipUnsortedWrong(reversed,key1));
        System.out.println("4");

        //Test-case 5: (half-sorted, 1)  [1-wise]
        System.out.println(ap.membershipUnsorted(halfSorted,key1));
        System.out.println(ap.membershipUnsortedWrong(halfSorted,key1));
        System.out.println("5");
    
        //Test-case 6: (backwards, 10)   [2-wise]
        System.out.println(ap.membershipUnsorted(reversed,key2));
        System.out.println(ap.membershipUnsortedWrong(reversed,key2));
        System.out.println("6");

        //Test-case 7: (backwards, 20)   [2-wise]
        System.out.println(ap.membershipUnsorted(reversed,key3));
        System.out.println(ap.membershipUnsortedWrong(reversed,key3));
        System.out.println("7");

        //Test-case 8: (half-sorted, 10) [2-wise]
        System.out.println(ap.membershipUnsorted(halfSorted,key2));
        System.out.println(ap.membershipUnsortedWrong(halfSorted,key2));
        System.out.println("8");

        //Test-case 9: (half-sorted, 20) [2-wise]
        System.out.println(ap.membershipUnsorted(halfSorted,key3));
        System.out.println(ap.membershipUnsortedWrong(halfSorted,key3));
        System.out.println("9");

      }
      
      public static void shuffleArray(int[] a) {
        int n = a.length;
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < n; i++) {
            int change = i + random.nextInt(n - i);
            swap(a, i, change);
        }
    }

    private static void swap(int[] a, int i, int change) {
        int helper = a[i];
        a[i] = a[change];
        a[change] = helper;
    }
}