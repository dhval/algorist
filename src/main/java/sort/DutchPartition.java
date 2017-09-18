package sort;

import util.Utility;

import java.util.Arrays;

/**
 * Dijkstra's Dutch partition or 3 way partition divides an array into 3 parts such that A[0-k] <= A[k-l] <= A[l-n]
 * It is used by JDK7's quick sort for dealing with duplicate keys.
 *
 * Input a random array with two pivot k<=l. e.g. [2,9,5,0,0,7,7,1,2,3,6] and pivots k=3, l=5
 *
 * Output [2,0,0,2,1, 3,5, 7,7,6,9] elements A[0..4] <= A[5..6] <= A[7..10]
 *
 * Read More :
 * http://permalink.gmane.org/gmane.comp.java.openjdk.core-libs.devel/2628
 * http://java.dzone.com/articles/algorithm-week-quicksort-three
 * http://stackoverflow.com/questions/941447/quicksort-with-3-way-partition
 */
public class DutchPartition {

    private static Integer[] dutchPart(Integer[] A, int piv1, int piv2) {
        // omitted assertions: Array not empty and length >1 and piv1 <= piv2
        int lo = 0;
        int hi = A.length - 1;
        for (int i = 0; i <= hi;) {
            if (A[i] < piv1) {
                Utility.swap(A, i, lo);
                lo++;
                i++;
            } else if (A[i] >= piv1 && A[i] <= piv2) {
                i++;
            } else {
                Utility.swap(A, i, hi);
                hi--;
            }
        }
        return A;
    }


    public static void main(String[] s) {
        Integer[] A = new Integer[]{2,9,5,0,0,7,7,1,2,3,6};
        int pivot1 = 3;
        int pivot2 = 5;
        System.out.println(Arrays.toString(A));
        A = dutchPart(A, pivot1, pivot2);
        System.out.println(Arrays.toString(A));
    }
}
