
/** ************************************************************************
 *  Object that does the search functionality of the the project
 *  Author: Darius Becker
 *  Authot student number: 22006710
 ************************************************************************** */
public class PPSEARCH {

    private int nrSwapsMin;
    private int nrSwapsMax;
    private int sublenMin;
    private int subLenMax;
    private int jumpMin;
    private int jumpMax;
    private int strLength;
    private int dis;
    private int swpNum;
    private String sorted;
    private HeadTail ht;
    private String[] subStrings;
//0 String sm, 1 String smx, 2 String slm, 3 String slmx, 
//4 String jm, 5 String jmx, 6 Sbtring sl

    /**
     * Constructor for Search String manager
     *
     * @param pmmStrings parameters in String array from QP
     */
//***********************************************************************/
    public PPSEARCH(String[] pmmStrings) {
        nrSwapsMin = Integer.parseInt(pmmStrings[0]);
        nrSwapsMax = Integer.parseInt(pmmStrings[1]);
        sublenMin = Integer.parseInt(pmmStrings[2]);
        subLenMax = Integer.parseInt(pmmStrings[3]);
        jumpMin = Integer.parseInt(pmmStrings[4]);
        jumpMax = Integer.parseInt(pmmStrings[5]);
        strLength = Integer.parseInt(pmmStrings[6]);
        sorted = "";
        edMinusOne();
    }

    /**
     * Sets the subsStrings that the QP Can possibly be set by
     */
    public void setSubs() {
        subStrings = new String[gtSubsMax()];
    }

    /**
     * Checks if the string enter is in parameter format loosely
     *
     * @param line The entered line
     * @return The line that would be outputted
     */
    public boolean isInt(String line) {
        int isInt;
        try {
            isInt = Integer.parseInt(line) + 1;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Get maximum sub amount
     *
     * @return maximum sub amount
     */
    public int gtSubsMax() {
        RRRMathAPI mapi = new RRRMathAPI();
        int interv = strLength - sublenMin + 1;
        int intstop = strLength - subLenMax + 1;
        int output = mapi.zzzPLSFcN(interv, interv, intstop);
        return output;
    }

    /**
     * This will only get the possible substrings
     *
     * @param qPline QuaziPalindrome
     */
    public void fillSubs(String qPline) {
        int subMmax = strLength - sublenMin + 1;
        int tempSublen = sublenMin;
        int j = 0;

        while (tempSublen <= subLenMax) {
            for (int i = 0; i < subMmax; i++) {
                subStrings[j] = qPline.substring(i, i + tempSublen);
                j++;
            }

            tempSublen = tempSublen + 1;
            subMmax = strLength - tempSublen + 1;
        }
    }

    /**
     * Does the logic of setting the substrings
     *
     * @param qPline The quazi palindrome
     * @return An array of substrings
     */
    public String[] getSubs(String qPline) {
        fillSubs(qPline);
        String[] dis = new String[subStrings.length];
        dis = subStrings;
        return dis;
    }

    /**
     * This function will calculate the maximum value that the jumMax parameter
     * can be
     *
     * @return The maximum valie of that parameter
     */
    public int getMaxPossibleJumps() {
        return getStringLength() - 1;
    }

    /**
     * This function will calculate the MaxPossibleimum value that the subLenMax
     * parameter can be
     *
     * @return The maximum valie of that parameter
     */
    public int getMaxPossibleSublen() {
        return getStringLength();
    }

    /**
     * This function will calculate the maximum value that the nrSwapsMax
     * parameter can be
     *
     * @return The maximum valie of that parameter
     */
    public int getMaxPossibleSwaps() {
        RRRMathAPI zmapi = new RRRMathAPI();
        dis = strLength;
        return zmapi.zzzAchooseB(dis, 2);
    }
//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111

    /**
     * This function will turn -1 entries at the maximum values into Max values
     * I'm making dis = to 99 to hopefully catch the state where dis does not
     * change
     */
    public void edMinusOne() {
        dis = 999;
        dis = getMaxPossibleSwaps();
        if (nrSwapsMax < 0) {
            nrSwapsMax = dis;
        }
        dis = 888;
        dis = getMaxPossibleSublen();
        if (subLenMax < 0) {
            subLenMax = dis;
        }
        dis = 777;
        dis = getMaxPossibleJumps();
        if (jumpMax < 0) {
            jumpMax = dis;
        }

    }

    /**
     * assessor for nrSwapMin
     *
     * @return getNrSwapsMin
     */
    public int getNrSwapsMin() {
        //nrSwapsMin 
        dis = nrSwapsMin;
        return dis;
    }

    /**
     * Returns the number
     *
     * @return the number
     */
    public int getswpNum() {
        dis = swpNum;
        return dis;
    }

    /**
     * assessor for nrSwapsMax
     *
     * @return nrSwapsMax
     */
    public int getNrSwapsMax() {
        // nrSwapsMax
        dis = nrSwapsMax;
        return dis;
    }

    /**
     * assessor for getSublenMin
     *
     * @return getSublenMin
     */
    public int getSublenMin() {
        //sublenMin
        dis = sublenMin;
        return dis;
    }

    /**
     * assessor for getSubLenMax
     *
     * @return getSubLenMax
     */
    public int getSubLenMax() {
        //subLenMax
        dis = subLenMax;
        return dis;
    }

    /**
     * assessor for getJumpMin
     *
     * @return getJumpMin
     */
    public int getJumpMin() {
        //jumpMin
        dis = jumpMin;
        return dis;
    }

    /**
     * assessor for getJumpMax
     *
     * @return getJumpMax
     */
    public int getJumpMax() {
        //jumpMax
        dis = jumpMax;
        return dis;
    }

    /**
     * assessor for getstrLength
     *
     * @return getStringLength
     */
    public int getStringLength() {
        //strLength
        dis = strLength;
        return dis;
    }

    /**
     * Get the sorted string
     *
     * @return getSorted
     */
    public String getSorted() {
        return sorted;
    }

    /**
     * Does the sorting of the string that was entered. It does not do sorting
     * anymore it just groups all the pares together.
     *
     * @param suiQP QuaziPalindrome
     */
    public void sortStr(String suiQP) {
        String hold2 = "";
        String tail = "";
        String hold3 = suiQP;
        char rep;
        int sAmount;
        int nN;
        while ((hold2.length() + tail.length()) != suiQP.length()) {
            rep = hold3.charAt(0);
            hold3 = hold3.replace(rep + "", "");
            sAmount = suiQP.length() - hold3.length() - hold2.length() - tail.length();
            nN = (sAmount / 2) * 2;
            for (int i = 0; i < (sAmount / 2) * 2; i++) {
                hold2 = hold2 + rep;
            }
            if (sAmount != nN) {
                tail = tail + rep;
            }
        }
        sorted = "" + hold2 + tail;
    }

    /**
     * Check is QP input is actually quazi palindrome 1 1 3 3 1 1 3 GAA
     *
     * @param sor The sorted string version of the palindrome.
     * @return true if String is a Quazi palindrome
     */
    public boolean isQP(String sor) {
        char tail;
        String dubString;
        boolean pairs;

        boolean even = sor.length() % 2 == 0;
        dubString = sor;
        tail = dubString.charAt(dubString.length() - 1);
        pairs = tail == dubString.charAt(dubString.length() - 2);
        if (even) {
            return pairs;
        } else {
            dubString = sor.substring(0, dubString.length() - 1);
            tail = dubString.charAt(dubString.length() - 1);
            pairs = tail == dubString.charAt(dubString.length() - 2);
            return dubString.length() % 2 == 0 && pairs;
        }
    }

    enum HeadTail {
        Head, Tail
    }

    /**
     * Switches between head and tail
     *
     * @param dubString The String that consist out of pairs of chars
     * @param rPlc The middle of the palindrome
     */
    public void switchHt(String dubString, char rPlc) {
        if (ht == HeadTail.Head && !dubString.equals("")) {
            if (dubString.charAt(0) != rPlc) {
                ht = HeadTail.Tail;
            }
        } else if (ht == HeadTail.Tail && !dubString.equals("")) {
            if (dubString.charAt(dubString.length() - 1) != rPlc) {
                ht = HeadTail.Head;
            }
        }
    }

    /**
     * It finds out how many swaps are needed for the palindrome to have to be
     * made. It also works it out if valid.
     *
     * @param lne Potential QuaziPalindrome
     * @param pali Palindrome
     * @param sComAr character index array
     * @return Number of swaps needed to make palindrome out of line
     */
    public boolean numberSwaps(String lne, String pali, Comparable[] sComAr) {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        String nsLine = lne, nsPali = pali, holds = pali;
        StringBuilder nsbLine = new StringBuilder(nsLine);
        StringBuilder nsbPali = new StringBuilder(nsPali);
        boolean jumpTobig;
        int count1 = 0, count2 = 1, i = 0, swapped = 0;

        for (int j = 0; j < lne.length(); j++) {
            if (nsLine.charAt(j) == nsPali.charAt(j)) {
                nsbLine.setCharAt(j, '-');
                nsbPali.setCharAt(j, '#');
                nsLine = nsbLine + "";
                nsPali = nsbPali + "";
            }
        }

        while (holds.length() > 0 && count1 <= lne.length() / 2) {
            jumpTobig = Math.abs(count2 - count1) > jumpMax;

            if (count1 == count2) {
                count2++;
            } else if (count2 == nsLine.length()) {
                count2 = 0;
                count1++;
            } else {
                if (nsLine.charAt(count1) == nsPali.charAt(count2)) {
                    sComAr[count2] = count1;
                    //System.out.println(rsapi.printStr(sComAr, lne));
                    //System.out.println(rsapi.printCode(sComAr));
                    //System.out.println();
                    nsbPali.setCharAt(count2, '#');
                    nsLine = nsbLine + "";
                    nsPali = nsbPali + "";
                    count1 = count1 + 1;
                    count2 = 0;
                    i++;
                }
                if (nsLine.charAt(count2) == nsPali.charAt(count1)) {
                    sComAr[count1] = count2;
                    //System.out.println(rsapi.printStr(sComAr, lne));
                    //System.out.println(rsapi.printCode(sComAr));
                    //System.out.println();
                    nsbPali.setCharAt(count1, '#');
                    nsLine = nsbLine + "";
                    nsPali = nsbPali + "";
                    count1 = count1 + 1;
                    count2 = 0;
                    i++;
                }
            }
            count2 = count2 + 1;

            if (i > nrSwapsMax) {
                return false;
            }
            holds = nsPali.replace("#", "");
        }
        if (i == 1) {
            swpNum = i;
        } else {
            swpNum = i - 1;

        }
        System.out.println(rsapi.printCode(sComAr));
        return true;
    }
//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//111111

    /**
     * Get the position of the swaps in formatted form. The
     *
     * @param lne the string the user entered
     * @param pali The palindrome
     * @param comArr The character array that dictates where the swaps11
     * @return The formatted swap positions
     */
    public String getpositionsSwaps(String lne, String pali, Comparable[] comArr) {
        String middle = "";
        middle = middle + printPositionSwaps(comArr, 0);
        int wntSwap = swpNum;
        if (wntSwap > nrSwapsMax) {
            wntSwap = nrSwapsMax;
        }
        for (int i = 1; i < wntSwap; i++) {
            middle = middle + ", " + printPositionSwaps(comArr, i);
        }
        return lne + "=[" + middle + "]";
    }

    /**
     * Print the position of the swaps
     *
     * @param comArr The comparable array that determines the swaps positions
     * @param j The amount of swaps
     * @return The swap positions string
     */
    private static String printPositionSwaps(Comparable[] comArr, int j) {
        String psWithComma = "";
        for (int i = j; i < comArr.length; i++) {
            if ((int) comArr[i] != i) {
                psWithComma = "(" + i + "," + comArr[i] + ")";
                break;
            }
        }
        return psWithComma;
    }

    /**
     * Returns the formatter String of the parameters
     *
     * @return The String of formatted
     */
    public String toString() {
        return "SearchArgs [nrSwapsMin=" + nrSwapsMin + ", nrSwapsMax="
                + nrSwapsMax + ", subLenMin="
                + sublenMin + ", subLenMax=" + subLenMax + ", jumpMin="
                + jumpMin + ", jumpMax=" + jumpMax + ", stringLength="
                + strLength + "]";
    }
}
