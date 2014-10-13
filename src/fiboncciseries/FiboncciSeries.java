/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiboncciseries;

/**
 *
 * @author adane
 */
public class FiboncciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public static int naiveFib(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return naiveFib(n - 2) + naiveFib(n - 1);
        }

    }

}
