package Module3;
/* AND OR NOT
 * exp1         exp2        AND(FAND)   OR(TOR)     NOT
 *  t           t           t           t           t = f
 *  t           f           f           t           f = t
 *  f           t           f           t
 *  f           f           f           f
 */
public class LogicalOperators {
    public static void main(String[] args) {
        boolean bool1 = true, bool2 = false;
        //Logical AND
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));
        //Logical OR
        System.out.println("bool1 || bool2 = " + (bool1 | bool2) );
        //Logical Not
        System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));
    }
}
