//*******1*********2*********3*********4**********5*********6*********7*********8*********9*********
//

public class RRRArrayFunctions {

    /**
     * Will 2 square matrices of real values
     *
     * @implNote I wanted to just print something to work of, and found
     * Sytem.arraycopy or something
     * @implNote So the API of System.arraycopy is (first array, position to
     * start copy from, second array to copy too, position to copy too , Length)
     * @implNote So the strategy is a three times nested loop that using
     * variables that stay the same and change to get the effect
     * @param ar1  first double square matrix
     * @param ar2  second double square matrix
     * @param l  Length of array
     * @return resultand matrix
     * public static double[][] matrixMult(double[][]  ar1, double[][] ar2, int l) {
        double[][] ret = new double[l][l];
        //System.arraycopy(ar1,0,ret,0,l);
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                for (int k = 0; k < l; k++) {
                    //You struggled with this. 
                    //I think you'll get it if you concider that k changes 
                    //the most j changes less than k but more than i
                    ret[i][j] += ar1[i][k] * ar2[k][j];
                }
            }
        }
        return ret;
    }
     */
    

    /**
     * This is a function that fills a array with the index squared integers. It
     * comes from an exercise It comes from Algo exer 1.1.10
     *
     * @implNote answer It does not allocate memory for a[] with new. This code
     * results in a variable a might not have been initialized compile-time
     * error 1.1.10 What is wrong with the following code fragment? int[] a; for
     * (int i = 0; i < 10; i++) a[i] = i * i; 
     * @param a integer arrays
     * @param s size
     */
    public static void fillInts(int[] a, int s) {
        for (int i = 0; i < s; i++) {
            a[i] = i * i;
        }
    }

    /**
     * This is a function that fills a array with the index squared integers. It
     * comes from an exercise It comes from Algo exer 1.1.10
     *
     * @implNote answer It does not allocate memory for a[] with new. This code
     * results in a variable a might not have been initialized compile-time
     * error 1.1.10 What is wrong with the following code fragment? int[] a; for
     * (int i = 0; i < 10; i++) a[i] = i * i; 
     * @param a integer arrays
     * @param s size
     * @return The pointer to the character array
     */
    public  char[] fillchar(char[] a, int s) {
        char[] b = new char[s];

        for (int i = 0; i < s; i++) {
            b[i] = (i + "").charAt(0);
        }
        return b;
    }

    /**
     * This is a function that fills a array with the index squared integers. It
     * comes from an exercise It comes from Algo exer 1.1.10
     *
     * @implNote answer It does not allocate memory for a[] with new. This code
     * results in a variable a might not have been initialized compile-time
     * error 1.1.10 What is wrong with the following code fragment? int[] a; for
     * (int i = 0; i < 10; i++) a[i] = i * i; 
     * @param a integer arrays
     * @return The pointer to the character array
     */
    public  Comparable[] flCompa(Comparable[] a) {
        int s = a.length;
        Comparable[] b = new Comparable[s];

        for (int i = 0; i < s; i++) {
            b[i] = i;
        }
        return b;
    }

    public static void main(String[] args) {
        String[] myArray = {"apple", "banana", "cherry"};

        RRRArrayFunctions instance = new RRRArrayFunctions(); // Create an instance to call non-static methods
        instance.modifyArray(myArray); // Call the method on the instance

        for (String fruit : myArray) {
            System.out.println(fruit);
        }
    }

    public void modifyArray(String[] arr) {
        if (arr.length > 0) {
            arr[0] = "mango";
        }
    }

}
