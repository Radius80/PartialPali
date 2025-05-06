
public class RRRSortingAPI {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public String printStr(Comparable[] order, String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output = output + str.charAt((int) order[i]);
        }
        return output;
    }

    public String printCode(Comparable[] order) {
        String output = "";
        for (int i = 0; i < order.length; i++) {
            output = output + "|" + order[i] + "";
        }
        return output;
    }

    public static void doSwaps(String str, Comparable[] pPQ) {
        int pos1 = 0;
        int pos2 = 0;
        int inx1 = 0;
        int inx2 = 0;
        int inx3 = 0;
        while (!str.equals("}")) {
            inx1 = ((int) str.indexOf("(")) + 1;
            inx2 = ((int) str.indexOf(","));
            inx3 = ((int) str.indexOf(")"));

            pos1 = Integer.parseInt(str.substring(inx1, inx2));
            pos2 = Integer.parseInt(str.substring(inx2 + 1, inx3));
            exch(pPQ, pos1, pos2);
            str = str.substring(inx3 + 2, str.length());
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
     * @return The pointer to the character array
     */
    public Comparable[] flCompa(Comparable[] a) {
        int s = a.length;
        Comparable[] b = new Comparable[s];

        for (int i = 0; i < s; i++) {
            b[i] = i;
        }
        return b;
    }

    /**
     * Does the sorting of the string that was entered. It does not do sorting
     * anymore it just groups all the pares together.
     *
     * @param suiQP QuaziPalindrome
     * @param jMax Jump Maximum length
     * @return Palindrome
     */
    public String mkPali(String suiQP, int jMax) {
        int jumpMax = jMax;
        String tail = "";
        Comparable[] csuiQp;
        String hold3 = suiQP;
        String revf = "", revS = "";
        StringBuilder pop;
        int idx = 0;
        //find Tail
        if (hold3.length() % 2 != 0) {
            idx = setTail(suiQP);
            tail = suiQP.charAt(idx) + "";
            hold3 = hold3.substring(0, idx)
                    + hold3.substring(idx + 1, hold3.length());
        } else {
            jumpMax++;
        }
        revS = makeSecondHalf(hold3, jumpMax);
        csuiQp = new Comparable[revS.length()];
        csuiQp = flCompa(csuiQp);
        revf = sReverse(revS);
        return revf + tail + revS;
    }

    /**
     * Males the second half if the second half is made it can just use that to
     * make the rest
     *
     * @param srapiQP Quazipalindrome
     * @param jumMax JumpMax
     * @return Second half;
     */
    public String makeSecondHalf(String srapiQP, int jumpMax) {
        String firstHalf = "";
        String holdFrst = "";
        String scndHalf = "";
        String holdSecH = "";
        StringBuilder pop;
        StringBuilder popf;
        String hold3 = srapiQP;
        char rep = ' ';
        int hAmount = 1, fAmount = 0, jumpH = 0;
        jumpH = (jumpMax / 2) - 1;

        holdFrst = hold3.substring(0, hold3.length() / 2);
        holdSecH = hold3.substring((hold3.length() / 2), hold3.length());
        firstHalf = holdFrst;
        scndHalf = holdSecH;
        while (hAmount != fAmount) {
            rep = scndHalf.charAt(cClamp(jumpH - 1));
            scndHalf = scndHalf.replace(rep + "", "");
            hAmount = Math.abs(holdSecH.length() - scndHalf.length());
            firstHalf = firstHalf.replace(rep + "", "");
            fAmount = Math.abs(holdFrst.length() - firstHalf.length());
            while (fAmount == hAmount && scndHalf.length() > 0) {
                rep = scndHalf.charAt(cClamp(0));
                scndHalf = scndHalf.replace(rep + "", "");
                hAmount = Math.abs(holdSecH.length() - scndHalf.length());
                firstHalf = firstHalf.replace(rep + "", "");
                fAmount = Math.abs(holdFrst.length() - firstHalf.length());
            }
            pop = new StringBuilder(holdSecH);
            popf = new StringBuilder(holdFrst);

            if (fAmount < hAmount) {
                pop.setCharAt(cClamp(jumpH - 1), firstHalf.charAt(0));
                holdSecH = pop + "";
                popf.setCharAt(0, rep);
                holdFrst = popf + "";
                firstHalf = holdFrst;
                scndHalf = holdSecH;
            } else if (hAmount > fAmount) {
                firstHalf = rep + firstHalf;
            }
        }
        //if (jumpH > -1) {
        //} else {
        //    return holdSecH;
        //}
        return holdSecH;
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
     * This is used so that itterations for arrays don't go out of bounds
     * @param j itterator
     * @param Max Maximum value
     * @return The maximum between j and Max
     */
    public int MaxClamp(int j, int Max) {
        if(j > Max) {
            j = Max;
        }
        return j;
    }

    /**
     * This is used so that itterations for arrays don't go out of bounds
     * @param j itterator
     * @param Min Minimum value
     * @return The minimum between j and                                                                                                                        Min
     */
    public int MinClamp(int j, int Min) {
        if(j < Min) {
            j = Min;
        }
        return j;
    }


    /**
     * Reveses String
     *
     * @param sHalf String to be reverse
     * @return Reversed String.
     */
    public String sReverse(String sHalf) {
        String output = "";
        for (int i = 0; i < sHalf.length(); i++) {
            output = sHalf.charAt(i) + output;
        }
        return output;
    }

    public int setTail(String suiQP) {
        String hold3 = suiQP;
        String hold2 = suiQP;
        char rep;
        int sAmount;
        int nN;
        int idx = 0;
        String tail = "";
        hold3 = suiQP;
        while (hold3.length() > 0) {
            rep = hold3.charAt(hold3.length() - 1);
            hold3 = hold3.replace(rep + "", "");
            sAmount = hold2.length() - hold3.length();
            nN = (sAmount / 2) * 2;
            if (sAmount != nN) {
                tail = tail + rep;
                idx = suiQP.indexOf(tail.charAt(0));
                break;
            }
            hold2 = hold3;
        }
        return idx;
    }

    public static void main(String[] args) {

    }

}
