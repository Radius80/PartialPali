/*************************************************************************
 *  Object that does the errorChecking of the the project
 *  Author: Darius Becker
 *  Authot student number: 22006710
 *************************************************************************/
public class PPERROR {

    private String type;
    private String expected;
    private String found;
    private int minimum;
    private String maximum;
    private String[] argsfmm;
    private TemplateENUM tttm;

    enum TemplateENUM {
        Generic, AtLeast, Atmost, Range, Correct
    };

    /**
     * Contructor that "initializes" Error
     *
     * @param argsfm - arguments from main
     */
    public PPERROR(String[] argsfm) {
        tttm = TemplateENUM.Correct;
        int n = argsfm.length;
        argsfmm = new String[n];
        for (int i = 0; i < n; i++) {
            //I think you have array API for this    
            argsfmm[i] = argsfm[i];
        }
    }

    /**
     * * Errors before the error checking
     * @param line String line
     * @param pss The parameter split stuff
     * @return The parameter split array
     */
    public boolean chBeforePE(String line, String[] pss) {
        boolean output = false;
        output = chEmptyParameter(line);
        if (output) {
            return output;
        }

        output = strBeforePara(line);
        if (output) {
            return output;
        }

        output = chAmountPara(pss.length);
        if (output) {
            return output;
        }

        return output;
    }

    /**
     * Check the parameter errors
     * @param line The Quazipalindrome line
     * @param sqp The QPsearchManeger object
     * @return True if the parameter are valid, false if otherwise
     */
    public boolean chPrmErros(String line, PPSEARCH sqp) {
        boolean output = false;
        int gmx = 0;
        int gmn = 0;
        int aPmx = 0;
        int sl = 0;
        // gmx - > given max
        // gmn - > given min
        // aPmx -> Actual Possible Max
        // sl - > String length

        sl = sqp.getStringLength();

        gmn = sqp.getNrSwapsMin();

        output = chNbrSwapsMinEOne(sqp.getNrSwapsMin());
        if (output) {
            return output;
        } else {
        output = chSWAPMAXlessthanSWAPMIN(sqp.getNrSwapsMax(), sqp.getNrSwapsMin());
        if (output) {
            return output;
        } else {
        gmx = sqp.getNrSwapsMax();
        aPmx = sqp.getMaxPossibleSwaps();
        output = swpMaxGreaterMax(gmx, aPmx);
        if (output) {
            return output;
        } else {

        gmn = sqp.getSublenMin();
        output = sbLenMinLessThanThree(gmn);
        if (output) {
            return output;
        } else {
        gmx = sqp.getSubLenMax();
        gmn = sqp.getSublenMin();
        output = chSUBLenMAXlessSUBLenMin(gmx, gmn);
        if (output) {
            return output;
        } else {
        
        gmx = sqp.getSubLenMax();
        aPmx = sqp.getMaxPossibleSublen();
        output = sbLenMaxGreaterThanMax(gmx, aPmx);
        if (output) {
            return output;
        } else {
        gmn = sqp.getJumpMin();
        output = jmpMINLessThanOne(gmn);
        if (output) {
            return output;
        } else {
        
        gmx = sqp.getJumpMax();
        output = jmpMaxlessThanJumpMin(gmx, gmn);
        if (output) {
            return output;
        } else {
        aPmx = sqp.getMaxPossibleJumps();
        output = jmpMaxGreaterThanMax(gmx, aPmx);
        if (output) {
            return output;
        } else {
            sl = sqp.getStringLength();
        output = strLengthLessThanThree(sl);
        if (output) {
            return output;
        }
        }

        
        }

        

        }

        
        }

        
        }

        
        }

        
        }

        
        }
        
        }
        
        return false;
    }

    /**
     * Does the String error
     *
     * @param sqp QPsearch manager so the parameters can be evaluated
     * @param line The input from the user
     * @return True if the string phaze is wrong and false otherwise
     */
    public boolean strEE(PPSEARCH sqp, String line) {
        boolean s1 = false;
        if (strLengthIslying(line.length(), sqp.getStringLength())) {
            s1 = true;
        } else if (ntAlphabetic(line)) {
            s1 = true;
        } else {
            s1 = false;
        }
        return s1;
    }
//------I'm calling these instance booleans---------------------------------------------|    

    /**
     * Checks is the command lines are valid or not
     *
     * @return true if the command lines are valid, false otherwise
     */
    public boolean chCorrectCommandLines() {
        int n = argsfmm.length;
        if (n != 1) {
            tttm = TemplateENUM.Generic;
            type = "arguments";
            expected = "1";
            found = "" + n;
            return true;
        } else if (!(argsfmm[0].equals("search") || argsfmm[0].equals("generate"))) {
            tttm = TemplateENUM.Generic;
            type = "arguments";
            expected = "'search' or 'generate'";
            found = "'" + argsfmm[0] + "'";
            return true;
        }
        return false;
    }

    /**
     * This method will check if the input is an empty line, also checks if
     * there are to little parameters ERROR 3 // 3.7.3
     *
     * @param sIn line in standardIn
     * @return true if empty line or false if no empty line
     */
    public boolean chEmptyParameter(String sIn) {
        try {
            if (sIn.equals("")) {
                tttm = TemplateENUM.Generic;
                type = "parameters";
                expected = "input";
                found = "nothing";
                return true;
            }
        } catch (Exception e) {
            //System.out.println(e + "");
            if (sIn == null) {
                tttm = TemplateENUM.Generic;
                type = "parameters";
                expected = "input";
                found = "nothing";
                return true;
            }
        }
        return false;
    }

    /**
     * Error 4 Check if first stream of characters are not the integers. I will
     * make this function handle more errors as I believe it's hard to read
     * functions that only have one line in them. 3.7.4
     *
     * @param sIn Standard in Line
     * @return true if string is entererd where the paramers should be
     */
    public boolean strBeforePara(String sIn) {
        try {
            if ((PPERROR.strNoACGT(sIn).equals(""))) {
                tttm = TemplateENUM.Generic;
                type = "parameters";
                expected = "search parameters";
                found = sIn;
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    /**
     * Check error // 3.7.5
     *
     * @param n length
     * @return true amount of parameters is less than 7
     */
    public boolean chAmountPara(int n) {
        if (n < 7) {
            tttm = tttm.AtLeast;
            type = "parameters";
            minimum = 7;
            found = "" + n;
            return true;
        }
        return false;
    }

    /**
     * // 3.7.6 Check error
     *
     * @param nrSwapsMin the minimum number of swaps
     * @return true if number swaps is less than 1
     */
    public boolean chNbrSwapsMinEOne(int nrSwapsMin) {
        if (nrSwapsMin < 1) {
            tttm = tttm.AtLeast;
            type = "number of swaps";
            minimum = 1;
            found = "" + nrSwapsMin;
            return true;
        }
        return false;
    }

    /**
     * //3.7.7 Check error
     *
     * @param mx nrSwapMax from QP class
     * @param mn nrSwapMax from QP class
     * @return true if swap max is less than swap min
     */
    public boolean chSWAPMAXlessthanSWAPMIN(int mx, int mn) {
        if (mx < mn) {
            tttm = tttm.Range;
            type = "number of swaps";
            minimum = mn;
            maximum = "" + mx;
            return true;
        }
        return false;
    }

    /**
     * swpMaxGreaterThanMax instance boolean function for errors // 3.7.8
     *
     * @implNote I think max is worked out by integer division minus 1. We'll
     * see if it works
     *
     * @param nrSwapsMax current value
     * @param mx Calculated value from SearcManager
     * @return true if nrSwapMax is greater than max
     */
    public boolean swpMaxGreaterMax(int nrSwapsMax, int mx) {
        if (nrSwapsMax > mx) {
            tttm = tttm.Atmost;
            type = "number of swaps";
            maximum = mx + "";
            found = "" + nrSwapsMax;
            return true;
        }
        return false;
    }

    /**
     * Check error // 3.7.9
     *
     * @param sublenMin This is the int min sub string length
     * @return true if subLenmin is less than 3
     */
    public boolean sbLenMinLessThanThree(int sublenMin) {

        if (sublenMin < 3) {
            tttm = tttm.AtLeast;
            type = "substring length";
            minimum = 3;
            found = "" + sublenMin;
            return true;
        }
        return false;
    }

    /**
     * Check error // 3.7.10
     *
     * @param subLenMax Max integer messured length of substring
     * @param sublenMin This is the int min sub string length
     * @return true if sublenMax is less than sublenMin
     */
    public boolean chSUBLenMAXlessSUBLenMin(int subLenMax, int sublenMin) {
        if (subLenMax < sublenMin) {
            tttm = tttm.Range;
            type = "substring length";
            minimum = sublenMin;
            maximum = "" + subLenMax;
            return true;
        }
        return false;
    }

    /**
     * The maximum determined from the (strLength-sublenMin)/2 It's not
     * sublenMax as then there would be a value possible more // 3.7.11
     * Shellsort order complexity not need to know memory doesn't need to know
     *
     * @param subLenMax The maximum length of a substring
     * @param possibleSubMax The maximum possible value.
     * @return true is subLenMax is greater than max
     */
    public boolean sbLenMaxGreaterThanMax(int subLenMax, int possibleSubMax) {
        if (subLenMax > possibleSubMax) {
            tttm = tttm.Atmost;
            type = "substring length";
            maximum = possibleSubMax + "";
            found = "" + subLenMax;
            return true;
        }
        return false;
    }

    /**
     * Check error // 3.7.12
     *
     * @param jumpMin the minimum amount of jumps
     * @return true is jump min is less than 1
     */
    public boolean jmpMINLessThanOne(int jumpMin) {
        if (jumpMin < 1) {
            tttm = tttm.AtLeast;
            type = "jump size";
            minimum = 1;
            found = "" + jumpMin;
            return true;
        }
        return false;
    }

    /**
     * Check error // 3.7.13
     *
     * @param jumpMax the maxinum number of jumps
     * @param jumpMin the minimum amount of jumps
     * @return true is Jump Max is less than jump min
     */
    public boolean jmpMaxlessThanJumpMin(int jumpMax, int jumpMin) {
        if (jumpMax < jumpMin) {
            tttm = tttm.Range;
            type = "jump size";
            minimum = jumpMin;
            maximum = "" + jumpMax;
            return true;
        }
        return false;
    }

    /**
     * checks if JumpMax is greater than it possibly can be.
     *
     * @param givenMax
     * @param possibleMax
     * @return true is Jump Max is equal or more than strLength
     */
    public boolean jmpMaxGreaterThanMax(int givenMax, int possibleMax) {

        if (givenMax > possibleMax) {
            tttm = tttm.Atmost;
            type = "jump size";
            maximum = possibleMax + "";
            found = "" + givenMax;
            return true;
        }
        return false;
    }

    /**
     * Check error // 3.7.15
     *
     * @param stringLength The length of the string
     * @return true if Length is less than 3
     */
    public boolean strLengthLessThanThree(int stringLength) {
        if (stringLength < 3) {
            tttm = tttm.AtLeast;
            type = "string length";
            minimum = 3;
            found = "" + stringLength;
            return true;
        }
        return false;
    }

    /**
     * Check error // 3.7.16
     *
     * @param sIn int value of parameter str lenths
     * @param sl Actual string length
     * @return true if strLength does not equal the length of String
     */
    public boolean strLengthIslying(int sIn, int sl) {
        try {
            if (!(sIn == sl)) {
                tttm = TemplateENUM.Generic;
                type = "search string length";
                expected = "" + sl;
                found = "" + sIn;
                return true;
            }

        } catch (Exception e) {
            return false;
        }
        return false;
    }

    /**
     * Check error // 3.7.17
     *
     * @param sIn line in standardIn
     * @return true if anything else than A C G T in the string
     */
    public boolean ntAlphabetic(String sIn) {
        try {
            String nothingSS = PPERROR.strNoACGT(sIn);
            //Nothing string
            if (!(nothingSS.equals(""))) {
                tttm = TemplateENUM.Generic;
                String inval = nothingSS;
                type = "character";
                expected = "'A, C, G or T'";
                found = "'" + inval + "'";
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }

    /**
     * Checks if the string enter is in parameter format loosely
     * @param line The entered line
     * @return The line that would be outputted
     */
    public boolean isParamSequence(String line) {
        String jNumbers = line.replace(" ", "");
        boolean isP;
        int isInt;
        try {
            isInt = Integer.parseInt(jNumbers) + 1;
            isP = true;
            return isP;
        } catch (Exception e) {
            isP = false;
            return isP;
        }
    }
//_________END INSTANCE BOOLEANS_____________________________________ |

    /**
     * This function will check is the string in it's arguments contains no
     * ellements the aplindrome format
     *
     * @param cmddd This tring will either be nonsense the parameter line or the
     * palendrome.
     * @implNote The function will be used to check error 3.7.4 but will true if
     * there isn't so use !StrOnlyACGT if you want the input to be not
     * that.(3.7.4 forth error)
     * @implNote Optional speed optimization. Maybe I don't have to use this
     * many or's in the if
     * @implNote System.out.println(eqp.strNoACGT("1 -1 3 -1 1 -1 5")); prints
     * true and that's what we want
     * @return true if the string only contains no QP letters, False if it
     * contains any other. This can straight up be 3.7.4's
     */
    public static String strNoACGT(String cmddd) {
        String invall = cmddd;
        invall = cmddd.replaceAll("A", "");
        invall = invall.replaceAll("C", "");
        invall = invall.replaceAll("G", "");
        invall = invall.replaceAll("T", "");
        return invall;
    }

    /**
     *
     * This puts the string together and prints out to system.err I forgot why I
     * called it pse. s is maybe for string?
     */
    public void pseRR() {
        String print1 = "";
        if (tttm == tttm.Generic) {
            print1 = print1 + "Invalid " + type + ": expected ";
            print1 = print1 + expected + ", found " + found;
            System.err.println(print1);
        }
        if (tttm == tttm.AtLeast) {
            print1 = print1 + "Invalid " + type + ": expected at least ";
            print1 = print1 + minimum + ", found " + found;
            System.err.println(print1);
        }
        if (tttm == tttm.Atmost) {
            print1 = print1 + "Invalid " + type + ": expected at most ";
            print1 = print1 + maximum + ", found " + found;
            System.err.println(print1);
        }
        if (tttm == tttm.Range) {
            print1 = print1 + "Invalid " + type + ": ";
            print1 = print1 + minimum + " must be less than " + maximum;
            System.err.println(print1);
        }

    }

}
