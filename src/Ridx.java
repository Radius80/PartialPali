public class Ridx {

private Comparable value;
private int Sym;

/**
 * Constructor for indx having class
 */
public Ridx() {
    value = null;
    Sym = 0;
}
/**
 * Set Value
 * @param v value
 */
public void addV(Comparable v, Comparable[] cArr) {
    value = v;
    Sym = (int) cArr[(int) v];

}

/**
 * Get value
 * @return value
 */
public Comparable getV() {
    Comparable dis = value;
    return dis;
}


public static void main(String[] args) {
    
}
}
