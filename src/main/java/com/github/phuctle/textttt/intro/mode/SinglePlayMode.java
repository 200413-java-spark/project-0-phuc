package com.github.phuctle.textttt.intro.mode;

import com.github.phuctle.textttt.intro.CreateBlankBoard;
import com.github.phuctle.textttt.turniterator.TurnChange;

public class SinglePlayMode {
    public void runOnce(){
        CreateBlankBoard board = CreateBlankBoard.getInstance();
        char[] gameBoardOut = board.getNewBoard();
        System.out.println(gameBoardOut);
        
        TurnChange turnChange = new TurnChange();
        turnChange.turnIterator(gameBoardOut);
    }
}