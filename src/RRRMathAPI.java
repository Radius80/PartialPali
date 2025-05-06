//*******1*********2*********3*********4**********5*********6*********7*********8*********9*********

public class RRRMathAPI {

    /**
     * Finds the harmonic aproximation 1+ 1/ap The more the ap is the closer to
     * 2 it will go with a logarithmic curv I think I think the limit is 2 as ap
     * goes to infinity it is not 1/ap+... it's 1 + 1/ap because the first term
     * is 1/1 Remember that for doubles you have to have at least 1 double in
     * the computation
     *
     * @param ap The aproxamation degree
     * @return Aproximated sum public static double fndHarmonicAprox(int ap) {
     * double sum = 0.0; for (int i = 1; i <= ap; i++) { sum += 1.0 / i; }
     * return sum; }
     */
    /**
     * Factorial This function calculates the factorial for the parameter
     *
     * @param nmToOne n*n-1*n-2 nmToOne is (n-1*n-2)
     * @param smNum2 The number that gets bigger
     * @return smNum2
     */
    public static long zzzFactorialll(long nmToOne, long smNum2) {

        if (nmToOne != 1) {
            nmToOne = nmToOne - 1;
            smNum2 = smNum2 * nmToOne;
            return zzzFactorialll(nmToOne, smNum2);
        } else {
            return smNum2;
        }
    }

    /**
     * It's sort of like factorial but it's not a*(a-1)*... It's a+(a-1)+...
     *
     * @param nmToOne same as numf
     * @param numf the number of which the sequance is to be determined
     * @return Sequence
     */
    public static int zzzPLSFac(int nmToOne, int numf) {
        if (nmToOne != 1) {
            nmToOne = nmToOne - 1;
            numf = numf + nmToOne;
            return zzzPLSFac(nmToOne, numf);
        } else {
            return numf;
        }
    }

    /**
     * It's sort of like factorial but it's not a*(a-1)*... It's a+(a-1)+...
     * till the spesified number
     *
     * @param nmToOne same as numf
     * @param numf the number of which the sequance is to be determined
     * @param stop The value at which the function should stop iterating.
     * @return Sequence
     */
    public static int zzzPLSFcN(int nmToOne, int numf, int stop) {
        if (nmToOne != stop) {
            nmToOne = nmToOne - 1;
            numf = numf + nmToOne;
            return zzzPLSFcN(nmToOne, numf, stop);
        } else {
            return numf;
        }
    }

    /**
     * Cominatorial
     *
     * @param fnA (A choose ..)
     * @param fnB (.. choose B)
     * @return (A choose B)
     */
    public static int zzzAchooseB(int fnA, int fnB) {
        long chooo = 0;
        long f1 = 0, f2 = 0, f3 = 0;
        int choO;
        if (fnB > fnA) {
            return 0;
        } else if (fnB == fnA) {
            return 1;
        } else {
            try {
                f1 = zzzFactorialll((long) fnA, (long) fnA);
                f2 = zzzFactorialll((long) fnB, (long) fnB);
                f3 = zzzFactorialll((long) fnA - fnB, (long) fnA - fnB);
                chooo = (f1) / (f2 * f3);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        choO = (int) chooo;
        return choO;
    }

    /**
     * Returns the abselute value of an integer
     *
     * @param intt the intger without the abselute function on it
     * @return The abselute value of the integer public static int fAbselute(int
     * intt) { if (intt < 0) { return -1 * intt; } else { return intt; } }
     */
//*******1*********2*********3*********4**********5*********6*********7*********8*********9*********
    /**
     * Checks if a integer is a prime First checks if the number is the
     * parameter is less than 2. Remember that negative numbers is not prime.
     * Prime numbers only have two factors. let's take -3. -3's factors are
     * 1,-1,3,-3. There are 4. -1 != 1 and -3 != 3
     *
     * @param pi Interger to be checked
     * @return either true if the integer parameter is a prime number or false
     * if the integer is not a prime public static boolean isPrime(int pi) {
     * boolean iPrim = false; int div = pi; if (div < 2) {
     * iPrim = false;
     * } else {
     * iPrim = true;
     * while (div > 2) { div--; if (pi % div == 0) { iPrim = false; break; } } }
     * return iPrim; }
     */
}
