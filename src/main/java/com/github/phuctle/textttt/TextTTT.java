package com.github.phuctle.textttt;

import com.github.phuctle.textttt.intro.Intro;
import com.github.phuctle.textttt.turniterator.TurnChange;

public class TextTTT {
    public static void main(String[] args) {
   
        //instructions for game
        Intro intro = new Intro();
        char[] gameBoardOut = intro.runIntro();//creates gameboard

        //runs the game
        TurnChange turnChange = new TurnChange();
        turnChange.turnIterator(gameBoardOut);
        
}
}