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

    private static Map<Integer, Integer> map;

    public static void main(String[] args) {
        // TODO code application logic here

        map = new HashMap<>();
        System.out.println("Fibonacci of 5 is: " + bruteForceFib(5));
        System.out.println("Fibonacci of 5 is: " + memorizedFib(5));
        System.out.println("Fibonacci of 5 is: " + fib(5));
    }

    public static int bruteForceFib(int n) {

        // This method is greedy in nature
        if (n == 0 || n == 1) {
            return n;
        } else {
            return bruteForceFib(n - 2) + bruteForceFib(n - 1);
        }

    }

    public static int memorizedFib(int n) {

        if (map.containsKey(n)) {
            return map.get(n);
        } else {
            if (n == 0) {
                map.put(n, 0);
            } else if (n == 1) {
                map.put(n, 1);
            } else {
                map.put(n, memorizedFib(n - 2) + memorizedFib(n - 1));
            }

        }

        return map.get(n);

    }

    public static int fib(int n) {

        int val = 1;
        int prev = 0;

        return fib(n, val, prev);

    }

    private static int fib(int term, int val, int prev) {
        if (term == 0) {
            return prev;
        }
        if (term == 1) {
            return val;
        }
        return fib(term - 1, val + prev, val);
    }

}
