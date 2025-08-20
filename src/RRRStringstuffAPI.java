public class RRRStringstuffAPI {
//*******1*********2*********3*********4**********5*********6*********7*********8*********9********

    /**
     * Print contents of 2D array
     *
     * @param arr - 2D array of which contents need to be printed
     * @return String of list of contents of array
     */
    public static String lst2DARRAY(double[][] arr) {
        String contents = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                contents = contents + arr[i][j] + " ";
            }
            contents = contents + "\n";
        }
        return contents;
    }

    /**
     * Print contents of array at the moment it only works with int arrays a
     * useful abstraction to make is to let any data type be available to enter
     *
     * @param arr - 2D array of which contents need to be printed
     * @return String of list of contents of array
     */
    public static String lstTARRAYint(int[] arr) {
        String contents = "";
        for (int i = 0; i < arr.length; i++) {
            contents += arr[i] + " ";
        }
        return contents;
    }

    /**
     * Print contents of array at the moment it only works with int arrays a
     * useful abstraction to make is to let any data type be available to enter
     *
     * @param arr - array of which contents need to be printed
     * @return String of list of contents of array
     */
    public String lstTARRAYString(String[] arr) {
        String contents = "";
        for (int i = 0; i < arr.length; i++) {
            contents += arr[i] + " ";
        }
        return contents;
    }

    /**
     * Print contents of array at the moment it only works with int arrays a
     * useful abstraction to make is to let any data type be available to enter
     *
     * @param arr - 2D array of which contents need to be printed
     * @return String of list of contents of array
     */
    public static String lstTARRAYchar(char[] arr) {
        String contents = "";
        for (int i = 0; i < arr.length; i++) {
            contents += arr[i] + " ";
        }
        return contents;
    }

    /**
     * Converts a integer to binary and displayes it as a string
     * @param nN  Int to be desplayed as binary string
     * @implNote  It's because mod is on when it's not a multiple
     * @return  String representing binary version of int
     */
    public static String ntTOOBinary(int nN) {
        String s = "";
        for (int i = nN; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        return s;
    }

    public void print100Line() {
        System.out.println("");
        for (int i = 0; i < 50; i++) {
            System.out.print("=");
        }
        System.out.println("");

    }

    /**
     * Method to print the order of a priority que for string 
     * manupuation 
     * @param order Comparable array of the priority que 
     * @return The string containing the map of the order
     */
    public String printCode(Comparable[] order) {
    String output = "";
    for (Comparable order1 : order) {
        output = output + "|" + order1 + "";
    }
    return output;
    }

}
