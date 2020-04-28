package com.github.phuctle.textttt.turniterator;

import java.util.HashSet;
import com.github.phuctle.textttt.winverify.CheckState;

public class TurnChange {
    private char[] xOro = {'x','o'};
    private int[] pos = {-1,-2,-3,-4,-5,-6,-7,-8,-9};
    
    public void turnIterator(char gameBoardOut[]){
        CheckState checkState = new CheckState();
        int posSelectInt;
        HashSet<Integer> numSet = new HashSet<Integer>();
        numSet.add(-1); //preset error value

        for(int turnCounter = 0; turnCounter < 9; turnCounter++){
            System.out.print("Player "+(turnCounter % 2+1)+": "); 
            try {
                String posSelect = System.console().readLine();//reads in userinput
                posSelectInt = Integer.parseInt(posSelect);
            } catch (NumberFormatException e) {
                posSelectInt = -1;//sets the input value to an error value
            }

            if (posSelectInt < 1 || posSelectInt > 9 || numSet.contains(posSelectInt)){//checks to make sure the input 
                System.out.println("Invalid Input. Try again.");//has not been used before and is between 1 and 9
                turnCounter--;//otherwise, forces them to pick again
                continue;}//skips the rest of the loop
            else{
                numSet.add(posSelectInt);
                int posTemp = posSelectInt - 1;//formula to set index of pos variable
                this.pos[posTemp] = turnCounter%2+1;//assigns user selection to position board
                int boardTemp = posTemp*4+1+12*(posTemp/3);//formula to change board state
                gameBoardOut[boardTemp] = this.xOro[turnCounter % 2];
            }

            System.out.println(" ");
            System.out.println(gameBoardOut);

            int retVal = checkState.checkIn(pos);
            if (retVal == 1){
                System.out.println("Player 1 wins!");
                break;
                }
            else if (retVal == 2){
                System.out.println("Player 2 wins!");
                break;
                }
            else if (turnCounter == 8){
                System.out.println("The game is a draw.");
                }
        }
    }
}
