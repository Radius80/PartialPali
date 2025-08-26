
/** ************************************************************************
 *  Object that does the search functionality of the the project
 *  Author: Darius Becker
 *  Authot student number: 22006710
 ************************************************************************** */
public class PPSEARCH {

    private int p1nSwapsMin;
    private int p2nSwapsMax;
    private int p3sblenMin;
    private int p4sbLenMax;
    private int p5jmpMin;
    private int p6jmpMax;
    private int p7strLength;
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
        p1nSwapsMin = Integer.parseInt(pmmStrings[0]);
        p2nSwapsMax = Integer.parseInt(pmmStrings[1]);
        p3sblenMin = Integer.parseInt(pmmStrings[2]);
        p4sbLenMax = Integer.parseInt(pmmStrings[3]);
        p5jmpMin = Integer.parseInt(pmmStrings[4]);
        p6jmpMax = Integer.parseInt(pmmStrings[5]);
        p7strLength = Integer.parseInt(pmmStrings[6]);
        sorted = "";
        edMinusOne();
    }

    public PPSEARCH() {
        
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
        int interv = p7strLength - p3sblenMin + 1;
        int intstop = p7strLength - p4sbLenMax + 1;
        int output = mapi.zzzPLSFcN(interv, interv, intstop);
        return output;
    }

    /**
     * This will only get the possible substrings
     *
     * @param qPline QuaziPalindrome
     */
    public void fillSubs(String qPline) {
        int subMmax = p7strLength - p3sblenMin + 1;
        int tempSublen = p3sblenMin;
        int j = 0;

        while (tempSublen <= p4sbLenMax) {
            for (int i = 0; i < subMmax; i++) {
                subStrings[j] = qPline.substring(i, i + tempSublen);
                j++;
            }

            tempSublen = tempSublen + 1;
            subMmax = p7strLength - tempSublen + 1;
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
     * This function will calculate the MaxPossibleimum value that the p4sbLenMax
     * parameter can be
     *
     * @return The maximum valie of that parameter
     */
    public int getMaxPossibleSublen() {
        return getStringLength();
    }

    /**
     * This function will calculate the maximum value that the p2nSwapsMax
     * parameter can be
     *
     * @return The maximum valie of that parameter
     */
    public int getMaxPossibleSwaps() {
        RRRMathAPI zmapi = new RRRMathAPI();
        dis = p7strLength;
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
        if (p2nSwapsMax < 0) {
            p2nSwapsMax = dis;
        }
        dis = 888;
        dis = getMaxPossibleSublen();
        if (p4sbLenMax < 0) {
            p4sbLenMax = dis;
        }
        dis = 777;
        dis = getMaxPossibleJumps();
        if (p6jmpMax < 0) {
            p6jmpMax = dis;
        }

    }

    /**
     * assessor for nrSwapMin
     *
     * @return getp1nSwapsMin
     */
    public int getp1nSwapsMin() {
        //p1nSwapsMin 
        dis = p1nSwapsMin;
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
    public int getp2nSwapsMax() {
        // nrSwapsMax
        dis = p2nSwapsMax;
        return dis;
    }

    /**
     * assessor for getSublenMin
     *
     * @return getSublenMin
     */
    public int getp3sblenMin() {
        //sublenMin
        dis = p3sblenMin;
        return dis;
    }

    /**
     * assessor for getp4sbLenMax
     *
     * @return getp4sbLenMax
     */
    public int getp4sbLenMax() {
        //p4sbLenMax
        dis = p4sbLenMax;
        return dis;
    }

    /**
     * assessor for getp5jmpMin
     *
     * @return getp5jmpMin
     */
    public int getp5jmpMin() {
        //p5jmpMin
        dis = p5jmpMin;
        return dis;
    }

    /**
     * assessor for getp6jmpMax
     *
     * @return getp6jmpMax
     */
    public int getp6jmpMax() {
        //p6jmpMax
        dis = p6jmpMax;
        return dis;
    }

    /**
     * assessor for getp7strLength
     *
     * @return getStringLength
     */
    public int getStringLength() {
        //p7strLength
        dis = p7strLength;
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
    public void groupPairs(String suiQP) {
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
     * Check is QP input is actually quazi palindrome 
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
        if (wntSwap > p2nSwapsMax) {
            wntSwap = p2nSwapsMax;
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
        return "SearchArgs [nrSwapsMin=" + p1nSwapsMin + ", nrSwapsMax="
                + p2nSwapsMax + ", subLenMin="
                + p3sblenMin + ", subLenMax=" + p4sbLenMax + ", jumpMin="
                + p5jmpMin + ", jumpMax=" + p6jmpMax + ", stringLength="
                + p7strLength + "]";
    }
}
