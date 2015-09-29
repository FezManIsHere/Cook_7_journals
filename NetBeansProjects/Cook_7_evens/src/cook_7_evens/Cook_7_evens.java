/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cook_7_evens;

/**
 *
 * @author Ramborux
 */
public class Cook_7_evens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //int even = 0;
        //int odd = 0;
        for (int i = 0; i < 100; i++){}
            
//            if(i % 2 == 0) {
//                System.out.println(i + " is even");
//                even++;
//            }else{
//                System.out.println(i + " is odd");
//                odd++;
//            }
//            
        
//        System.out.println(even + " numbers are even");
//        System.out.println(odd + " numbers are odd");
            
    /*
        A method is like a little program.
        A mmethod is an action you want to repeat
        frequently.
        */
        
    
    }
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
