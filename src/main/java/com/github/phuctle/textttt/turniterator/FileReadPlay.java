package com.github.phuctle.textttt.turniterator;

import java.util.HashSet;

import com.github.phuctle.textttt.intro.CreateBlankBoard;
import com.github.phuctle.textttt.winverify.CheckState;

public class FileReadPlay{
    private char[] xOro = {'x','o'};
    private int[] pos;
    private int retVal;
    private TurnDataVars varOut =  new TurnDataVars();
    CreateBlankBoard createBoard = CreateBlankBoard.getInstance();

    public TurnDataVars autoPlay(int[] orderOfPlays) {
        
        this.retVal = 0;
        createBoard.createNewPos();
        this.pos = createBoard.getNewPos();
        createBoard.createGameBoard();
        char[] gameBoardOut = createBoard.getNewBoard();
        CheckState checkState = new CheckState();
        int posSelectInt;
    
            for(int turnCounter = 0; turnCounter < orderOfPlays.length; turnCounter++){

                    posSelectInt = orderOfPlays[turnCounter];

                    int posTemp = posSelectInt - 1;//formula to set index of pos variable
                    this.pos[posTemp] = turnCounter%2+1;//assigns user selection to position board
                    int boardTemp = posTemp*4+1+12*(posTemp/3);//formula to change board state
                    gameBoardOut[boardTemp] = this.xOro[turnCounter % 2];

                    //System.out.println(gameBoardOut);
    
                this.retVal = checkState.checkIn(pos);
                if (retVal == 1){
                    this.varOut.addData(this.retVal,gameBoardOut);
                    return varOut;
                    }
                else if (retVal == 2){
                    this.varOut.addData(this.retVal,gameBoardOut);
                    return varOut;
                    }
                else if (turnCounter == 8){
                    this.retVal = -1;
                }

            }
            this.varOut.addData(this.retVal,gameBoardOut);
            
        return this.varOut;
    }

}