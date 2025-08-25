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
        Comparable[] arrIdx;
        //String line = "AATTCC"; String pali = "CATTAC"; int dosJmx = 5; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "AAT"; String pali = "ATA"; int dosJmx = 5; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "TTAGAAA"; String pali = "ATAGATA"; int dosJmx = 6; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();

        //String line = "TACGACGTGCAGCA"; String pali = "ACGACGTTGCAGCA"; int dosJmx = 1; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "ACGACGTGCAGCAT"; String pali = "TACGACGGCAGCAT"; int dosJmx = 1; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "TACGTACGGCAGCA"; String pali = "ACGACGTTGCAGCA"; int dosJmx = 1; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();

        //String line = "TCAAGCCTGCATGGA"; String pali = "ACGTACGTGCATGCA"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "TCAAGCCTGCATGGA"; String rpali = "ACGTACGTGCATGCA"; int dosJmx = 7; arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();


        //String line = "AGAG"; String swpline = "{AGAG=[(0,1)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();        
        //String line = "AATTCC"; String swpline = "{AATTCC=[(0,4)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();        
        //String line = "GCGACA"; String swpline = "{GCGACA=[(0,3)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();        
        //String line = "AGAAA"; String swpline = "{AGAAA=[(1,2)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "TTAGAAA"; String swpline = "{TTAGAAA=[(0,5)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        
        //String line = "TACGACGTGCAGCA"; String swpline = "{TACGACGTGCAGCA=[(0,1), (1,2), (2,3), (3,4), (4,5), (5,6)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "ACGACGTGCAGCAT"; String swpline = "{ACGACGTGCAGCAT=[(5,6), (4,5), (3,4), (2,3), (1,2), (0,1)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "TACGTACGGCAGCA"; String swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5), (3,4), (5,6), (4,5), (6,7), (5,6)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        String line = "TCAAGCCTGCATGGA"; String swpline = "{TCAAGCCTGCATGGA=[(0,3), (2,4), (6,13)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();        
        
        //String line = "GTTCGC"; String swpline = "{GTTCGC=[(0,1), (0,3)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "CATATGC"; String swpline = "{CATATGC=[(3,5)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();
        //String line = "CCCGTTC"; String swpline = "{CCCGTTC=[(1,4)]}"; int dosJmx = line.length(); arrIdx = new Comparable[line.length()]; arrIdx = rsapi.flCompa(arrIdx, line.length()); qptm.testcase();


        Comparable [] arrIdx2 = new Comparable[line.length()]; arrIdx2 = rsapi.flCompa(arrIdx, line.length()); rsapi.doSwaps(swpline, arrIdx2);System.out.println(rsapi.printStr(arrIdx2, line));
        
        String pali = rsapi.mkPaliP56(line, dosJmx);
        System.out.println(pali + " " + pali.equals(rsapi.printStr(arrIdx2, line)));
        if( pali.equals(rsapi.printStr(arrIdx2, line) ) ) {
            System.out.println("YAAAAAAATAAAAAAAA");
        }
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
        //String[] subStrings = {"AGG", "GGA", "AGGA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 1;
        //String[] subStrings = {"TACGTACGGCAGCA"}; p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1;
        //String[] subStrings = {"TACGACGTGCAGCA"}; p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1;
        //String[] subStrings = {"ACGACGTGCAGCAT"}; p1nSwapsMin = 1; p2nSwapsMax = 91; p5jmpMin = 1; p6jmpMax = 1;
        //String[] subStrings = {"AATTCC"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5;
        //String[] subStrings = {"AAT", "GCGACA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5;
        //String[] subStrings = {"AAT"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 5;
        //String[] subStrings = {"GAA", "TTA","AGAAA","TTAGAAA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 1; p6jmpMax = 6;
        //String[] subStrings = {"TTAGAAA"}; p1nSwapsMin = 1; p2nSwapsMax = 1; p5jmpMin = 3; p6jmpMax = 6;
        String[] subStrings = {"TCAAGCCTGCATGGA"}; p1nSwapsMin = 2; p2nSwapsMax = 4; p5jmpMin = 2; p6jmpMax = 7;
        
        //String[] subStrings = {"ACC", "CCG", "GTT", "TTC", "ATAT", 
        //"ATATG", "CATAT", "CCGTT", "CGTTC", "GTTCG", 
        //"TTCGC", "CGTTCG", "GTTCGC", "CATATGC", "CCCGTTC", 
        //"CCGTTCG", "CGCATAT", "CGTTCGC", "GCATATG", "GTTCGCA", "TCGCATA"}; 
        //p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 3; p6jmpMax = 7;

        //String[] subStrings = {"ATATG"}; p1nSwapsMin = 1; p2nSwapsMax = 21; p5jmpMin = 3; p6jmpMax = 7;


        RRRStringstuffAPI ssapi = new RRRStringstuffAPI();
        RRRSortingAPI rsapi = new RRRSortingAPI();
        int dosJmx =p6jmpMax;
        tPPSEARCH sqp = new tPPSEARCH();
        String line, pali, gr;
        Comparable[] comLines, mapped, cmSqSwap;
        String[] arrSwps;
        for (String subString : subStrings) {
            line = subString;
            sqp.groupPairs(line);
            gr = sqp.getSorted();
            if(isQPorP(gr)) {
                dosJmx = rsapi.MaxClamp(dosJmx, line.length());
                pali = rsapi.mkPaliP56(line, dosJmx);
                arrSwps = new String[line.length()];
                comLines = new Comparable[line.length()];
                comLines = rsapi.flCompa(comLines, line.length());
                cmSqSwap = rsapi.flCompa(comLines, line.length());
                //mapped = chMakeMp(line, pali, comLines, dosJmx);
                mapped = cMakeMpP57(line, pali, comLines, dosJmx);                
                //System.out.println(rsapi.printStr(mapped, line));
                //System.out.println(rsapi.printCode(mapped));

                //chVPSwp(arrSwps, cmSqSwap, mapped, dosJmx);        
                vPSwp(arrSwps, cmSqSwap, mapped, dosJmx);
                //ssapi.print100Line();
                //System.out.println("Line: " + line);
                //System.out.println("pali: " + pali);
                System.out.println(ssapi.lstTARRAYString(arrSwps));
                dosJmx = p6jmpMax;
            }
        }
    }

//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111
    /**
     * There are different make palindrome methods depending on the parameters
     * entered by the user. This function chooses the right one
     * @param ln The sub string and or Quazi Palindrome
     * @param jmn The jump minimum
     * @param jmx The jump maximum
     * @return The palindrome
     */
    public String choosePali(String ln, int jmx) {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        if(p2nSwapsMax == 21) {

            return rsapi.mkPaliP56(ln,jmx);
        } else {
            return rsapi.mkPaliP56(ln,jmx);
        }
    }

    
//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111    
    /**
     * Chooses the correct VPSwp to do
     * So a range of jump intervals should be tried to get the entered number of swaps
     * So if there should be one swap as an example the number of swaps is obtained
     * from the last entry in the Sw array 
     * and it redoes the method until the correct number of swaps is achieved.
     * @implNote the parameters are too long but this will happen in the PPSearch class
     * which has these parameters as instance variables.
     * @param Sw Array containing multiple swappes
     * @param Sq Sequantial Comparable array
     * @param mP Mapped Comparable array
     * @param jMx jump Maximum
     * @param sMx Swap Maximum
     * @param me Refference to self to be able to edit multiple variables in one method.
     */

    public void chVPSwp(String[] Sw, Comparable[] Sq, Comparable[] mP, int dosMax) {    
        //int nmrSwaps = 0;
        //RRRSortingAPI rsapi = new RRRSortingAPI();
        if(p1nSwapsMin > 1 && p5jmpMin > 1) {
            vPSwp(Sw, Sq, mP, dosMax);
        } else {
            vPSwp(Sw, Sq, mP, dosMax);
        }
    }


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
        RRRSortingAPI rsapi = new RRRSortingAPI();
        String mmPali = pali, nsLn = lne, mapStr, smapStr;
        StringBuilder nsbLn, nsbPali;
        String[] swapsOutput = new String[lne.length()];
        Comparable[] arrI = new Comparable[sComAr.length];
        int ip2, ip1, swapC = 0, N = lne.length(), j;
        char pop2;

        raf.CopyEmutCom(sComAr, arrI);
        nsLn = SameSame(nsLn, mmPali);
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
                mapStr = rsapi.printStr(arrI, nsLn);
                ip2 = rsapi.getP2(mapStr, pop2, j, i, dosJmx);
                if(ip2 != -1 ){
                    mapStr = rsapi.printStr(arrI, nsLn);
                    while(mapStr.charAt(i) != mmPali.charAt(i)) {
                        ip2 = ip2 = rsapi.getP2(mapStr, pop2, j, i, dosJmx);
                        ip1 = mmPali.indexOf(pop2);
                        if(Math.abs(ip2 - ip1) > dosJmx) {
                            ip1 = ip2 - dosJmx;
                        }
                        rsapi.exch(arrI, ip2, ip1);
                        swapsOutput[swapC] = "(" + ip1 + "," + ip2 + ")"; 
                        mapStr = rsapi.printStr(arrI, nsLn);
                        smapStr = rsapi.printStr(arrI, lne);
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
                strfU = rsapi.printCode(arPSS);
                strMapped = rsapi.printCode(arPSMp);
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
