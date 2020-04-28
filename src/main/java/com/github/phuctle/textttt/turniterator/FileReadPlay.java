package com.github.phuctle.textttt.turniterator;

import java.util.HashSet;

import com.github.phuctle.textttt.intro.CreateBlankBoard;
import com.github.phuctle.textttt.winverify.CheckState;

public class FileReadPlay{
    private char[] xOro = {'x','o'};
    private int[] pos = {-1,-2,-3,-4,-5,-6,-7,-8,-9};

    public char[] autoPlay(int[] orderOfPlays) {
        CreateBlankBoard createBoard = CreateBlankBoard.getInstance();
        char[] gameBoardOut = createBoard.getNewBoard();
        CheckState checkState = new CheckState();
        int posSelectInt;
    
            for(int turnCounter = 0; turnCounter < orderOfPlays.length; turnCounter++){

                    posSelectInt = orderOfPlays[turnCounter];

                    int posTemp = posSelectInt - 1;//formula to set index of pos variable
                    this.pos[posTemp] = turnCounter%2+1;//assigns user selection to position board
                    int boardTemp = posTemp*4+1+12*(posTemp/3);//formula to change board state
                    gameBoardOut[boardTemp] = this.xOro[turnCounter % 2];
    
                int retVal = checkState.checkIn(pos);
                if (retVal == 1){
                    System.out.println("Player 1 wins!");
                    break;
                    }
                else if (retVal == 2){
                    System.out.println("Player 2 wins!");
                    break;
                    }
                else if (turnCounter == orderOfPlays.length-1){
                    System.out.println("The game is a draw.");
                    }
            }
            
        return gameBoardOut;
    }
}