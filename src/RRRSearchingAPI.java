

/**
 * This {@code SearchingAPI} is where I will store all possible useful searching
 * methods, All the methods should be static methods or functions but we'll see
 *
 * @author Darius Becker
 * @author Robert Sedgewick
 * @author Kevin Wayne
 */
public class RRRSearchingAPI {
    /**
     * Returns the index of the specified key in the specified array. older
     * textbook called it rank This does not use recursion
     *
     * @implNote This does not do whatsoever what I thought it did I was
     * thinking of mergeSort. What it does is it takes a sorted array of ints
     * example 1 3 5 7 11 13 17 and a key lets say 11 then it finds an
     * aproxomated median in this case 3 and calles it mid if 11 is smaller than
     * mid'th value of the array in this case 7 the aproxamately the upper half
     * of the array is discarded and same for lower half
     * @param a the array of integers, must be sorted in ascending order
     * @param key the search key
     * @return index of key in array {@code a} if present; {@code -1} otherwise
     * public static int indexOf(int[] a, int key) { //
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;              
            //Finds the median aproxamation
            if (key < a[mid]) {
                hi = mid - 1; 
            } else if (key > a[mid]) {
                lo = mid + 1; 
            } else {
                return mid;
            }
        }
        return -1;
    }
     */
    

}
