//
/** ***********************************************************************************************
 *  Author: Darius Becker
 *  Authot student number: 22006710
 ************************************************************************************************ */
public class PP {

    /**
     * The main Quazi Palandrome method DO NOT USE EXIT method here
     *
     * @param args
     */
    public static void main(String[] args) {
        String line = "";
        //System.out.println(p1);
        int iOne = 0;
        int iTwo = 0;
        String[] ps = null;
        PPERROR eqp = new PPERROR(args);
        PPSEARCH sqp = null; //sqp searchQP
        PPSUI sui = null;
        boolean s1 = false, s2 = false; // string booleanl
        boolean nxtLIIIIINE = true;
        if (!eqp.chCorrectCommandLines()) {
            sui = new PPSUI();
            sui.midTermUI(line, eqp);
        } else {
            eqp.pseRR();
        }
    }
}     
//class end testUI
