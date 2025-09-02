
public class RRRSortingAPI {
    private int p1nSwapsMin;
    private int p2nSwapsMax;
    private int p3sblenMin;
    private int p4sbLenMax;
    private int p5jmpMin;
    private int p6jmpMax;
    private int p7strLength;
    private String p8QP;

    public void testAATTCC() {
        p5jmpMin = 1;
        p6jmpMax = 6;
    }
    public void testGCGACA() {
        p5jmpMin = 1;
        p6jmpMax = 5;
    }
    public void testTTAGAAA(){
        p5jmpMin = 1;
        p6jmpMax = 5;
    }
    public void testSH4(){
        p5jmpMin = 1;
        p6jmpMax = 1;
    }
    public void testSpecial(){
        p5jmpMin = 2;
        p6jmpMax = 7;
    }
    public void testSH5(){
        p5jmpMin = 1;
        p6jmpMax = 6;
    }

    

    /**
     * Equality condition for comparables
     * @param v first comparable
     * @param w second comparable
     * @return True if equal. False if not equal
     */
    public boolean cEqual(Comparable v, Comparable w) {
        return v.compareTo(w) == 0;        
    }

    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void stExch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public int getP2(String lne, char pop, int j, int i, int mx) {
    int p2 = lne.lastIndexOf(pop);
    RRRMathAPI mapi = new RRRMathAPI();
        if(Math.abs(p2 - i) > mx) {
            p2 = mapi.MinClamp(lne.lastIndexOf(pop, j), 0); 
        }
        while(p2 == 0 && (lne.charAt(0) == '^' || lne.charAt(0) == '-')) {
            j++;
            p2 = mapi.MinClamp(lne.lastIndexOf(pop, j), 0);
        }
    return p2;
    }

    public static void doSwaps(String str, Comparable[] pPQ) {
        int pos1, pos2, inx1, inx2, inx3;
        while (!str.equals("}")) {
            inx1 = ((int) str.indexOf("(")) + 1;
            inx2 = ((int) str.indexOf(","));
            inx3 = ((int) str.indexOf(")"));

            pos1 = Integer.parseInt(str.substring(inx1, inx2));
            pos2 = Integer.parseInt(str.substring(inx2 + 1, inx3));
            stExch(pPQ, pos1, pos2);
            str = str.substring(inx3 + 2, str.length());
        }
    }

    /**
     * 
     * This is a function that fills a array with the index squared integers. It
     * comes from an exercise It comes from Algo exer 1.1.10
     *
     * @implNote answer It does not allocate memory for a[] with new. This code
     * results in a variable a might not have been initialized compile-time
     * error 1.1.10 What is wrong with the following code fragment? int[] a; for
     * (int i = 0; i < 10; i++) a[i] = i * i; 
     * @param a integer arrays 
     * @param n length of array
     * @return The pointer to the character array
     */
    public Comparable[] flCompa(Comparable[] a, int n) {
        
        Comparable[] b = new Comparable[n];

        for (int i = 0; i < n; i++) {
            b[i] = i;
        }
        return b;
    }


    /**
     * Stops integer from itterating towards a negative number
     * @param j Integer to be clamped
     * @return Either j or 0 depending if j is negative
     */
    public int cClamp(int j) {
        if (j < 0) {
            return 0;
        }
        return j;
    }


    /**
     * This method is used to see if the method makeSecondhalf
     * should return the second half depending on if the 
     * origional QP ends with somehow with the second 
     * half of the output
     * @param ch2 A shortend checkStr to be checked if QP ends with it
     * @param h2 The full second half
     * @return the correct second half.
     */
    public String endsWith(String ch2, String h2, String h1){
        String check2 = ch2;
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        if(p8QP.endsWith(ssapi.sReverse(check2))) {
            return ssapi.sReverse(h2);
        }
        check2 = h2.substring(h2.length()/2, h2.length() );
        if(p8QP.endsWith(check2)){
            return h2;
        } 
        return "x";
    }

    public String stWith(String ch1, String h1) {
        String check1 = ch1;
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        char cQP1 = p8QP.charAt(0), cQP2 = p8QP.charAt(p8QP.length()-1);
        char cCp1 = check1.charAt(0);
        if(p8QP.startsWith(ch1) ){
            if(cCp1 == cQP1 && cCp1 == cQP2) {
                return ssapi.sReverse(h1);
            }
            return h1;
        }
        return "x";
    }    

    public char cFinddif(String h2nd, String h1st) {
        char rep, cd = '!';
        String t2nd = h2nd, t1st = h1st;
        int  h1stAmount, h2ndAmount, iChar = 0, N = h1st.length();
        while (cd == '!' ) {
                rep = t2nd.charAt(cClamp(iChar));
                t2nd = t2nd.replace(rep + "", "");
                h2ndAmount = Math.abs(h2nd.length() - t2nd.length());
                t1st = t1st.replace(rep + "", "");
                h1stAmount = Math.abs(h1st.length() - t1st.length());
                if (h2ndAmount > h1stAmount) {
                    cd = rep;
                    break;
                } else if(iChar >= N - 1 ){
                    break;
                }
                t1st = h1st;
                t2nd = h2nd;
                iChar++;
            }
        return cd;
    }

    /**
     * This method takes the hold second as lne and if the corresponding
     * digit in hold1st is correct it edits the string so that the program 
     * leaves it alone
     * 
     * @param lne This is the string where the substitution will happen
     * @param pali This is the string value that is used to check for duplicates
     * @return Alternate version of lne with dashes where it coinsides with pali
     */
    public static String SameSamen(String lne, String pali) {
        StringBuilder nsbLine = new StringBuilder(lne);
        int N = lne.length();
        for (int j = 0; j < N; j++) {
            if (lne.charAt(j) == pali.charAt(N-j-1) && j == N-j-1) {
                nsbLine.setCharAt(j, 'n');
                lne = nsbLine + "";
                break;
            }
        }
        return lne;
    }

    /**
     * This method takes in 2 strings and returns the first index where they are the same  
     * @param h1 first string to compare
     * @param hf second string to compare
     * @return the number of characters that are the same
     */
    public int cntSame(String h1, String hf) {
        int count = 0;
        for (int i = 0; i < h1.length(); i++) {
            if(h1.charAt(i) == hf.charAt(i)) {
                return count;
            }
        }
        return count;
    }

    /**
     * Checks if string is palindrome
     * @param pali Potential palindrome
     * @return true if the string is a palindrome and false otherwise
     */
    public static boolean isPali(String pali) {
        int j = 0;
        for (int i = 0; i < pali.length()/2; i++) {
            j = (pali.length()) - 1 - i;
            if(pali.charAt(i) != pali.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

    }

}
