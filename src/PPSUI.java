
/**
 * ***********************************************************************
 * Object that does the search functionality of the the project
 * The QPguiStream is basically just so that the style test can work
 * This I planned to do in public and this class will only be used
 * in the QP class
 * javac -d bin src/*.java
 * java -cp bin QP search
 * Author: Darius Becker
 * Authot student number: 22006710
 * python3 -m venv .venv
 * source .venv/bin/activate
 * pip install -r requirements.txt
 *
 * test stuff
 */
public class PPSUI {

    public boolean p1;
    public boolean s1;
    private String[] ps;
    public PPERROR eqp;
    public PPSEARCH sqp;
    private String qpLine;
    private String[] swpPos;

    private enum GUIstates {
        ParameterEnter, StringEnter1, StringEnter2, Skip
    }

    /**
     * contructor that will do most of the error checking so that the 100 limit
     * won't be overstepped To save memory I'm not going to make variables for
     * all of the parameters but reasign them each time I would have liked to
     * keep the discrptions in the ifs but google thinks it's to long
     */
    public PPSUI() {
        p1 = true;
        s1 = false;
        eqp = null;
        sqp = null;
        qpLine = "";
    }
//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//11111111//111111

    /**
     * Does all the UI for the search part of the project
     *
     * @param line the line initially entered by the player
     * @param eqpp errorHandler
     */
    public void midTermUI(String line, PPERROR eqpp) {
        qpLine = line;
        boolean nxtLIIIIINE = true;
        GUIstates stGUIS = GUIstates.ParameterEnter;
        eqp = eqpp;

        do {
            if (!(stGUIS == GUIstates.Skip)) {
                qpLine = readNonComment();
            } else {
                stGUIS = GUIstates.ParameterEnter;
            }

            if (stGUIS == GUIstates.ParameterEnter) {
                /*Bookmark2 ParamEnter */
                ps = qpLine.split(" ");
                if (canParam(qpLine, eqp, ps)) {
                    /*Bookmark1 do */
                    sqp = new PPSEARCH(ps);
                    if (!eqp.chPrmErros(qpLine, sqp)) {
                        //p1 succesful
                        sqp.setSubs();
                        StdOut.println(sqp);
                        stGUIS = stGUIS.StringEnter1;
                    } else {
                        //p1 unsuccesful
                        //p1 param ERROR
                        eqp.pseRR();
                    }
                }
            } else if (stGUIS == GUIstates.StringEnter1) {
                /*Bookmark3 String enter */
                if (eqp.strEE(sqp, qpLine)) {
                    //p2 unsuccesful
                    //STRING ERROR
                    eqp.pseRR();
                } else {
                    //p2 succesful
                    StdOut.println(hsTosubstring(qpLine));
                    stGUIS = GUIstates.StringEnter2;
                }
            } else if (stGUIS == GUIstates.StringEnter2) {
                /*Bookmark4 StringEnter2 */
                //p3
                if (eqp.isParamSequence(qpLine)) {
                    //p3 succesful
                    stGUIS = GUIstates.Skip;
                } else if (eqp.strEE(sqp, qpLine)) {
                    eqp.pseRR();
                } else {
                    StdOut.println(hsTosubstring(qpLine));
                }
            }
        } while (StdIn.hasNextLine());
    }

    /**
     * Test if the program has to do substrings to run
     *
     * @param qpUILine Potential QuaziPalindrome
     * @return Formatted output
     */
    public String hsTosubstring(String qpUILine) {
        RRRArrayFunctions raf = new RRRArrayFunctions();
        RRRSortingAPI rsapi;
        String sor = "", makePali = "";
        String output = "";
        int jMx = 1;        
        boolean swpEnough, lnthThr, isPali, subLsuf;

        Comparable[] comArr = new Comparable[qpUILine.length()];

        sqp.sortStr(qpUILine);
        sor = sqp.getSorted();
        lnthThr = qpUILine.length() == 3;

        if (sqp.isQP(sor)) {
            rsapi = new RRRSortingAPI();
            jMx = sqp.getJumpMax();
            makePali = rsapi.mkPali(qpUILine, jMx);
            comArr = raf.flCompa(comArr);
            isPali = qpUILine.equals(makePali);

            swpEnough = sqp.numberSwaps(qpUILine, makePali, comArr);
            subLsuf = sqp.getSubLenMax() == qpUILine.length() && !lnthThr;
            //if (sqp.isQP(sor) && !isPali && swpEnough && !subLsuf) {
            if (!isPali && swpEnough && !subLsuf) {
                //output = "{" + doSEARCH(qpUILine, comArr) + "}";
                return "{" + doSEARCH(qpUILine, comArr) + "}";
            } else {
                if (lnthThr || isPali) {
                    return "{}";
                }
                output = doSubsSearch(qpUILine);
            }
        } else {
            if (lnthThr) {
                return "{}";
            }
            output = doSubsSearch(qpUILine);
        }
        return output;
    }

    /**
     * Does the search function with sub string functionality
     *
     * @param qpLines Quazi palindrome
     * @return A string of what should be outputted
     */
    public String doSubsSearch(String qpLines) {
        RRRArrayFunctions rafSub = new RRRArrayFunctions();
        String searchSubs = "";
        String[] subs;
        int j = 0;
        int mxSS = sqp.gtSubsMax();

        Comparable[] comArr;

        subs = sqp.getSubs(qpLines);
        swpPos = new String[subs.length];

        for (int i = 0; i < mxSS; i++) {
            comArr = new Comparable[subs[i].length()];
            comArr = rafSub.flCompa(comArr);
            searchSubs = doSEARCH(subs[i], comArr);
            if (!searchSubs.equals("")) {
                swpPos[j] = searchSubs;
                j++;
            }
        }
        if (j > 0) {
            return printSwapOutput(j);
        }
        return "";
    }

    /**
     * Prints formatted sub results Remember that the for loop starts at 1 and
     * Swaps[0] is put into position 0
     *
     * @param pJ the number of swaps calculated.
     * @return Formatted output
     */
    private String printSwapOutput(int pJ) {
        boolean srt;
        String output = swpPos[0] + ", ";
        if (pJ == 1) {
            output = output.substring(0, output.length() - 2);
            return "{" + output + "}";
        }
        for (int i = 1; i < pJ; i++) {
            srt = swpPos[i].charAt(0) < output.charAt(1);
            if (srt) {
                output = swpPos[i] + ", " + output;
            } else {
                output = output + swpPos[i] + ", ";
            }
        }

        output = output.substring(0, output.length() - 2);
        return "{" + output + "}";
    }

    /**
     * Do the actual Search that I never get to because the gui is taking all my
     * time
     *
     * @param line The QuaziPalendrome
     * @param comArr The Priority que for swapping
     * @return Formatted output
     */
    public String doSEARCH(String line, Comparable[] comArr) {
        RRRArrayFunctions zaf = new RRRArrayFunctions();
        RRRSortingAPI rsapi;
        String makePali = "";
        String output = "", sor = "";
        int jMx = 1;        
        sqp.sortStr(line);
        sor = sqp.getSorted();
        char[] chIIArr = new char[line.length()];
        boolean swpEnough;

        if (sqp.isQP(sor)) {
            rsapi = new RRRSortingAPI();
            jMx = sqp.getJumpMax();
            makePali = rsapi.mkPali(line, jMx);
            chIIArr = null;
            chIIArr = zaf.fillchar(chIIArr, line.length());
            swpEnough = sqp.numberSwaps(line, makePali, comArr);
            //If there is to many swaps it should not do the search
            if (!makePali.equals(line) && swpEnough) {
                output = sqp.getpositionsSwaps(line, makePali, comArr);
            }
        }
        return output;
    }

    /**
     * This is where the project is supposed to do the thing where it catches
     * all the cases where the first parameter is not in the form int1 int2 int3
     * int4 int5 int6 inty7
     *
     * @param line The QuaziPalindrome
     * @param eqpp The QPerrorHandling object
     * @param pss The string splitted into parameters
     * @return True if the parameters are value, false if not
     */
    public boolean canParam(String line, PPERROR eqpp, String[] pss) {
        qpLine = line;
        boolean cPRM = false;
        boolean nxtLIIIIINE = true;
        //while(line.substring(0,1).equals("#") || StdIn.hasLine() ) {
        do {
            if (eqp.chBeforePE(qpLine, pss)) {
                eqp.pseRR();
            } else {
                cPRM = true;
                break;
            }
            qpLine = readNonComment();
            nxtLIIIIINE = !qpLine.equals("------------");
            pss = qpLine.split(" ");
            ps = pss;
        } while (nxtLIIIIINE);
        return cPRM;
    }

    /**
     * get check if the next stage should be initiated
     *
     * @return true if the letters are expected, false if not
     */
    public boolean getP1() {
        return p1;
    }

    /**
     * read a line that does not have a sharp in front of it
     *
     * @return the line that does not have a sharp in front of it
     */
    public String readNonComment() {
        String output = "";
        output = StdIn.readLine();
        while (output.substring(0, 1).equals("#")) {
            output = StdIn.readLine();
        }
        return output;
    }

}
