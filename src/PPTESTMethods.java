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
        //String sPaLi = tss.mkPali(line, dosJmx);
        //System.out.println(sPaLi + " " + sPaLi.equals(ssapi.printStr(arrIdx2, line)));
        //if( sPaLi.equals(ssapi.printStr(arrIdx2, line) ) ) {
        //    System.out.println("YAAAAAAATAAAAAAAA");
        //}
        
        String[] swaps = new String[line.length()]; 
        swaps = tss.cMakeMpP59(line, pali, arrIdx, dosJmx);

        System.out.println(ssapi.lstTARRAYString(swaps) + "|" + rightOutput );
        System.out.println(ssapi.lstTARRAYString(swaps).equals(rightOutput) );

    }//end main

//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111


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
        testSEARCH sqp = new testSEARCH();

        String line, pali, gr;
        Comparable[] comLines;
        String[] arrSwps;

        for (String subString : subStrings) {
            line = subString;
            sqp.groupPairs(line);
            gr = sqp.getSorted();
            if(isQPorP(gr)) {
                dosJmx = mapi.MaxClamp(dosJmx, line.length());
                pali = tss.mkPali(line, dosJmx);
                System.out.println(line + " " + pali  );
                arrSwps = new String[line.length()];
                comLines = new Comparable[line.length()];
                comLines = rsapi.flCompa(comLines, line.length());
                //arrSwps = cMakeMpP58(line, pali, comLines, dosJmx);
                //System.out.println(ssapi.lstTARRAYString(arrSwps));
                dosJmx = p6jmpMax;
            }
        }
    }
        
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
//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111
        char tail;
        String dubString;
        boolean pairs, even = gr.length() % 2 == 0;
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
        testSEARCH tss = new testSEARCH();
        if(p6jmpMax == 1) {
            //arrI = cMakeMp(lne, pali, sComAr);
            arrI = tss.cMakeMpP58(lne, pali, sComAr,dosMax);
            return arrI;
        } 
        if(p1nSwapsMin > 1) {
            arrI = tss.cMakeMpP58(lne, pali, sComAr,dosMax);
            return arrI;
        } else {
            arrI = tss.cMakeMpP58(lne, pali, sComAr,dosMax);
            return arrI;
        }
    }

}//End class
////(0,1)
