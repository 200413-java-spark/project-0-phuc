package com.github.phuctle.textttt;

import com.github.phuctle.textttt.intro.Intro;
import com.github.phuctle.textttt.intro.mode.ReadFromFileMode;
import com.github.phuctle.textttt.intro.mode.SinglePlayMode;

public class TextTTT {
    public static void main(String[] args) {
   
        //instructions for game
        Intro intro = new Intro();
        String userChoice = intro.runIntro();//creates gameboard 

        if (userChoice.equals("1")){
        //runs the game
            SinglePlayMode playOnce = new SinglePlayMode();
            playOnce.runOnce();
        }
        else if (userChoice.equals("2")){
            ReadFromFileMode readFile = new ReadFromFileMode();
            readFile.readFromFile();
        }
    }
}