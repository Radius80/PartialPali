
public class RRRSortingAPI {
  
    /**
     * Equality condition for comparables
     * @param v first comparable
     * @param w second comparable
     * @return True if equal. False if not equal
     */
    public boolean cEqual(Comparable v, Comparable w) {
        return v.compareTo(w) == 0;        
    }

    public void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void stExch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public String printStr(Comparable[] order, String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output = output + str.charAt((int) order[i]);
        }
        return output;
    }

    public String printCode(Comparable[] order) {
        String output = "";
        for (Comparable order1 : order) {
            output = output + "|" + order1 + "";
        }
        return output;
    }


    public static void doSwaps(String str, Comparable[] pPQ) {
        int pos1;
        int pos2;
        int inx1;
        int inx2;
        int inx3;
        while (!str.equals("}")) {
            inx1 = ((int) str.indexOf("(")) + 1;
            inx2 = ((int) str.indexOf(","));
            inx3 = ((int) str.indexOf(")"));

            pos1 = Integer.parseInt(str.substring(inx1, inx2));
            pos2 = Integer.parseInt(str.substring(inx2 + 1, inx3));
            stExch(pPQ, pos1, pos2);
            str = str.substring(inx3 + 2, str.length());
        }
    }

    /**
     * 
     * This is a function that fills a array with the index squared integers. It
     * comes from an exercise It comes from Algo exer 1.1.10
     *
     * @implNote answer It does not allocate memory for a[] with new. This code
     * results in a variable a might not have been initialized compile-time
     * error 1.1.10 What is wrong with the following code fragment? int[] a; for
     * (int i = 0; i < 10; i++) a[i] = i * i; 
     * @param a integer arrays 
     * @param n length of array
     * @return The pointer to the character array
     */
    public Comparable[] flCompa(Comparable[] a, int n) {
        
        Comparable[] b = new Comparable[n];

        for (int i = 0; i < n; i++) {
            b[i] = i;
        }
        return b;
    }

    /**
     * Does the sorting of the string that was entered. It does not do sorting
     * anymore it just groups all the pares together.
     * The first if is to define if the entered string has an even amount of
     * digits or and odd amount.
     * 
     * @param suiQP QuaziPalindrome
     * @param jMax Jump Maximum length
     * @return Palindrome
     */
    public String mkPali(String suiQP, int jMax) {
        int jumpMax = jMax;
        String tail = "";
        String hold3 = suiQP;
        String revf, revS;
        int idx;
        //find Tail
        if (hold3.length() % 2 != 0) {
            idx = setTail(suiQP);
            tail = suiQP.charAt(idx) + "";
            hold3 = hold3.substring(0, idx)
                    + hold3.substring(idx + 1, hold3.length());
        } else {
            jumpMax++;
        }
        revS = makeSecondHalf3(hold3, jumpMax);
        revf = sReverse(revS);
        return revf + tail + revS;
    }


    /**
     * Does the sorting of the string that was entered. It does not do sorting
     * anymore it just groups all the pares together.
     * 
     * hold3 set to be QP (after the comparable initialisation)
     * So if hold3's string length is an even number all the quantities of
     * the unique letters are grouped to gether in equal groups if one so 
     * chooses to group them. 
     * So the tail in this algorythm is the character that is either in the middle 
     * and occurs an uneven amount if the StringLength is uneven or it is nothing if even
     * because then the palindrome is equal to two equal length strings added with the
     * second half reversed.
     * 
     * The line idx = setTail runs if the QP is NOT equal.
     * 
     * hold3 is then set to QP without the tail. Example: if QP is ACGGTCA tail is T
     * and hold3 just before the else is ACGGCA
     * 
     * JumpLength is then itterated when even because:(don't know yet)
     * 
     * The second half is then made from this hold3 string and then the first
     * half is just the second half reversed. 
     * 
     * The palindrome is then constructed accordingly
     * @param suiQP QuaziPalindrome
     * @param jMn Jump Maximum length
     * @return Palindrome
     */
    public String mkPaliP3(String suiQP, int jMn, int Jmx, int smx) {
        int hjmx = Jmx;
       //test
        if(Jmx <= suiQP.length() ) {
          hjmx = Jmx;
        }

        String tail = "";
        String hold3 = suiQP;
        String revf, revS;
        int idx;
        if (hold3.length() % 2 != 0) {
            idx = setTail(suiQP);
            tail = suiQP.charAt(idx) + "";
            hold3 = hold3.substring(0, idx)
                    + hold3.substring(idx + 1, hold3.length());
        } else {
            hjmx++;
        }
        revS = makeSecondHalf2(hold3, hjmx);
        revf = sReverse(revS);
        return revf + tail + revS;
    }

//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111//111111111

    /**
     * Males the second half if the second half is made it can just use that to
     * make the rest
     *
     * After the integer initialization the half jump length is worked out.
     * EXAMPLE: if jumplength is 4 QP = ACGTGTCA the palindrome is then:
     * ACGTTGCA and the correct second half is TGCA so the jump length should be
     * something like 2 depending on the QP
     * 
     * The QP is then split into 2 equal length parts and their values are coppied
     * to be called again after editing.
     * 
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
     * 
     * else (if that digit occurs more in the first string ):
     * The first half just gets the rep concatenated at left side of the
     * firsthalf string
     * 
     * So then it often performs more actions than the half string are long
     * which is where the jump length should be adjusted accordingly
     * 
     * @param srapiQP Quazipalindrome
     * @param jumMax JumpMax
     * @return Second half;
     */
    public String makeSecondHalf2(String srapiQP, int jumpMax) {
        String firstHalf, holdFrst, scndHalf, holdSecH;
        StringBuilder pop, popf;
        String hold3 = srapiQP;
        //String MaybeSwaps = "";
        char rep;
        int hAmount = 1, fAmount = 0, jumpH, countOPs = 0;
        
        jumpH = (jumpMax / 2) - 1;

        holdFrst = hold3.substring(0, hold3.length() / 2);
        holdSecH = hold3.substring((hold3.length() / 2), hold3.length());
        firstHalf = holdFrst;
        scndHalf = holdSecH;
        while (hAmount != fAmount) {
            rep = scndHalf.charAt(cClamp(jumpH - 1));

            scndHalf = scndHalf.replace(rep + "", "");
            hAmount = Math.abs(holdSecH.length() - scndHalf.length());
            firstHalf = firstHalf.replace(rep + "", "");
            fAmount = Math.abs(holdFrst.length() - firstHalf.length());
            while (fAmount == hAmount && scndHalf.length() > 0) {
                rep = scndHalf.charAt(cClamp(0));
                scndHalf = scndHalf.replace(rep + "", "");
                hAmount = Math.abs(holdSecH.length() - scndHalf.length());
                firstHalf = firstHalf.replace(rep + "", "");
                fAmount = Math.abs(holdFrst.length() - firstHalf.length());
          //      MaybeSwaps = MaybeSwaps + "\n----------------------";
            //    MaybeSwaps = MaybeSwaps + "\n|ff==h: "+ holdFrst.indexOf(rep + "");
              //  MaybeSwaps = MaybeSwaps + "\n|hf==h: "+ holdSecH.indexOf(rep + " ");
            }
            pop = new StringBuilder(holdSecH);
            popf = new StringBuilder(holdFrst);

            if (fAmount < hAmount) {
                pop.setCharAt(cClamp(jumpH - 1), firstHalf.charAt(0));
                holdSecH = pop + "";
                popf.setCharAt(0, rep);
                holdFrst = popf + "";
                firstHalf = holdFrst;
                scndHalf = holdSecH;
            } else if (hAmount > fAmount) {
                firstHalf = rep + firstHalf;
            }
            countOPs ++;
            if (countOPs > holdSecH.length()) {
                jumpH = MinClamp(jumpH -1 , 0);
                countOPs = 0;
                holdFrst = hold3.substring(0, hold3.length() / 2);
                holdSecH = hold3.substring((hold3.length() / 2), hold3.length());
                firstHalf = holdFrst;
                scndHalf = holdSecH;
            }
        }
        //System.out.println(MaybeSwaps);
        //if (jumpH > -1) {
        //} else {
        //    return holdSecH;
        //}
        return holdSecH;
    }


    /**
     * Stops integer from itterating towards a negative number
     * @param j Integer to be clamped
     * @return Either j or 0 depending if j is negative
     */
    public int cClamp(int j) {
        if (j < 0) {
            return 0;
        }
        return j;
    }






    /**
     * This is used so that itterations for arrays don't go out of bounds
     * It clamps a potential large value to a specified maximum
     * @param j itterator
     * @param Max Maximum value
     * @return The maximum between j and Max
     */
    public int MaxClamp(int j, int Max) {
        if(j > Max) {
            j = Max;
        }
        return j;
    }

    /**
     * This is used so that itterations for arrays don't go out of bounds
     * @param j itterator
     * @param Min Minimum value
     * @return The minimum between j and                                                                                                                        Min
     */
    public int MinClamp(int j, int Min) {
        if(j < Min) {
            j = Min;
        }
        return j;
    }


    /**
     * Reveses String
     *
     * @param sHalf String to be reverse
     * @return Reversed String.
     */
    public String sReverse(String sHalf) {
        String output = "";
        for (int i = 0; i < sHalf.length(); i++) {
            output = sHalf.charAt(i) + output;
        }
        return output;
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
        String hold3;
        String hold2 = suiQP;
        String tail = "";
        char rep;
        int sAmount;
        int nN;
        int idx = 0;
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
     * Males the second half if the second half is made it can just use that to
     * make the rest
     *
     * After the integer initialization the half jump length is worked out.
     * EXAMPLE: if jumplength is 4 QP = ACGTGTCA the palindrome is then:
     * ACGTTGCA and the correct second half is TGCA so the jump length should be
     * something like 2 depending on the QP
     * 
     * The QP is then split into 2 equal length parts and their values are coppied
     * to be called again after editing.
     * 
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
     * 
     * else (if that digit occurs more in the first string ):
     * The first half just gets the rep concatenated at left side of the
     * firsthalf string
     * 
     * So then it often performs more actions than the half string are long
     * which is where the jump length should be adjusted accordingly
     * 
     * @param srapiQP Quazipalindrome
     * @param jumMax JumpMax
     * @return Second half;
     */
    public String makeSecondHalf3(String srapiQP, int jumpMax) {
        String firstHalf, holdFrst, scndHalf, holdSecH;
        StringBuilder pop, popf;
        String hold3 = srapiQP;
        //String MaybeSwaps = "";
        char rep;
        int hAmount = 1, fAmount = 0, jumpH, countOPs = 0;
        
        jumpH = (jumpMax / 2) - 1;

        holdFrst = hold3.substring(0, hold3.length() / 2);
        holdSecH = hold3.substring((hold3.length() / 2), hold3.length());
        if(jumpMax < srapiQP.length() - 2 && jumpMax >= holdSecH.length()  ) {
            jumpH = holdSecH.length() - 1;
        }
        
        firstHalf = holdFrst;
        scndHalf = holdSecH;
        while (hAmount != fAmount) {
            rep = scndHalf.charAt(cClamp(jumpH - 1));

            scndHalf = scndHalf.replace(rep + "", "");
            hAmount = Math.abs(holdSecH.length() - scndHalf.length());
            firstHalf = firstHalf.replace(rep + "", "");
            fAmount = Math.abs(holdFrst.length() - firstHalf.length());
            while (fAmount == hAmount && scndHalf.length() > 0) {
                rep = scndHalf.charAt(cClamp(0));
                scndHalf = scndHalf.replace(rep + "", "");
                hAmount = Math.abs(holdSecH.length() - scndHalf.length());
                firstHalf = firstHalf.replace(rep + "", "");
                fAmount = Math.abs(holdFrst.length() - firstHalf.length());
          //      MaybeSwaps = MaybeSwaps + "\n----------------------";
            //    MaybeSwaps = MaybeSwaps + "\n|ff==h: "+ holdFrst.indexOf(rep + "");
              //  MaybeSwaps = MaybeSwaps + "\n|hf==h: "+ holdSecH.indexOf(rep + " ");
            }
            pop = new StringBuilder(holdSecH);
            popf = new StringBuilder(holdFrst);

            if (fAmount < hAmount) {
                pop.setCharAt(cClamp(jumpH - 1), firstHalf.charAt(0));
                holdSecH = pop + "";
                popf.setCharAt(0, rep);
                holdFrst = popf + "";
                firstHalf = holdFrst;
                scndHalf = holdSecH;
            } else if (hAmount > fAmount) {
                firstHalf = rep + firstHalf;
            }
            countOPs ++;
            if (countOPs > holdSecH.length()) {
                jumpH = MinClamp(jumpH -1 , 0);
                countOPs = 0;
                holdFrst = hold3.substring(0, hold3.length() / 2);
                holdSecH = hold3.substring((hold3.length() / 2), hold3.length());
                firstHalf = holdFrst;
                scndHalf = holdSecH;
            }
        }
        //System.out.println(MaybeSwaps);
        //if (jumpH > -1) {
        //} else {
        //    return holdSecH;
        //}
        return holdSecH;
    }
    public static void main(String[] args) {

    }

}
