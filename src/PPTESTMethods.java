
public class PPTESTMethods {

    public static void main(String[] args) throws Exception {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        RRRArrayFunctions raf = new RRRArrayFunctions();
        RRRStringstuffAPI tsapi = new RRRStringstuffAPI();
        int jmPmX = 1;
        //String swpline;
        String line = "TACGTACGGCAGCA";
        String pali = rsapi.mkPali(line, 1);
        String[] arrSwps = new String[line.length()];
        Comparable[] comLines = new Comparable[line.length()];
        comLines = rsapi.flCompa(comLines);
        Comparable[] cmSqSwap = rsapi.flCompa(comLines);
        //cmSqSwap -> Comparable array of sequencial swapping. Sequecial -> 1 by 1
        Comparable[] mapped = nSwaps(line, pali, comLines);        
        PPTESTMethods qptm = new PPTESTMethods();
        qptm.vPSwp(arrSwps, cmSqSwap, mapped);
        
        
        //Important vPSwp is void Partial Swap and it edits 2 different arrays
    }//end main
//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111

    

    /**
     * If you put a value in this new array as an index you will find the index
     * of parameter
     *
     * @param mapped This is a priority que to be augemented.
     * @return An auxiliary array, that will allow you to easily find the index
     * of the value
     * @implNote So if you want the index of where the array is of value 4 you
     * can call SymArray[4] and it will give you the index of where the array is
     * 4
     */
    public static Comparable[] opInverse(Comparable[] mapped) {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        Comparable[] arSym = new Comparable[mapped.length];
        arSym = rsapi.flCompa(arSym);
        for (int i = 0; i < mapped.length; i++) {
            arSym[(int) mapped[i]] = i;
        }
        return arSym;
    }

 
 
    public static Comparable[] nSwaps(String lne, String pali, Comparable[] sComAr) {
        int nrSwapsMax = 91;

        String nspali = pali;
        String nsLine = lne;
        String pop2;

        int idxx = 0;
        int swapC = 0;
        nsLine = SameSame(nsLine, nspali);
        StringBuilder nsbLine = new StringBuilder(nsLine);
        for (int i = 0; i < lne.length(); i++) {
            pop2 = nspali.charAt(i) + "";
            idxx = nsLine.indexOf(pop2);
            if (idxx != -1) {
                sComAr[i] = idxx;
                nsbLine.setCharAt(idxx, '-');
                nsLine = nsbLine + "";
                swapC = swapC + 1;
            }
            if (swapC > nrSwapsMax) {
                return null;
            }
        }
        return sComAr;
    }

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
     * void PARTIAL SWAP CRUSHIALLY THIS METHOD CHANGES 2 ARRAYS in the client
     * it's called. It fills the multiples swaps string array with swaps and
     * edits the comparable array
     *
     * @param arPSSwp PartialSwap Swap array
     * @param arPSS PartialSwap Sequencial comparable array
     * @param arPSMp PartialSwap mapped array
     */
    public void vPSwp(String[] arPSSwp, Comparable[] arPSS, Comparable[] arPSMp) {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        String strMapped = "", strfU = "";
        int jmPmX = 1;
        int i = 0, i2 = 0, diff = 0, p2 = 0, p1 = 0, node = 0;
        while (true) {
            diff = Math.abs((int) arPSMp[i] - (int) arPSS[i]);
            if (diff > 0) {
                node = (int) arPSMp[i];
                while (!rsapi.cEqual(arPSS[i], arPSMp[i])) {
                    p2 = cRank(arPSS, node);
                    p1 = rsapi.MinClamp((p2 - jmPmX), 0);
                    rsapi.exch(arPSS, p2, p1);
                    arPSSwp[i2] = "(" + p1 + "," + p2 + ")->" + i2 + "\t";
                    i2 = i2 + 1;
                }
                strfU = rsapi.printCode(arPSS);
                strMapped = rsapi.printCode(arPSMp);
                if (strfU.equals(strMapped)) {
                    break;
                }
            } else if (diff == jmPmX) {
                arPSS[i] = arPSMp[i];
            }
            i++;
        }
    }//endVswp    

//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//111111

public int cRank(Comparable[] carr, int value) {
    int count = 0;
    while(value != (int) carr[count]) {
        count++;
    }
    return count;
}
    


}//End class
////(0,1)
        //Comparable[] cmGridPrint = rsapi.flCompa(comLines);
        //System.out.println(rsapi.printCode(cmGridPrint));
        //swpline = "{TACGTACGGCAGCA=[(0,1)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
        ////(1,2)        
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
        ////(2,3)
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
        ////(4,5)
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
        ////(3,4)
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5), (3,4)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
//
        ////(5,6)
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5), (3,4), (5,6)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
//
//
        ////(4,5)
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5), (3,4), (5,6), (4,5)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
//
//
        ////(6,7)
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5), (3,4), (5,6), (4,5), (6,7)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
//
//
        ////(5,6)
        //cmGridPrint = rsapi.flCompa(comLines);
        //swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5), (3,4), (5,6), (4,5), (6,7), (5,6)]}";
        //rsapi.doSwaps(swpline, cmGridPrint);
        //System.out.println(rsapi.printCode(cmGridPrint));
        //

        //while (true) {
        //    diff = Math.abs((int) arPSMp[i] - (int) arPSS[i]);
        //    if(diff > 0) {
        //        node = (int) arPSMp[i]; 
        //        // Node is the value that should be at i
        //        p2 = (int) arSym[node];
        //        p1 = rsapi.MinClamp((p2 - jmPmX),0);
        //        // |
        //        // V  v-> void Idx-> Index Plus-> like i++ So it doesn't skip
        //        idx = vIdxPlus( idx, i);
        //        idx = rsapi.MaxClamp(idx, arPSSwp.length - 1);
        //        rsapi.exch(arPSS, p2, p1);
        //        arSym = opInverse(arPSS);
        //        arPSSwp[i2] = "(" + p1 + "," + p2 + ")->" + idx + "\t";
        //        i2 = i2 + 1;
        //        System.out.println("\n\n" + tsapi.lstTARRAYString(arPSSwp)); 
        //        strfU = rsapi.printCode(arPSS);
        //        strMapped = rsapi.printCode(arPSMp);
        //        if(strfU.equals(strMapped)) {
        //            break;
        //        }
        //    } else if(diff == jmPmX){
        //        arPSS[i] = arPSMp[i];
        //    }
        //    i = i + 1;
        //    if(i > arPSMp.length) {
        //        break;
        //    }
        //}

///**
    // * void PARTIAL SWAP CRUSHIALLY THIS METHOD CHANGES 2 ARRAYS in the client
    // * it's called. It fills the multiples swaps string array with swaps and
    // * edits the comparable array
    // *
    // * @param arPSSwp PartialSwap Swap array
    // * @param arPSS PartialSwap Sequencial comparable array
    // * @param arPSMp PartialSwap mapped array
    // */
    //public void vPSwp(String[] arPSSwp, Comparable[] arPSS, Comparable[] arPSMp) {
    //    RRRSortingAPI rsapi = new RRRSortingAPI();
    //    RRRStringstuffAPI tsapi = new RRRStringstuffAPI();
    //    Comparable[] arSym = new Comparable[arPSMp.length];
    //    String strMapped = "", strfU = "";
    //    arSym = rsapi.flCompa(arSym);
    //    int jmPmX = 1;
    //    //So the swaps array will have all the swaps and the index concatinated afterwads
    //    int i = 0, i2 = 0, diff = 0, p2 = 0, p1 = 0, node = 0;
    //    while (true) {
    //        diff = Math.abs((int) arPSMp[i] - (int) arPSS[i]);
    //        if (diff > 0) {
    //            node = (int) arPSMp[i];
    //            while (!rsapi.cEqual(arPSS[i], arPSMp[i])) {
    //                p2 = (int) arSym[node];
    //                p1 = rsapi.MinClamp((p2 - jmPmX), 0);
    //                rsapi.exch(arPSS, p2, p1);
    //                arSym = opInverse(arPSS);
    //                arPSSwp[i2] = "(" + p1 + "," + p2 + ")->" + i2 + "\t";
    //                i2 = i2 + 1;
    //            }
    //            //Idea to replace this ^^ i-- instead of nested
    //            strfU = rsapi.printCode(arPSS);
    //            strMapped = rsapi.printCode(arPSMp);
    //            if (strfU.equals(strMapped)) {
    //                //System.out.println(tsapi.lstTARRAYString(arPSSwp));
    //                break;
    //            }
    //        } else if (diff == jmPmX) {
    //            arPSS[i] = arPSMp[i];
    //        }
    //        i++;
    //    }
    //}//endVswp