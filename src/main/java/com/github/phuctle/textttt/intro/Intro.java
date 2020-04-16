package com.github.phuctle.textttt.intro;

public class Intro {
    public char[] runIntro(){

    System.out.println("\nTic-Tac-Toe\nFirst player inputs a number to");
    System.out.println("select where to place the first x.");

    String row1 = " 1 | 2 | 3 \n";
    String row2 = "-----------\n";
    String row3 = " 4 | 5 | 6 \n";
    String row4 = "-----------\n";
    String row5 = " 7 | 8 | 9 \n";
    String gameBoardStr = row1+row2+row3+row4+row5;
    
    //creating a character array
    char[] gameBoardOut= new char[gameBoardStr.length()];
    int strLength = gameBoardStr.length();
    //duplicating the string into the char array
    for(int i = 0; i <strLength; i++){
        gameBoardOut[i] = gameBoardStr.charAt(i);
    }
    
    System.out.print(gameBoardOut);
    return gameBoardOut;
    }
}