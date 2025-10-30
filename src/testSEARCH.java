
/** ************************************************************************
 *  Object that does the search functionality of the the project
 *  Author: Darius Becker
 *  Authot student number: 22006710
 ************************************************************************** */
public class testSEARCH {

    private int p1nSwapsMin;
    private int p2nSwapsMax;
    private int p3sblenMin;
    private int p4sbLenMax;
    private int p5jmpMin;
    private int p6jmpMax;
    private int p7strLength;
    private String p8QP;
    private int dis;
    private int swpNum;
    private String sorted;
    private String[] subStrings;

    //0 String sm, 1 String smx, 2 String slm, 3 String slmx, 
//4 String jm, 5 String jmx, 6 Sbtring sl

    /**
     * Constructor for Search String manager
     *
     * @param pmmStrings parameters in String array from QP
     */
//***********************************************************************/
    public testSEARCH(String[] pmmStrings) {
        p1nSwapsMin = Integer.parseInt(pmmStrings[0]);
        p2nSwapsMax = Integer.parseInt(pmmStrings[1]);
        p3sblenMin = Integer.parseInt(pmmStrings[2]);
        p4sbLenMax = Integer.parseInt(pmmStrings[3]);
        p5jmpMin = Integer.parseInt(pmmStrings[4]);
        p6jmpMax = Integer.parseInt(pmmStrings[5]);
        p7strLength = Integer.parseInt(pmmStrings[6]);
        sorted = "";
    }

    public testSEARCH() {
        
    }

    

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
        p6jmpMax = 6;
    }
    public void testSH4(){
        p1nSwapsMin = 1; 
        p2nSwapsMax = 91; 
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
        p2nSwapsMax = 21; 
    }
    
    public void tsP105cash() {
        p5jmpMin = 1;
        p6jmpMax = 1;
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
        String hold3, hold2 = suiQP, tail = "";
        char rep;
        int sAmount, nN, idx = 0;
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
     * This method finds a character in a second string
     * That does not appear in the first
     * 
     * So the cd is a character variable that is by default
     * '!' 
     * so the first while condition passes.
     * iChar is a character that counts the index character 
     * of the string.
     * rep is the character of the index of iChar and the second
     * string is then cleared of all characters that are the same as rep
     * After the reps are replaced h2ndAmount is the difference of h2nd 
     * before the replacement and after the replacement.
     * The same happends to h1stAmount.
     * If the resulting stringlength of h2nd is more than h1st
     * the method should return the character that resulted in this
     * situation as this is the character in the second string that
     * is in the second but not in the first. 
     * @param h2nd The second string to find a character 
     * @param h1st The first string 
     * @return Character that is in the second string but not in the first
     */
    public char cFinddif(String h2nd, String h1st) {
        RRRMathAPI mapi = new RRRMathAPI();
        char rep, cd = '!';
        String t2nd = h2nd, t1st = h1st;
        int  h1stAmount, h2ndAmount, iChar = 0, N = h1st.length();
        while (cd == '!' ) {
                rep = t2nd.charAt(mapi.MinClamp(iChar, 0));
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
     * Checks if string is palindrome
     * @param pali Potential palindrome
     * @return true if the string is a palindrome and false otherwise
     */
    public static boolean isPali(String pali) {
        int j;
        for (int i = 0; i < pali.length()/2; i++) {
            j = (pali.length()) - 1 - i;
            if(pali.charAt(i) != pali.charAt(j)) {
                return false;
            }
        }
        return true;
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

    /**
     * Starts with method. This method takes a string and checks if it 
     * Starts with a different character sequence
     * 
     * If the string starts with the sequence specified then the 
     * reverse of the string should be retured and vice versa
     *  
     * @param ch1 Character sequence equivalent
     * @param h1 String
     * @return reverse of String or the String 
     */
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


    /**
     * This method takes the hold second as lne and if the corresponding
     * digit in hold1st is correct it edits the string so that the program 
     * leaves it alone.
     * This version of the method returns the altered string with 'n' 
     * replacements.
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
     * This method checks if the algorhythm should search and should terminate after one swap.
     * 
     * The SameSamen method swaps all the character of hold1st and hold2nd that are the same
     * of hold2nd with 'n'.
     * popf and pop is used to swap the characters at the current index called j.
     * The method should terminate if both the second half and first half equals 
     * a palindrome.
     * pc1 and pc2 are then two characters that don't apear in the respected halfs of
     * the potential quazipalindrome.
     * If no character is found that differs in the first hald and second half 
     * a version of one of the halves should be returned.
     * 
     * @param holdFrst The first half of a potential quazipalindrome string
     * @param holdSecH The second half of a potential quazipalindrome string
     * @param jumpMax Maximum jump length
     * @param c1 The current character that the second string contains but the first one doesn't
     * @param c2 The current character that the first string contains but the second one doesn't
     * @return half of the constructed palindrome
     */
    public String oneSwapleft (String holdFrst, String holdSecH, int jumpMax, char c1, char c2) {
        RRRMathAPI mapi = new RRRMathAPI();
        String hold1st = holdFrst, nshold2nd, hold2nd = holdSecH ;
        StringBuilder pop = new StringBuilder(hold2nd), popf;
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        char pc1, pc2;
        int N = hold1st.length(), jIdx = mapi.MinClamp(jumpMax - 1, 0);
        if(p8QP.length() % 2 == 0) {
            jIdx--;
        }
        
        for (int j = mapi.MinClamp((jIdx*2) - jumpMax*2, 0); j < N; j ++) {            
            nshold2nd = SameSamen(hold2nd, hold1st);
            if(hold1st.charAt(j) == c2 || nshold2nd.charAt(j) == 'n') {
                if(j + 1 >= N) {
                    break;
                }
                j ++;
            }
            popf = new StringBuilder(hold1st);
            popf.setCharAt(j, c2);
            hold1st = popf + "";
            
            if(isPali(hold1st) && hold1st.equals(hold2nd)){
                return hold1st;
            }
        
            for (int i = jIdx; i >= p5jmpMin - 1; i--) {        
                if(hold2nd.charAt(i) == c1|| nshold2nd.charAt(i) == 'n') {
                    if(i -1 == -1) {
                        break;
                    }
                    i--;
                }
                pop.setCharAt(i, c1);
                hold2nd = pop + "";

                pc1 = cFinddif(hold1st, hold2nd);
                pc2 = cFinddif(hold2nd, hold1st);
                if(pc1 == pc2 && pc1 == '!' ){
                    if(isPali(hold1st) && cntSame(hold1st, holdFrst) == 0 ){
                        return hold1st;
                    } else if (isPali(hold2nd)) {
                        return hold2nd;
                    } else if (hold1st.equals(ssapi.sReverse(hold2nd))) {
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
    public String makeSecondHalf(String srapiQP, String holdFrst, String holdSecH, int jumpMax) {        
        RRRMathAPI mapi = new RRRMathAPI();
        String hold1st, hold2nd, swap1l, chStr2nd, chStr1st;
        StringBuilder pop, popf;
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        char c1, c2;
        int cIdx1st, cIdx2nd;
        jumpMax = mapi.MinClamp(jumpMax, 1);
        //Why this ^ 
        hold1st = holdFrst;
        hold2nd = holdSecH;
        p8QP = srapiQP;
        c1 = cFinddif(hold1st, hold2nd);
        c2 = cFinddif(hold2nd, hold1st);
        chStr2nd = hold2nd.substring(0, (hold2nd.length()/2) + 1);
        chStr1st = hold1st.substring(0, (hold1st.length()/2) + 1);
        if(c1 == c2 && c1 == '!' ) {
            if(p6jmpMax == 1) {
                return hold2nd;
            } 
            if(isPali(hold1st)) {
                return hold1st;
            } else if(isPali(hold2nd)) {
                return hold2nd;
            } else if(hold2nd.equals(ssapi.sReverse(hold1st))) {
                return hold2nd;
            }
            swap1l = endsWith(chStr2nd, hold2nd, hold1st);
            if(!swap1l.equals("x")){
                return swap1l;
            }
            swap1l = stWith(chStr1st, hold1st);
            if(!swap1l.equals("x")){
                return swap1l;
            }
            if(p8QP.charAt(p8QP.length() - 1) == hold2nd.charAt(hold2nd.length() - 1)){
                return hold2nd;
            } else {
                return ssapi.sReverse(hold2nd);
            }
        } if( p6jmpMax > 1) {
            swap1l = oneSwapleft(holdFrst, holdSecH, jumpMax, c1, c2);
            if(!swap1l.equals("x")){
                return swap1l;
            }
            cIdx2nd = hold2nd.lastIndexOf(c2);
            cIdx1st = hold1st.indexOf(c1);
            if(cIdx1st != 0) {
            cIdx1st = hold1st.lastIndexOf(c1);
            }
            pop = new StringBuilder(hold2nd);            
            pop.setCharAt(cIdx2nd, c1);
            hold2nd = pop + "";
            popf = new StringBuilder(hold1st);
            popf.setCharAt(cIdx1st, c2);
            hold1st = popf + "";
        } else {
            cIdx2nd = hold2nd.indexOf(c2);
            pop = new StringBuilder(hold2nd);
            pop.setCharAt(cIdx2nd, c1);
            hold2nd = pop + "";
            cIdx1st = hold1st.indexOf(c1);
            popf = new StringBuilder(hold1st);
            popf.setCharAt(cIdx1st, c2);
            hold1st = popf + "";
        }
        return makeSecondHalf(srapiQP, hold1st, hold2nd, jumpMax);
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
    public String mkPali(String suiQP, int jMax) {
        int jumpMax = (jMax/2);
        String tail = "";
        String hold3 = suiQP;
        String revf, revS;
        String holdFrst, holdSecH;
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
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
                revf = ssapi.sReverse(revS);
                return revf + tail + revS;
            }
             revf = holdFrst;
             revS = ssapi.sReverse(holdSecH);
            return revf + tail + revS;
        }    
        revS = makeSecondHalf(suiQP, holdFrst, holdSecH, jumpMax);
        revf = ssapi.sReverse(revS);
        return revf + tail + revS;
    }

    /**
     * smlJumpL small jump length makeMap
     * 
     * This method will activate if the if the jumplength is small or if there
     * is problems with the jump length. 
     * @param lne String entered for the palindrome program
     * @param pali Palindrome made from the quazipalindrome
     * @param sComAr numbered Comparable array
     * @return Mapped comparable array (null if there are to manny swaps) 
     */
    public String[] smlJumpL(String lne, String pali, Comparable[] sComAr, int dosJmx) {
        RRRArrayFunctions raf = new RRRArrayFunctions();
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        RRRSortingAPI rsapi = new RRRSortingAPI();
        String mmPali = pali, nsLn = lne, mapStr, smapStr;
        StringBuilder nsbLn, nsbPali;
        String[] swapsOutput = new String[lne.length()];
        Comparable[] arrI = new Comparable[sComAr.length];
        int ip2, ip1, swapC = 0, N = lne.length(), j;
        char pop2;
        raf.CopyEmutCom(sComAr, arrI);
        nsLn = ssapi.SameSame(nsLn, mmPali);
        nsbLn = new StringBuilder(nsLn);
        nsbPali = new StringBuilder(pali);
        for (int i = 0; i < N; i++) {
            if(nsLn.charAt(i) != '-') {
                pop2 = mmPali.charAt(i);
                j = i + dosJmx;
                mapStr = ssapi.printStr(arrI, nsLn);
                ip2 = rsapi.getP2sj(mapStr, pop2, j, i, dosJmx);
                if(ip2 != -1 ){
                    mapStr = ssapi.printStr(arrI, nsLn);
                    while(mapStr.charAt(i) != mmPali.charAt(i)) {
                        ip2 = rsapi.getP2sj(mapStr, pop2, j, i, dosJmx);
                        ip1 = mmPali.indexOf(pop2);
                        if(Math.abs(ip2 - ip1) > dosJmx) {
                            ip1 = ip2 - dosJmx;
                        }
                        if(mapStr.charAt(ip1) == '-'){
                            ip1 = i;
                        }
                        rsapi.exch(arrI, ip2, ip1);
                        swapsOutput[swapC] = "(" + ip1 + "," + ip2 + ")"; 
                        mapStr = ssapi.printStr(arrI, nsLn);
                        smapStr = ssapi.printStr(arrI, lne);
                    
                        if(smapStr.equals(pali)) {
                            swapsOutput[swapsOutput.length - 1] = swapC + "";
                            return swapsOutput;
                        }
                        swapC = swapC + 1;
                        if(swapC > Math.min(p2nSwapsMax, N)) {
                            return null;
                        }
                    }
                    for(int i3 = i; i3 < N; i3 ++) {
                        if(mapStr.charAt(i3) == mmPali.charAt(i3)) {
                            nsbLn.setCharAt(i3, '^');
                            nsLn = nsbLn + "";
                            nsbPali.setCharAt(i3, '!');
                            mmPali = nsbPali + "";
                        }
                    }
                } 
            }
        }
        return swapsOutput;
    }


    /**
     * Better algorythm to make the map sequence 
     * SwapC is Swap count variable
     * nsLine for (not same line) is a String of the quazipalindrome 
     * where all the digits in the quazipalindrome that are the same
     * as the palindrome are replaced with dashes 
     * ex  let's say the string is  "TACGTACGGCAGCA" the palindrome is 
     *                              "ACGACGTTGCAGCA" 
     * nsLine is TACGTACG------
     * nsbLine is the string builder of nsLine. 
     * smapStr is for stopmap string. It will be checked to see if the
     * algorhythm should terminate.
     * End string(EndStr) is then a temperarry equivalent of nsLine
     * All the dashes is then removed.
     * idxx is then the first index(rank) of the character in the quazipalindrome
     * That rank is then stored in what should be the bijection map
     * of where the digit went from the QP to the Pali
     * 
     * nsLine.substring(6,7) = "G" we want two
     * ->p6jmpMax + i + 1
     * @param lne String entered for the palindrome program
     * @param pali Palindrome made from the quazipalindrome
     * @param sComAr numbered Comparable array
     * @return Mapped comparable array (null if there are to manny swaps) 
     */
    public String[] cMakeMpP58(String lne, String pali, Comparable[] sComAr, int dosJmx) {
        RRRArrayFunctions raf = new RRRArrayFunctions();
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        RRRSortingAPI rsapi = new RRRSortingAPI();
        String nsLn = lne, mmPali = pali, smapStr = "]]]]]]]]]";
        StringBuilder nsbLn, nsbPali;
        String[] swapsOutput = new String[lne.length()];
        Comparable[] arrI = new Comparable[sComAr.length];
        int ip2, ip1, swapC = 0, N = lne.length(), j;
        char curChar, ch1, ch2;
        raf.CopyEmutCom(sComAr, arrI);
        nsLn = ssapi.SameSame(nsLn, mmPali);
        mmPali = ssapi.SameSameCap(mmPali, lne);
        nsbLn = new StringBuilder(nsLn);
        nsbPali = new StringBuilder(mmPali);
        for (int i = 0; i < N; i++) {
            if(nsLn.charAt(i) != '-' ) {
                smapStr = ssapi.printStr(arrI, lne);
                curChar = smapStr.charAt(i);
                j = i + dosJmx;
                ip2 = rsapi.getP2bj(mmPali, curChar, j, i, dosJmx);
                ip1 = nsLn.indexOf(curChar);
                if(Math.abs(ip2 - ip1) > dosJmx) {
                    ip1 = ip2 - dosJmx;
                }  
                if(ip2 < ip1) {
                    int holdp12 = ip1;
                    ip1 = ip2;
                    ip2 = holdp12;
                }
                while(true){
                    rsapi.exch(arrI, ip2, ip1);
                    swapsOutput[swapC] = "(" + ip1 + "," + ip2 + ")"; 
                    swapC++;
                    smapStr = ssapi.printStr(arrI, lne);                    
                    if(smapStr.equals(pali)){
                        swapsOutput[swapsOutput.length - 1] = swapC + "";
                            return swapsOutput;
                    }
                    ch1 = mmPali.charAt(mmPali.indexOf(curChar));
                    ch2 = smapStr.charAt(mmPali.indexOf(curChar));
                    if(ch1 == ch2){
                        break;
                    }                
                    return smlJumpL(lne, pali, sComAr, dosJmx);
                }
                    nsLn = smapStr;
                    nsbLn = new StringBuilder(nsLn);
                   for(int i3 = i; i3 < N; i3 ++) {
                        if(smapStr.charAt(i3) == pali.charAt(i3)) {
                            nsbLn.setCharAt(i3, '-');
                            nsLn = nsbLn + "";
                            nsbPali.setCharAt(i3, '^');
                            mmPali = nsbPali + "";
                        }
                    }
                } else {
                    if(i > 0) {
                        if(nsLn.charAt(i-1) != '-'){
                            i = i -2;
                        }
                    }
                }
        }
        return swapsOutput;
    }

    public String[] cMakeMpP59(String lne, String pali, Comparable[] sComAr, int dosJmx) {
        RRRArrayFunctions raf = new RRRArrayFunctions();
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        RRRSortingAPI rsapi = new RRRSortingAPI();
        String nsLn = lne, mmPali = pali, smapStr = "]]]]]]]]]",subhelp;
        StringBuilder nsbLn, nsbPali;
        String[] swapsOutput = new String[lne.length()];
        Comparable[] arrI = new Comparable[sComAr.length];
        int ip2, ip1, swapC = 0, N = lne.length(), j;
        char curChar, ch1, ch2;
        raf.CopyEmutCom(sComAr, arrI);
        nsLn = ssapi.SameSame(nsLn, mmPali);
        mmPali = ssapi.SameSameCap(mmPali, lne);
        nsbLn = new StringBuilder(nsLn);
        nsbPali = new StringBuilder(mmPali);
        for (int i = 0; i < N; i++) {
            if(nsLn.charAt(i) != '-' ) {
                smapStr = ssapi.printStr(arrI, lne);
                curChar = smapStr.charAt(i);
                j = i + dosJmx;
                ip2 = rsapi.getP2bj(mmPali, curChar, j, i, dosJmx);
                ip1 = nsLn.indexOf(curChar);
                if(Math.abs(ip2 - ip1) > dosJmx) {
                    ip1 = ip2 - dosJmx;
                }  
                if(ip2 < ip1) {
                    int holdp12 = ip1;
                    ip1 = ip2;
                    ip2 = holdp12;
                }
                while(true){
                    rsapi.exch(arrI, ip2, ip1);
                    swapsOutput[swapC] = "(" + ip1 + "," + ip2 + ")"; 
                    swapC++;
                    smapStr = ssapi.printStr(arrI, lne);                    
                    if(smapStr.equals(pali)){
                        swapsOutput[swapsOutput.length - 1] = swapC + "";
                            return swapsOutput;
                    }
                    ch1 = mmPali.charAt(mmPali.indexOf(curChar));
                    ch2 = smapStr.charAt(mmPali.indexOf(curChar));
                    if(ch1 == ch2 ){
                        break;
                    }             
                    if(smapStr.charAt(i) == mmPali.charAt(i)){
                        break;
                    }   
                    return smlJumpL(lne, pali, sComAr, dosJmx);
                }
                    nsLn = smapStr;
                    nsbLn = new StringBuilder(nsLn);
                   for(int i3 = i; i3 < N; i3 ++) {
                        if(smapStr.charAt(i3) == pali.charAt(i3)) {
                            nsbLn.setCharAt(i3, '-');
                            nsLn = nsbLn + "";
                            nsbPali.setCharAt(i3, '^');
                            mmPali = nsbPali + "";
                        }
                    }
                } else {
                    if(i > 0) {
                        if(nsLn.charAt(i-1) != '-'){
                            i = i -2;
                        }
                    }

                }
        }
        return swapsOutput;
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

    enum HeadTail {
        Head, Tail
    }

    /**
     * Get the sorted string
     *
     * @return getSorted
     */
    public String getSorted() {
        return sorted;
    }

}
