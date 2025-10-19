public class PPTESTMethods {

    private int p1nSwapsMin;
    private int p2nSwapsMax;
    private int p3sblenMin;
    private int p4sbLenMax;
    private int p5jmpMin;
    private int p6jmpMax;
    private int p7strLength;


    public void testcase(){
        p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1;
        //p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 3; p6jmpMax = 6;
        //p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5;
        //p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 3; p6jmpMax = 6;
        //p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 1; p6jmpMax = 6;
        //p1nSwapsMin = 2; p2nSwapsMax = 4; p5jmpMin = 2; p6jmpMax = 7;

    }    

    public static void main(String[] args) throws Exception {
        PPTESTMethods qptm = new PPTESTMethods();
        RRRSortingAPI rsapi = new RRRSortingAPI();
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        testSEARCH tss = new testSEARCH();
        Comparable[] arrIdx;
        String rightOutput = "";        
        
        //MakeMap
        //String line = "AATTCC"; rightOutput = "(0,4) 1 "; String pali = "CATTAC"; int dosJmx = 5; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "GCGACA"; rightOutput = "(0,3) 1 "; String pali = "ACGGCA"; int dosJmx = 5; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testGCGACA();
        //String line = "TTAGAAA"; rightOutput = "(0,5) 1 "; String pali = "ATAGATA"; int dosJmx = 6; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testTTAGAAA();

        //String line = "TACGACGTGCAGCA"; rightOutput = "(0,1) (1,2) (2,3) (3,4) (4,5) (5,6) 5 "; String pali = "ACGACGTTGCAGCA"; int dosJmx = 1; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH4();
        //String line = "ACGACGTGCAGCAT"; rightOutput = "(5,6) (4,5) (3,4) (2,3) (1,2) (0,1) 5 "; String pali = "TACGACGGCAGCAT"; int dosJmx = 1; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH4();
        //String line = "TACGTACGGCAGCA"; rightOutput = "(0,1) (1,2) (2,3) (4,5) (3,4) (5,6) (4,5) (6,7) (5,6) 8 "; String pali = "ACGACGTTGCAGCA"; int dosJmx = 1; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH4();

        //String line = "TCAAGCCTGCATGGA"; rightOutput = "(0,3) (2,4) (6,13) 3 "; String pali = "ACGTACGTGCATGCA"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();

        //String line = "GTTCGC"; rightOutput = "(0,1) (0,3) 2 "; String pali = "CGTTGC"; int dosJmx = 5; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();
        //String line = "CATATGC"; rightOutput = "(3,5) 1 "; String pali = "CATGTAC"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();
        //String line = "CCCGTTC"; rightOutput = "(1,4) 1 "; String pali = "CTCGCTC"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();
        //String line = "CGCATAT"; rightOutput = "(0,4) (1,3) 2 "; String pali = "TACGCAT"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();
        //String line = "CGTTCGC"; rightOutput = "(3,4) 1 "; String pali = "CGTCTGC"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();
        //String line = "GCATATG"; rightOutput = "(1,3) 1 "; String pali = "GTACATG"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();
        //String line = "GTTCGCA"; rightOutput = "(0,2) (0,5) (3,6) 3 "; String pali = "CTGAGTC"; int dosJmx = 5; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();
        String line = "TCGCATA"; rightOutput = "(0,1) (0,4) (2,3) 3 "; String pali = "ATCGCTA"; int dosJmx = 5; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); tss.testSH5();

        
        //Comparable [] arrIdx2 = new Comparable[line.length()]; 
        //arrIdx2 = rsapi.flCompa(arrIdx, line.length()); 
        //rsapi.doSwaps(swpline, arrIdx2);
        //System.out.println(ssapi.printStr(arrIdx2, line));
        //String sPaLi = tss.mkPaliP56(line, dosJmx);
        //System.out.println(sPaLi + " " + sPaLi.equals(ssapi.printStr(arrIdx2, line)));
        //if( sPaLi.equals(ssapi.printStr(arrIdx2, line) ) ) {
        //    System.out.println("YAAAAAAATAAAAAAAA");
        //}
        
        String[] swaps = new String[line.length()]; 
        swaps = tss.cMakeMpP58(line, pali, arrIdx, dosJmx);

        System.out.println(ssapi.lstTARRAYString(swaps) + "|" + rightOutput );
        System.out.println(ssapi.lstTARRAYString(swaps).equals(rightOutput) );

    }//end main

//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111

    /**
     * This method tests if a certain String is a palindrome
     * It will loop until stringlength/2(integer devision) 
     * and see if i == stringlength - 1
     * @param Mpali (Maybe palindrome) 
     * @return true if string is a palindrome. false if not
     */
    public boolean isPalindrome( String Mpali) {
        int N = Mpali.length();
        for (int i = 0; i < N/2; i++) {
            if(Mpali.charAt(i) != Mpali.charAt((N-1-i))) {
                return false;
            }            
        }
    return true;        
    }

    /**
     * This method takes the substring array and does all the swap 
     * searching and printing. The idea is that if there shouldn't be 
     * substrings made then a string array with one entry will be used
     * That entry will just be a valid Quazi palindrome.
     * @implNote Put this in PPSearch
     */
    @SuppressWarnings("rawtypes")
    public void doAllSubs() {
        testSEARCH tss = new testSEARCH();
        //String[] subStrings = {"AGG", "GGA", "AGGA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 1; tss.tsP105cash();
        String[] subStrings = {"TACGTACGGCAGCA"}; p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1; tss.testSH4();
        //String[] subStrings = {"TACGACGTGCAGCA"}; p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1; tss.testSH4();
        //String[] subStrings = {"ACGACGTGCAGCAT"}; p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1;
        //String[] subStrings = {"AATTCC"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5; tss.testAATTCC();
        //String[] subStrings = {"AAT", "GCGACA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5; tss.testGCGACA();
        //String[] subStrings = {"AAT"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5;
        //String[] subStrings = {"GAA", "TTA","AGAAA","TTAGAAA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 6; tss.testTTAGAAA();
        //String[] subStrings = {"TTAGAAA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 3; p6jmpMax = 6;
        //String[] subStrings = {"TCAAGCCTGCATGGA"}; p1nSwapsMin = 2; p2nSwapsMax = 4; p5jmpMin = 2; p6jmpMax = 7; tss.testSpecial();
        
        //String[] subStrings = {"ACC", "CCG", "GTT", "TTC", "ATAT", 
        //"ATATG", "CATAT", "CCGTT", "CGTTC", "GTTCG", 
        //"TTCGC", "CGTTCG", "GTTCGC", "CATATGC", "CCCGTTC", 
        //"CCGTTCG", "CGCATAT", "CGTTCGC", "GCATATG", "GTTCGCA", "TCGCATA"}; 
        //p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 3; p6jmpMax = 7; tss.testSH5();
        //String[] subStrings = {"GTTCGC"}; 
        //p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 3; p6jmpMax = 7; tss.testSH5();
        //String[] subStrings = {"ATATG"}; p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 3; p6jmpMax = 7;

        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        RRRMathAPI mapi = new RRRMathAPI();
        RRRSortingAPI rsapi = new RRRSortingAPI();
        int dosJmx =p6jmpMax;
        tPPSEARCH sqp = new tPPSEARCH();
        String line, pali, gr;
        Comparable[] comLines;
        String[] arrSwps;

        for (String subString : subStrings) {
            line = subString;
            sqp.groupPairs(line);
            gr = sqp.getSorted();
            if(isQPorP(gr)) {
                dosJmx = mapi.MaxClamp(dosJmx, line.length());
                pali = tss.mkPaliP56(line, dosJmx);
                System.out.println(line + " " + pali  );
                arrSwps = new String[line.length()];
                comLines = new Comparable[line.length()];
                comLines = rsapi.flCompa(comLines, line.length());
                //arrSwps = cMakeMpP58(line, pali, comLines, dosJmx);
                //System.out.println(ssapi.lstTARRAYString(arrSwps));
                //dosJmx = p6jmpMax;
            }
        }
    }
    
//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111    


//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111

    
    /**
     * This function checks if the entered string is either
     * a Quazi palindrome or a normal palindrome.
     * 
     * So looking at a quizi palindrome. The digits that is in the coresponding
     * palindrome together with all the other digits in the same palindrome
     * is either a uneven number or is unique. So a palindrome in a sense 
     * is a defferent arangement of even groups of digits except for the middle
     * one if the digit amount is odd.
     * So this function identifies this middle digit and calls it tail.
     * It then seperates this tail from the rest of the digits and then merely checks 
     * if the rest of the digits are in even groups
     * @param gr grouped String for easy checking.
     * @return True if entered String is either a quazi or normal palindrome.
     */
    public boolean isQPorP( String gr){
        char tail;
        String dubString;
        boolean pairs;
        boolean even = gr.length() % 2 == 0;
        dubString = gr;
        tail = dubString.charAt(dubString.length() - 1);
        pairs = tail == dubString.charAt(dubString.length() - 2);
        if (even) {
            return pairs;
        } else {
            dubString = gr.substring(0, dubString.length() - 1);
            tail = dubString.charAt(dubString.length() - 1);
            pairs = tail == dubString.charAt(dubString.length() - 2);
            return dubString.length() % 2 == 0 && pairs;
        }
    }
    
    ///**
    // * This function tests weather the program should split the function
    // * into different substrings.
    // * @return
    // */
    //public boolean BreakApartString() {
    //    int submin = 3, stringlength = 4;
    //    if (submin < stringlength) {
    //        return true;
    //    }
    //    return false;
    //}
    
    /**
     * For speed of development this chooses a spesific function to 
     * run according to the complexity of the request entered
     * This way I can edit the method without it causing errors in semi working
     * code.
     * @param lne QP
     * @param pali Palindrome
     * @param sComAr numbered Comparable array
     * @return
     */
    public Comparable[] chMakeMp(String lne, String pali, Comparable[] sComAr, int dosMax ) {
        Comparable[] arrI = new Comparable[sComAr.length];
        if(p6jmpMax == 1) {
            //arrI = cMakeMp(lne, pali, sComAr);
            arrI = cMakeMpP57(lne, pali, sComAr,dosMax);
            return arrI;
        } 
        if(p1nSwapsMin > 1) {
            arrI = cMakeMpP57(lne, pali, sComAr,dosMax);
            return arrI;
        } else {
            arrI = cMakeMpP57(lne, pali, sComAr,dosMax);
            return arrI;
        }
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
    public String[] cMakeMpP57(String lne, String pali, Comparable[] sComAr, int dosJmx) {
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
            if( i == 3) {
                i = 3;
            }
            if(nsLn.charAt(i) != '-') {
                pop2 = mmPali.charAt(i);
                j = i + dosJmx;
                if(i == 4) {
                    i = 4;
                }
                mapStr = ssapi.printStr(arrI, nsLn);
                ip2 = rsapi.getP2(mapStr, pop2, j, i, dosJmx);
                if(ip2 != -1 ){
                    mapStr = ssapi.printStr(arrI, nsLn);
                    while(mapStr.charAt(i) != mmPali.charAt(i)) {
                        ip2 = rsapi.getP2(mapStr, pop2, j, i, dosJmx);
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
        //if(mapStr.charAt(i) == mmPali.charAt(i)) will be true
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
        String mmPali = pali, nsLn = lne, mapStr, smapStr = "]]]]]]]]]";
        StringBuilder nsbLn, nsbPali;
        String[] swapsOutput = new String[lne.length()];
        Comparable[] arrI = new Comparable[sComAr.length];
        int ip2, ip1, swapC = 0, N = lne.length(), j;
        char curChar;

        raf.CopyEmutCom(sComAr, arrI);
        nsLn = ssapi.SameSame(nsLn, mmPali);
        mmPali = ssapi.SameSameCap(mmPali, lne);
        nsbLn = new StringBuilder(nsLn);
        nsbPali = new StringBuilder(pali);
        for (int i = 0; i < N; i++) {
            if(nsLn.charAt(i) != '-' ) {
            mapStr = ssapi.printStr(arrI, nsLn);
            smapStr = ssapi.printStr(arrI, lne);
            curChar = mapStr.charAt(i);
              j = i + dosJmx;
              ip2 = rsapi.getP2P58(mmPali, curChar, j, i, dosJmx);
              ip1 = mapStr.indexOf(curChar);
                if(Math.abs(ip2 - ip1) > dosJmx) {
                    ip1 = ip2 - dosJmx;
                }  
                while(true){
                    rsapi.exch(arrI, ip2, ip1);
                    swapsOutput[swapC] = "(" + ip1 + "," + ip2 + ")"; 
                    swapC++;
                    System.out.println(ip1 + " " + ip2);
                    mapStr = ssapi.printStr(arrI, nsLn);
                    smapStr = ssapi.printStr(arrI, lne);
                    
                    if(smapStr.equals(pali)){
                        swapsOutput[swapsOutput.length - 1] = swapC + "";
                            return swapsOutput;
                    }
                if(mmPali.charAt(mmPali.indexOf(curChar)) == smapStr.charAt(mmPali.indexOf(curChar))){
                    break;
                }
                    return cMakeMpP57(lne, pali, sComAr, dosJmx);
                    //ip2 = rsapi.getP2(mmPali, curChar, j, i, dosJmx);
                    //ip1 = mapStr.indexOf(curChar);
                }
                   for(int i3 = i; i3 < N; i3 ++) {
                        if(smapStr.charAt(i3) == mmPali.charAt(i3)) {
                            nsbLn.setCharAt(i3, '-');
                            nsLn = nsbLn + "";
                            nsbPali.setCharAt(i3, '^');
                            mmPali = nsbPali + "";
                        }
                    }
              if(ip2 != -1){
                
              }
            }
        }
        return swapsOutput;
    }

    /**
     * This takes a string and removes dashes '-' and hates '^' from it and 
     * returns true if the resulting string is equal to ""
     * mmBreakL is an acronym for Make Map Break Loop
     * This function is made so that it is easier to understand why there is a
     * return statement in the for loop
     * 
     * @param blnsLn break Loop not same Line
     * @return True is blnsLn is "" and false otherwise
     */
    public boolean mmBreakL(String blnsLn) {
        String blStr = blnsLn;
        blStr = blStr.replace("-", "");
        blStr = blStr.replace("^", "");
        return blStr.equals("");
    }


    /**
     * Phaze5
     * This method compares the i'th digit of the mapped array and a sequentially
     * index counted array and sequentially changes the sequential array to look
     * like the mapped array and saves the swaps as entries in a string array
     * p1(first position) is gotten by reffering to the iteration number's index
     * in the sequential array or if the difference between p2 and p1 is too large
     * p1 is just equal p2 minus the clamped jumpLength
     * @param arPSSwp PartialSwap Swap array
     * @param arPSS PartialSwap Sequencial comparable array
     * @param arPSMp PartialSwap mapped array
     */
    public void vPSwp(String[] arPSSwp, Comparable[] arPSS, Comparable[] arPSMp, int jMax) {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        String strMapped, strfU;
        int i = 0, i2 = 0, jmPmX = jMax, diff, p2, p1, node;
        while (true) {
            diff = Math.abs((int) arPSMp[i] - (int) arPSS[i]);
            if (diff > 0) {
                node = (int) arPSMp[i];
                while (!rsapi.cEqual(arPSS[i], arPSMp[i]) && i2 < arPSSwp.length) {
                    p2 = cRank(arPSS, node);
                    p1 = getP1(((int) arPSS[i]), p2, jmPmX);
                    rsapi.exch(arPSS, p2, p1);
                    arPSSwp[i2] = "(" + p1 + "," + p2 + ")->" + i2;
                    i2 = i2 + 1;
                }
                strfU = ssapi.printCode(arPSS);
                strMapped = ssapi.printCode(arPSMp);
                //Maybe use a is array = other array method.
                if (strfU.equals(strMapped)) {
                    arPSSwp[arPSSwp.length - 1] = i2 + "";
                break;
                }
            } else if (diff == jmPmX) {
                arPSS[i] = arPSMp[i];
            }
            i++;
            if (i >= arPSMp.length ) {
                break;
            }
        }
    }//endVswp    
//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111


/**
 * This function checks if the difference between 2 integers p1Pos1 and p1Pos2 
 * is larger than the maxinum of what a jump should be and if it is the output
 * is given as what p1 should be and that is p2 minus jumpMax
 */
public static int getP1(int p1Pos1, int p1Pos2, int dosMax){
    if((p1Pos2 - p1Pos1) > dosMax) {
        return p1Pos2 - dosMax;
    }
    return p1Pos1;
}


/**
 * If value of an array entry is known and the index of
 * that entry is required this searching algorythm searches
 * the array untill it finds the value and returns the corrosponding 
 * index
 * @param carr
 * @param value
 * @return
 */
public int cRank(Comparable[] carr, int value) {
    int count = 0;
    while(value != (int) carr[count]) {
        count++;
    }
    return count;
}
    


}//End class
////(0,1)
