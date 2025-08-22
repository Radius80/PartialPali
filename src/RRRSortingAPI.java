
public class RRRSortingAPI {
    private int p1nSwapsMin;
    private int p2nSwapsMax;
    private int p3sblenMin;
    private int p4sbLenMax;
    private int p5jmpMin;
    private int p6jmpMax;
    private int p7strLength;
    private String p8QP;
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
        if(Math.abs(p2 - i) > mx) {
            p2 = MinClamp(lne.lastIndexOf(pop, j), 0); 
        }
        while(p2 == 0 && (lne.charAt(0) == '^' || lne.charAt(0) == '-')) {
            j++;
            p2 = MinClamp(lne.lastIndexOf(pop, j), 0);
        }
    return p2;
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
        for (Comparable order1 : order) {
            output = output + "|" + order1 + "";
        }
        return output;
    }


    public static void doSwaps(String str, Comparable[] pPQ) {
        int pos1;
        int pos2;
        int inx1;
        int inx2;
        int inx3;
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
     * This is used so that itterations for arrays don't go out of bounds
     * It clamps a potential large value to a specified maximum
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

    /**
     * Finds the index of where the tail of the algorythm should be
     * 
     * It initializing declares both hold1 and hold2 to the full QP
     * entered. 
     * rep for repeat is set to the last character in the string. 
     * To sea if it occurs an even amount all instances of rep is removed from hold3
     * while hold2 is still safely equal to the origeonal QP.
     * sAmount is the length of the origeonal string minus the 
     * one with rep removed.
     * if sAmount is uneven ((sAmount/2) *2 or nN) will not be equal to sAmount
     * then Tail can be found to be equal to the character rep that was removed.
     * This method is not called if QP.StringLength is even.
     *
     * 
     * @param suiQP Quazipalindrome
     * @return the index of where the tail of the QP should be
     */
    public int setTail(String suiQP) {
        String hold3;
        String hold2 = suiQP;
        String tail = "";
        char rep;
        int sAmount;
        int nN;
        int idx = 0;
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

    /**
     * Does the sorting of the string that was entered. It does not do sorting
     * anymore it just groups all the pares together.
     * The first if is to define if the entered string has an even amount of
     * digits or and odd amount.
     * 
     * Tail start is a condition where the tail or digit that will occur in
     * the middle of the string is in the first half and both firsthalf and
     * second half equal each other in that case revf is sReverse(holdFirst)
     * @param suiQP QuaziPalindrome
     * @param jMax Jump Maximum length
     * @return Palindrome
     */
    public String mkPaliP56(String suiQP, int jMax) {
        int jumpMax = (jMax/2);
        String tail = "";
        String hold3 = suiQP;
        String revf, revS;
        String holdFrst, holdSecH;
        int idx = 0;
        if (hold3.length() % 2 != 0) {
            idx = setTail(suiQP);
            tail = suiQP.charAt(idx) + "";
            hold3 = hold3.substring(0, idx)
                    + hold3.substring(idx + 1, hold3.length());
        } else {
            jumpMax++;
        }
        holdFrst = hold3.substring(0, hold3.length() / 2);
        holdSecH = hold3.substring((hold3.length() / 2), hold3.length());
        boolean tailStart = idx < holdFrst.length();
        //There is maybe some redundancy hereVV
        if (holdFrst.equals(holdSecH)) {
            if(tailStart) {
                revS = holdSecH;
                revf = sReverse(revS);
                return revf + tail + revS;
            }
             revf = holdFrst;
             revS = sReverse(holdSecH);
            return revf + tail + revS;
        }    
        revS = makeSecondHalfP57(suiQP, holdFrst, holdSecH, jumpMax);
        revf = sReverse(revS);
        return revf + tail + revS;
    }

    /**
     * This function replaces characters in lne that apears in the same char index
     * as pali
     * 
     * @param lne This is the string where the substitution will happen
     * @param pali This is the string value that is used to check for duplicates
     * @return Alternate version of lne with dashes where it coinsides with pali
     */
    public static String SameSame(String lne, String pali) {
        StringBuilder nsbLine = new StringBuilder(lne);
        for (int j = 0; j < lne.length(); j++) {
            if (lne.charAt(j) == pali.charAt(j)) {
                nsbLine.setCharAt(j, '-');
                lne = nsbLine + "";
            }
        }
        return lne;
    }

     /**
     * Males the second half if the second half is made it can just use that to
     * make the rest
     *
     * After the integer initialization the half jump length is worked out.
     * EXAMPLE: if jumplength is 4 QP = ACGTGTCA the palindrome is then:
     * ACGTTGCA and the correct second half is TGCA so the jump length should be
     * something like 2 depending on the QP
     * 
     * The QP is then split into 2 equal length parts and their values are coppied
     * to be called again after editing.
     * 
     * So then we want to see what in the second half appears in the first half.
     * So to see if the longest jump switch is the correct one a charracter rep
     * is set to the value of what the second position would be but in second half
     * form.
     * hAmount (The amount of times it occurs in the subset) is then calculated
     * by subtracting the origional secondhalf length with the half length after
     * that the all the characters equal to rep is removed from the second half.
     * 
     * fAmount(the amount of times rep occurs in the first half) is then calculated the
     * same way.
     * 
     * 
     * It is now possible to understand the condition inside the while brackets.
     * This algorythm runs until the quantities of the unique digits in the second
     * half is equal to the quantities in of the same digits in the first half.
     * 
     * So inside the while the rep is the fist character in the secondlf of the string
     * Inside the while it skips the digits where there are equal amount of them in 
     * the first half and the second
     * 
     * Then in the if after pop declaration if(the amount the digit occurs in the
     * second half is more than the first half), which means a digit from the first
     * half needs to be sent to the second half and the postion it is sent is to 
     * the altered jump length
     * 
     * 
     * else (if that digit occurs more in the first string ):
     * The first half just gets the rep concatenated at left side of the
     * firsthalf string
     * 
     * So then it often performs more actions than the half string are long
     * which is where the jump length should be adjusted accordingly
     * 
     * @param srapiQP Quazipalindrome
     * @param jumMax JumpMax
     * @return Second half;
     */
    public String makeSecondHalfP5(String srapiQP, String holdFrst, String holdSecH, int jumpMax) {
        String firstHalf, scndHalf;
        StringBuilder pop, popf;
        String hold3 = srapiQP;
        //String MaybeSwaps = "";
        char rep;
        int hAmount = 1, fAmount = 0, jumpH, countOPs = 0;
        jumpH = (jumpMax / 2) - 1;


        if(jumpMax < srapiQP.length() - 2 && jumpMax >= holdSecH.length()  ) {
            jumpH = holdSecH.length() - 1;
        }
        
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
            countOPs ++;
            if (countOPs > holdSecH.length()) {
                jumpH = MinClamp(jumpH -1 , 0);
                countOPs = 0;
                holdFrst = hold3.substring(0, hold3.length() / 2);
                holdSecH = hold3.substring((hold3.length() / 2), hold3.length());
                firstHalf = holdFrst;
                scndHalf = holdSecH;
            }
        }
        return holdSecH;
    }


    /**
     * Males the second half if the second half is made it can just use that to
     * make the rest
     *
     * After the integer initialization the half jump length is worked out.
     * EXAMPLE: if jumplength is 4 QP = ACGTGTCA the palindrome is then:
     * ACGTTGCA and the correct second half is TGCA so the jump length should be
     * something like 2 depending on the QP
     * 
     * jIdx is an acronym for jumpIdx
     * 
     * The QP is then split into 2 equal length parts and their values are coppied
     * to be called again after editing.
     * if there is the same amount of each unique digit in the first and second half
     * the second half is the correct order it seems 
     * So then we want to see what in the second half appears in the first half.
     * So to see if the longest jump switch is the correct one a charracter rep
     * is set to the value of what the second position would be but in second half
     * form.
     * hAmount (The amount of times it occurs in the subset) is then calculated
     * by subtracting the origional secondhalf length with the half length after
     * that the all the characters equal to rep is removed from the second half.
     * 
     * fAmount(the amount of times rep occurs in the first half) is then calculated the
     * same way.
     * 
     * 
     * It is now possible to understand the condition inside the while brackets.
     * This algorythm runs until the quantities of the unique digits in the second
     * half is equal to the quantities in of the same digits in the first half.
     * 
     * So inside the while the rep is the fist character in the secondlf of the string
     * Inside the while it skips the digits where there are equal amount of them in 
     * the first half and the second
     * 
     * Then in the if after pop declaration if(the amount the digit occurs in the
     * second half is more than the first half), which means a digit from the first
     * half needs to be sent to the second half and the postion it is sent is to 
     * the altered jump length
     * 
     * 
     * else (if that digit occurs more in the first string ):
     * The first half just gets the rep concatenated at left side of the
     * firsthalf string
     * 
     * So then it often performs more actions than the half string are long
     * which is where the jump length should be adjusted accordingly
     * TGTCGC
     * CGTTGC 
     * @param srapiQP Quazipalindrome
     * @param jumMax JumpMax
     * @return Second half;
     */
    public String makeSecondHalfP56(String srapiQP, String holdFrst, String holdSecH, int jumpMax) {
        //p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5;
        p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 1; p6jmpMax = 6;
        //p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 6;
        
        String hold1st, hold2nd;
        StringBuilder pop, popf;
        char c1 = '!', c2 = '!';
        int cIdx1st, cIdx2nd, N;
        N = holdFrst.length();
        boolean sm1st, sm2nd;
        jumpMax = MinClamp(jumpMax, 1);
        //Why this ^
        hold1st = holdFrst;
        hold2nd = holdSecH;
        p8QP = srapiQP;
        c1 = cFinddif(hold1st, hold2nd);
        c2 = cFinddif(hold2nd, hold1st);
        if(c1 == c2 && c1 == '!') {
        sm1st = hold1st.equals(srapiQP.substring(0, N ));
        sm2nd = hold2nd.equals(srapiQP.substring(N,srapiQP.length()));
            if(sm1st & !sm2nd) {
                return sReverse(hold1st);
            }
            return hold2nd; 
        } else {
            String swap1l = oneSwapleft(holdFrst, holdSecH, jumpMax, c1, c2);
            if (!swap1l.equals("x")){
                return swap1l;
            }
            cIdx2nd = hold2nd.indexOf(c2);
            pop = new StringBuilder(hold2nd);
            pop.setCharAt(cIdx2nd, c1);
            hold2nd = pop + "";

            cIdx1st = hold1st.indexOf(c1);
            popf = new StringBuilder(hold1st);
            popf.setCharAt(cIdx1st, c2);
            hold1st = popf + "";

            return makeSecondHalfP56(srapiQP, hold1st, hold2nd, jumpMax);
        }
    }
    
        /**
     * Males the second half if the second half is made it can just use that to
     * make the rest
     *
     * After the integer initialization the half jump length is worked out.
     * EXAMPLE: if jumplength is 4 QP = ACGTGTCA the palindrome is then:
     * ACGTTGCA and the correct second half is TGCA so the jump length should be
     * something like 2 depending on the QP
     * 
     * jIdx is an acronym for jumpIdx
     * 
     * The QP is then split into 2 equal length parts and their values are coppied
     * to be called again after editing.
     * if there is the same amount of each unique digit in the first and second half
     * the second half is the correct order it seems 
     * So then we want to see what in the second half appears in the first half.
     * So to see if the longest jump switch is the correct one a charracter rep
     * is set to the value of what the second position would be but in second half
     * form.
     * hAmount (The amount of times it occurs in the subset) is then calculated
     * by subtracting the origional secondhalf length with the half length after
     * that the all the characters equal to rep is removed from the second half.
     * 
     * fAmount(the amount of times rep occurs in the first half) is then calculated the
     * same way.
     * 
     * 
     * It is now possible to understand the condition inside the while brackets.
     * This algorythm runs until the quantities of the unique digits in the second
     * half is equal to the quantities in of the same digits in the first half.
     * 
     * So inside the while the rep is the fist character in the secondlf of the string
     * Inside the while it skips the digits where there are equal amount of them in 
     * the first half and the second
     * 
     * Then in the if after pop declaration if(the amount the digit occurs in the
     * second half is more than the first half), which means a digit from the first
     * half needs to be sent to the second half and the postion it is sent is to 
     * the altered jump length
     * 
     * 
     * else (if that digit occurs more in the first string ):
     * The first half just gets the rep concatenated at left side of the
     * firsthalf string
     * 
     * So then it often performs more actions than the half string are long
     * which is where the jump length should be adjusted accordingly
     * TGTCGC
     * CGTTGC 
     * @param srapiQP Quazipalindrome
     * @param jumMax JumpMax
     * @return Second half;
     */
    public String makeSecondHalfP57(String srapiQP, String holdFrst, String holdSecH, int jumpMax) {
        //p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5;
        p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 1; p6jmpMax = 6;
        //p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 6;
        //p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1;
        
        String hold1st, hold2nd, swap1l;
        StringBuilder pop, popf;
        char c1 = '!', c2 = '!';
        int cIdx1st, cIdx2nd, N;
        N = holdFrst.length();
        jumpMax = MinClamp(jumpMax, 1);
        //Why this ^ 
        hold1st = holdFrst;
        hold2nd = holdSecH;
        p8QP = srapiQP;
        c1 = cFinddif(hold1st, hold2nd);
        c2 = cFinddif(hold2nd, hold1st);
        if(c1 == c2 && c1 == '!') {
            if(p6jmpMax == 1) {
                return hold2nd;
            } 
            if(isPali(hold1st)) {
                return hold1st;
            } else if(isPali(hold2nd)) {
                return hold2nd;
            } else if(hold2nd.equals(sReverse(hold1st))) {
                return hold2nd;
            } 
        } if( p6jmpMax > 1) {
            swap1l = oneSwapleft(holdFrst, holdSecH, jumpMax, c1, c2);
            if(!swap1l.equals("x")){
                return swap1l;
            }

        } 
        cIdx2nd = hold2nd.indexOf(c2);
        pop = new StringBuilder(hold2nd);
        pop.setCharAt(cIdx2nd, c1);
        hold2nd = pop + "";
        cIdx1st = hold1st.indexOf(c1);
        popf = new StringBuilder(hold1st);
        popf.setCharAt(cIdx1st, c2);
        hold1st = popf + "";

        return makeSecondHalfP57(srapiQP, hold1st, hold2nd, jumpMax);
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

    public String oneSwapleft (String holdFrst, String holdSecH, int jumpMax, char c1, char c2) {
        String hold1st = holdFrst, hold2nd = holdSecH;
        StringBuilder pop = new StringBuilder(hold2nd), popf;
        char pc1, pc2;
        int N = hold1st.length(), jIdx = MinClamp(jumpMax - 1, 0);
        if(p8QP.length() % 2 == 0) {
            jIdx--;
        }

        //for (int i = jIdx; i >= p5jmpMin - 1; i--) {
        //    if (i == 0) {
        //        System.out.println("");
        //    }
        //    if(hold2nd.charAt(i) == c1) {
        //        pop.setCharAt(MinClamp(i - 1, 0), c1);
        //    } else {
        //        pop.setCharAt(i, c1);
        //    }
        //    hold2nd = pop + "";
        //    if(hold2nd.equals(sReverse(hold1st))){
        //        return hold2nd;
        //    }
        //    popf = new StringBuilder(hold1st);
        //    for (int j = MinClamp((i*2) - jumpMax*2, 0); j < N; j ++) {
        //        if(hold1st.charAt(j) == c2) {
        //            popf.setCharAt(MaxClamp(j + 1, N -1), c2);
        //        } else {
        //        popf.setCharAt(j, c2);
        //        }
        //        hold1st = popf + "";
        //        if(hold1st.equals(sReverse(hold2nd))){
        //            return hold1st;
        //        }
        //        hold1st = holdFrst;
        //        popf = new StringBuilder(hold1st);
        //    }
        //    hold2nd = holdSecH;
        //    pop = new StringBuilder(hold2nd);
        //}

        for (int j = MinClamp((jIdx*2) - jumpMax*2, 0); j < N; j ++) {            
            popf = new StringBuilder(hold1st);
            if(hold1st.charAt(j) == c2) {
                popf.setCharAt(MaxClamp(j + 1, N -1), c2);
            } else {
            popf.setCharAt(j, c2);
            }
            hold1st = popf + "";
            if(isPali(hold1st) && hold1st.equals(hold2nd)){
                return hold1st;
            }
        
            for (int i = jIdx; i >= p5jmpMin - 1; i--) {        
                if(hold2nd.charAt(i) == c1) {
                    pop.setCharAt(MinClamp(i - 1, 0), c1);
                } else {
                    pop.setCharAt(i, c1);
                }
                hold2nd = pop + "";
                if(hold2nd.equals(sReverse(hold1st))){
                    return hold2nd;
                }
                pc1 = cFinddif(hold1st, hold2nd);
                pc2 = cFinddif(hold2nd, hold1st);
                if(pc1 == pc2 && pc1 == '!' ){
                    if(isPali(hold1st)){
                        return hold1st;
                    } else if (isPali(hold2nd)) {
                        return hold2nd;
                    }
                }  
                hold2nd= holdSecH;
                pop = new StringBuilder(hold2nd);
            }
            hold1st = holdFrst;
            popf = new StringBuilder(hold1st);
        }

        return "x";
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
