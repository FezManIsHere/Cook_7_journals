/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_7_primes;

/**
 *
 * @author Ramborux
 */
public class Cook_7_primes {

    /**
     * @param args the command line arguments
     */
    boolean isEven (int somenumber) {
        return (somenumber % 2 == 0);
    }
    boolean isOdd (int somenumber) {
        return (somenumber % 2 == 1);
    }
    static boolean isPrime (int somenumber) {
        int divisor = 0;
        for (int i = 2; i < somenumber; i++) {
            if (somenumber % i == 0) {
                divisor += 1;
            }
        }
        return (divisor == 0);
    }




}
