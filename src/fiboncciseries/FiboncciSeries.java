/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fiboncciseries;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author adane
 */
public class FiboncciSeries {

    /**
     * @param args the command line arguments
     */
    private static Map<Integer, Integer> map;

    public static void main(String[] args) {
        // TODO code application logic here

        map = new HashMap<>();
        System.out.println("Fibonacci of 5 is: " + naiveFib(5));
        System.out.println("Fibonacci of 5 is: " + memorizedFib(5));
    }

    public static int naiveFib(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return naiveFib(n - 2) + naiveFib(n - 1);
        }

    }

    public static int memorizedFib(int n) {

        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            if (n == 0 || n == 1) {
                map.put(n, 1);
            } else {
                map.put(n, memorizedFib(n-2) + memorizedFib(n - 1));
            }
        }
        
        return map.get(n);

    }

}
