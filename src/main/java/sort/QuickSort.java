/*
You are given as input an unsorted array of n distinct numbers, where n is a power of 2. 
Give an algorithm that identifies the second-largest number in the array, and that uses at most n+log₂(n)−2 comparisons.

http://stackoverflow.com/questions/9889679/find-second-largest-number-in-array-at-most-nlog%E2%82%82n%E2%88%922-comparisons
*/

package sort;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.Utility;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Dhval
 */
public class QuickSort {
    private static final Logger LOG = LoggerFactory.getLogger(QuickSort.class);
    /*
        Rearranges the array so that A[i] = pivot, A[0..i-1] < pivot > A[i+1..n] 
    */
    static void qPartition(Integer[] A, int pivot, int lo, int hi) {
        
        int len = A.length;
        int sml = -1, mid = -1;
        for(int i = 0; i < len; i++) {
            int element = A[i];
            if (element < pivot) {
                sml++;
                if (sml == mid) {
                    swap(A, ++sml, i);
                    sml++;mid++;
                    continue;
                }
                swap(A, ++sml, i);
                swap(A, ++mid, i);
            } else if (element == pivot) {
                swap(A, ++mid, i); 
            }
        }
        System.out.println(sml + " " + mid);
    }

    static Integer pickPivot(Integer[] A, int lo, int hi) {
        int pivot = A[ThreadLocalRandom.current().nextInt(lo, hi + 1)];
        return pivot;
    }
    
    /*
        Find k small elements in array.
    */
    static void qSort(Integer[] A, int lo, int hi) {
        if (lo >= hi) return;
        int pivot = pickPivot(A, lo, hi);
        int l = lo;
        int h = hi;
        for(int i=lo; i<=hi;) {
            if (A[i] > pivot) {
                Utility.swap(A, i, hi--);
            } else if (A[i] == pivot) {
               i++;
            } else {
                Utility.swap(A, i++, lo++);
            }
            LOG.info("i=" + i + " lo=" + lo + " hi=" + hi + " " + Arrays.toString(array));
        }
        // Sort left
        qSort(A, l, lo-1);
        // Sort right
        qSort(A, hi, h);
    }
    
    static Integer[] array = {7,58,9,3,6,2,9,45,8,23,12,8,3,5,6,1};
    
    static void swap(Integer[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
    
    public static void main(String[] s) {
        System.out.println(Arrays.toString(array));
        qSort(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
    
}
