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
public class State {
    int[] state;
    State up, down, left, right;
    
    private int[] goal = {0,1,2,3,4,5,6,7,8};
    private int zeroPos;
            
    public State(int[] state) {
        this.state = state;
        this.zeroPos = this.findZeroPosition();
        //this.up = this.goUp();
    }
    
    private int findZeroPosition() {
        int i = 0;
        
        while(state[i] != 0) i++;
        
        return i;
    }
    
    private int[] swap(int[] state, int x, int y) {
        int temp = state[x];
        state[x] = state[y];
        state[y] = temp;
        
        return state;
    }
    
    public boolean evaluate() {
        return Arrays.equals(state, goal);
    }
    
    public State goUp() {
        int[] state = this.state;
        
        if(zeroPos >= 3) {
            state = swap(state, zeroPos, zeroPos-3);
            return new State(state);
        }
        else {
            return null;
        }
    }
    
    public State goDown() {
        int[] state = this.state;
        
        if(zeroPos < 6) {
            state = swap(state, zeroPos, zeroPos+3);
            return new State(state);
        }
        else {
            return null;
        }
    }
}
