public class PPTESTMethods {
    public static void main(String[] args) throws Exception {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        RRRArrayFunctions raf = new RRRArrayFunctions();        
        RRRStringstuffAPI tsapi = new RRRStringstuffAPI();
        int idx = 0;
        int jmPmX = 1;
        //String swpline = "{TACGTACGGCAGCA=[(0,1), (1,2), (2,3), (4,5), (3,4), (5,6), (4,5), (6,7), (5,6)]}";
        //Mapped 1,2,3,4,6,7,0,4,8,9,10,11,12,13
        String line = "TACGTACGGCAGCA";
        String pali = rsapi.mkPali(line, 1);
        String[] arrSwps = new String[line.length()];

        Comparable[] comLines = new Comparable[line.length()];
        comLines = rsapi.flCompa(comLines);
        Comparable[] OKfuckIllSwap = rsapi.flCompa(comLines);        
        Comparable[] mapped = nSwaps(line, pali, comLines);
//////////So the swaps array will have all the swaps and the index concatinated afterwads
        PPTESTMethods qptm = new PPTESTMethods();
        qptm.vPSwp(arrSwps, OKfuckIllSwap, mapped);
//Important vPSwp is void Partial Swap and it edits 2 different arrays
//Namely the Comparable OKfuckIllSwap and the String arrSwaps        
//SORTING SWAP ARRAY
        for(int i = 0; i < arrSwps.length; i ++) {
            int a = Integer.parseInt(arrSwps[i].substring(arrSwps.length-1) + "");
            int b = Integer.parseInt(arrSwps[a].substring(arrSwps.length-1) + "");
            if(a != b) {
                String hold = arrSwps[i];
                arrSwps[i] = arrSwps[b];
                arrSwps[b] = hold;
            }
        }
}
//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111

    /**
     * Does one swap upwards
     * @param com Comparable array
     * @param p1 position that should be swapped
     * @param jMP jump length
     * @return Comparable
     */
    public static Comparable[] swim(Comparable[] com, int p1, int p2, int jMP) {
        RRRSortingAPI sapi = new RRRSortingAPI();
        sapi.exch(com, p1, p1 + jMP);
        return com;
    }

    /**
     * event sink Does one swap downwards
     * I don't want to do all the sinks in one method because the 
     * Indexes has to be recorded and stored in a string array
     * @param com Comparable array
     * @param p2 position that should be swapped
     * @param jMP jump length
     * @return Comparable
     */
    public static Comparable[] evSink(Comparable[] com, int p2, int jMP) {
        RRRSortingAPI sapi = new RRRSortingAPI();
            sapi.exch(com, p2, p2 - jMP);
        return com;
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
        for(int i = 0; i < lne.length(); i ++) {
            pop2 = nspali.charAt(i) + "" ;
            idxx = nsLine.indexOf(pop2); 
            if(idxx != -1) {
                sComAr[i] = idxx;
                nsbLine.setCharAt(idxx, '-');
                nsLine = nsbLine + "";
                swapC = swapC + 1;
            }
            if(swapC > nrSwapsMax) {
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
     * void PARTIAL SWAP 
     * CRUSHIALLY THIS METHOD CHANGES 2 ARRAYS in the client it's called. 
     * It fills the multiples swaps string array with swaps and edits the 
     * comparable array 
     * @param arPSSwp PartialSwap Swap array
     * @param arPSf PartialSwap frustrated comparable array
     * @param arPSMp PartialSwap mapped array
     */
    public void vPSwp(String[] arPSSwp, Comparable[] arPSf, Comparable[] arPSMp) {
        RRRSortingAPI rsapi = new RRRSortingAPI();
        RRRStringstuffAPI tsapi = new RRRStringstuffAPI();
        Comparable[] arIndx = new Comparable[arPSMp.length];
        arIndx = rsapi.flCompa(arIndx);
        int jmPmX = 1;

        Ridx[] arPSidx = new Ridx[arPSMp.length];
        for (int i = 0; i < arPSMp.length; i++) {
            arPSidx[i] = new Ridx();
            arPSidx[i].setI(i);
            arPSidx[i].setV(i);
        }
        
//////////So the swaps array will have all the swaps and the index concatinated afterwads
/// i:      0,1,2,3,4,5,6,7,8,9,10,11,12,13
/// sym:    
/// fd      1|2|3|5|0|6|4|7|8|9|10|11|12|13
///Mapped   1,2,3,5,6,7,0,4,8,9,10,11,12,13
        int i = 0, i2 = 0, diff = 0, p2 = 0, p1 = 0, node = 0, idx = 0;
        while (true) {
            diff = Math.abs((int) arPSMp[i] - (int) arPSf[i]);
            if(diff > 0) {
                node = (int) arPSMp[i]; 
                // Node is the value that should be at i
                if(idx == 5) {
                    idx = 5;
                }

                p2 = (int) arPSf[node];
                p1 = rsapi.MinClamp((p2 - jmPmX),0);
                // |
                // V  v-> void Idx-> Index Plus-> like i++ So it doesn't skip
                idx = vIdxPlus( idx, i);
                idx = rsapi.MaxClamp(idx, arPSSwp.length - 1);
                rsapi.exch(arPSf, p2, p1);
                arPSSwp[i2] = "(" + p1 + "," + p2 + ")->" + idx + "\t";
                i2 = i2 + 1;
                i =  0;
                System.out.println("\n\n" + tsapi.lstTARRAYString(arPSSwp)); 
                System.out.println(rsapi.printCode(arPSf) + "\n\n");
                if(i2 > arPSSwp.length) {
                    break;
                }
            } else if(diff == jmPmX){
                arPSf[i] = arPSMp[i];
            }
            i = i + 1;
            if(i > arPSMp.length) {
                break;
            }
        }
    }
//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//111111

/**
 * Helper method to iterate idx correctly
 * @param ipIdx index
 */
public int vIdxPlus( int ipIdx, int ipI) {
    if (ipIdx == 0 ) {
        ipIdx = ipI + ipIdx;
    } else {
        ipIdx = ipIdx + 1;
    }
    return ipIdx;
}
   



}
