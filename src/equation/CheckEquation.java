/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equation;

/**
 *
 * @author LinhPHSE62696
 */
public class CheckEquation {

    static private int a, b, c;

    public CheckEquation() {
        a = 7;
        b = 7;
        c = 7;
    }

    static public boolean checkEquationIsValid() {
        boolean check = true;
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    check = false;
                }
            }
        } else {
            int delte = b * b - 4 * a * c;
            if (delte < 0) {
                check = false;
            }
        }
        return check;
    }
    
    public static void main(String args[]) {
        System.out.println(checkEquationIsValid());
    }
}
