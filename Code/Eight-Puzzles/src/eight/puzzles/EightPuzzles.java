/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eight.puzzles;
import java.util.Arrays;
/**
 *
 * @author Khoirul Umam
 */
public class EightPuzzles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] testCase = {3,1,2,0,4,5,6,7,8};
        State s = new State(testCase);
        
        System.out.println("Initial state = " + Arrays.toString(testCase));
    }
    
}
