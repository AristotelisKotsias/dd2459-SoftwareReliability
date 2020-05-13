import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayOperations ap = new ArrayOperations();
        Random random = new Random();
        int[] a = new int[20];
        int key = random.nextInt(20);;
        int key1 = 1;
        int key2 = 10;
        int key3 = 20;
    
        //Random Testing
        for (int i = 0; i < 20; i++) {
          a[i] = random.nextInt(50);
        }
    
        System.out.println(ap.membershipUnsortedWrong(a, key));
        System.out.println(ap.membershipUnsorted(a,key));
    
        /*
        Pair-wise Testing
        key1 and sorted are the defaults
        key2 and backwards are typical #1
        key3 and half-sorted are typical #3
        
        */
      /*
        Test-case 1: (sorted, 1)       [0-wise]
        System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},1));
    
        Test-case 2: (sorted, 10)      [1-wise]
        System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},10));
    
        Test-case 3: (sorted, 20)      [1-wise]
        System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20},20));
    
        Test-case 4: (backwards, 1)    [1-wise]
        System.out.println(membershipUnsorted({20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1},1));

        Test-case 5: (half-sorted, 1)  [1-wise]
        System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,20,15,11,17,13,12,14,19,16,18},1));
    
        Test-case 6: (backwards, 10)   [2-wise]
        System.out.println(membershipUnsorted({20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1},10));

        Test-case 7: (backwards, 20)   [2-wise]
        System.out.println(membershipUnsorted({20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1},20));

        Test-case 8: (half-sorted, 10) [2-wise]
        System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,20,15,11,17,13,12,14,19,16,18},10));

        Test-case 9: (half-sorted, 20) [2-wise]
        System.out.println(membershipUnsorted({1,2,3,4,5,6,7,8,9,10,20,15,11,17,13,12,14,19,16,18},20));

       */
    
      }
    
}